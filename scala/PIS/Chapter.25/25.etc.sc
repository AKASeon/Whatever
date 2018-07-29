import scala.collection.mutable.ArrayBuffer

val xs: Iterable[Int] = List( 1, 2, 3 )

val ys = xs map ( x => x * x )


val buf = new ArrayBuffer[Int]

buf += 1
buf += 2
buf += 3

val bldr = buf mapResult( _.toArray )

bldr result


import scala.collection.immutable.BitSet

val bits = BitSet( 1, 2,3 )

bits map( _ * 2 )
bits map( _.toFloat )

Map( "a" -> 1, "b" -> 2 ) map { case (x, y) => (y, x) }

Map( "a" -> 1, "b" -> 2 ) map { case (x, y) => y }

val list = List( 1, 2, 3, 4 )

list filter ( _ > 1 )
list filter ( _ > 3 )
