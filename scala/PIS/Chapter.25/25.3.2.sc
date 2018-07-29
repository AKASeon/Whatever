
abstract class Base
case object A extends Base
case object C extends Base
case object G extends Base
case object U extends Base

object Base {
  val fromInt: Int => Base = Array( A, C, G, U )
  val toInt: Base => Int = Map( A -> 0, C -> 1, G -> 2, U -> 3 )
}

import collection.IndexedSeqLike
import collection.mutable.{Builder, ArrayBuffer}
import collection.generic.CanBuildFrom
import scala.collection.mutable
final class RNA1 private ( val groups: Array[Int],
                           val length: Int ) extends IndexedSeq[Base]
{
  import RNA1._

  def apply( idx: Int ): Base = {
    if ( idx < 0 || length <= idx )
      throw new IndexOutOfBoundsException

    Base.fromInt( groups( idx / N ) >> ( idx % N * S ) & M )
  }

  override def take( count: Int ): RNA1 = RNA1.fromSeq( super.take( count ) )
}
object RNA1
{
  // 그룹에 표현할때 필요한 비트수
  private val S = 2

  // Int 에 들어갈 그룹수
  private val N = 32 / S

  // 어떤 그룹만 떼어내긴 위한 비트 마스크
  private val M = ( 1 << S ) - 1

  def fromSeq( buf: Seq[Base] ): RNA1 = {
    val groups = new Array[Int]( ( buf.length + N -1 ) / N )

    for ( i <- 0 until buf.length )
      groups( i / N ) |= Base.toInt( buf(i) ) << ( i % N * S )

    new RNA1( groups, buf.length )
  }

  def apply( bases: Base* ) = fromSeq( bases )
}

val xs = List( A, G, C, A)
RNA1.fromSeq( xs )
val rna1 = RNA1( A, U, G, G, C )


rna1.length
rna1.last

rna1.take( 3 )
final class RNA2 private ( val groups: Array[Int],
                           val length: Int ) extends IndexedSeq[Base]
                                             with IndexedSeqLike[Base, RNA2]
{
  import RNA2._

  override def newBuilder: Builder[Base, RNA2] =
    new ArrayBuffer[Base] mapResult fromSeq

  def apply( idx: Int ): Base = {
    if ( idx < 0 || length <= idx )
      throw new IndexOutOfBoundsException

    Base.fromInt( groups( idx / N ) >> ( idx % N * S ) & M )
  }

}
object RNA2
{
  // 그룹에 표현할때 필요한 비트수
  private val S = 2

  // Int 에 들어갈 그룹수
  private val N = 32 / S

  // 어떤 그룹만 떼어내긴 위한 비트 마스크
  private val M = ( 1 << S ) - 1

  def fromSeq( buf: Seq[Base] ): RNA2 = {
    val groups = new Array[Int]( ( buf.length + N -1 ) / N )

    for ( i <- 0 until buf.length )
      groups( i / N ) |= Base.toInt( buf(i) ) << ( i % N * S )

    new RNA2( groups, buf.length )
  }

  def apply( bases: Base* ) = fromSeq( bases )
}
val rna2 = RNA2( A, U, G, G, C )
rna2 take 3
rna2 filter ( U != _ )


final class RNA private ( val groups: Array[Int],
                          val length: Int ) extends IndexedSeq[Base]
                                            with IndexedSeqLike[Base, RNA]
{
  import RNA._

  override protected[this] def newBuilder: Builder[Base, RNA] =
    RNA.newBuilder

  def apply( idx: Int ): Base = {
    if ( idx < 0 || length <= idx )
      throw new IndexOutOfBoundsException

    Base.fromInt( groups( idx / N ) >> ( idx % N * S ) & M )
  }

  override def foreach[U]( f: Base => U ): Unit = {
    var i = 0
    var b = 0

    while ( i < length ) {
      b = if ( i % N == 0 ) groups( i / N ) else b >>> S
      f( Base.fromInt( b & M ) )
      i += 1
    }
  }
}

object RNA
{
  private val S = 2
  private val N = 32 / S
  private val M = ( 1 << S ) - 1

  def fromSeq( buf: Seq[Base] ): RNA = {
    val groups = new Array[Int]( ( buf.length + N -1 ) / N )

    for ( i <- 0 until buf.length )
      groups( i / N ) |= Base.toInt( buf(i) ) << ( i % N * S )

    new RNA( groups, buf.length )
  }

  def apply( bases: Base* ) = fromSeq( bases )

  def newBuilder: Builder[Base, RNA] =
    new ArrayBuffer mapResult fromSeq

  implicit def canBuildFrom: CanBuildFrom[RNA, Base, RNA] =
    new CanBuildFrom[RNA, Base, RNA] {
      def apply(): Builder[Base, RNA] = newBuilder
      def apply( from: RNA ): Builder[Base, RNA] = newBuilder
    }
}


val rna = RNA( A, U, G, G, C )

rna map { case A => C case b => b }
rna ++ rna

rna map Base.toInt
rna ++ List( "missing", "data" )




val rna3 = RNA2( A, U, G, G, C )

rna3 map { case A => C case b => b }
rna3 ++ rna3

rna3 map Base.toInt
rna3 ++ List( "missing", "data" )


