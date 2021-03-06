
class Queue[+T] ( private val leading: List[T],
                  private val trailing: List[T] )
{
  private def mirror = 
    if ( leading.isEmpty )
    {
      println( "leading is empty" )
      new Queue( trailing.reverse, Nil )
    }
    else
      this

    def head = mirror.leading.head

    def tail = {
      val q = mirror
      new Queue( q.leading.tail, q. trailing )
    }

    def enqueue( x: T ) = new Queue( leading, x :: trailing )

    def showLeading = {
      println( "showLeading" )
      for ( value <- leading ) 
        println( value )
    }

    def showTrailing = {
      println( "showTrailing" )
      for ( value <- trailing ) 
        println( value )
    }
}

val test1 = new Queue( Nil, List(1,2,3) )
val test2 = test1 enqueue 4

println( "test1" )
test1.showLeading
test1.showTrailing

println( "test2" )
test2.showLeading
test2.showTrailing

val test3 = test2.head
println( "test2 head:" + test3 )

println( "... test2" )
test2.showLeading
test2.showTrailing

val test4 = test2.tail
println( "test4" )
test4.showLeading
test4.showTrailing
                   

class StrangeIntQueue extends Queue[Int]
{
  override def enqueue( x: Int ) = {
    println( math.sqrt( x ) )
    super.enqueue( x )
  }
}

