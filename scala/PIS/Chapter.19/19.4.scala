trait Queue[T] {
  def head: T
  def tail: Queue[T]
  def enqueue( x: T ): Queue[T]
}

object Queue {
  def apply[T]( xs: T* ): Queue[T] = new QueueImpl[T]( xs.toList, Nil )

  private class QueueImpl[T] ( 
    private val leading: List[T],
    private val trailing: List[T] 
  ) extends Queue[T]
  {
    def mirror = 
      if ( leading.isEmpty )
        new QueueImpl( trailing.reverse, Nil )
      else
        this

      def head = mirror.leading.head

      def tail = {
        val q = mirror
        new QueueImpl( q.leading.tail, q.trailing )
      }

      def enqueue( x: T ) = new QueueImpl( leading, (x :: trailing) )
  }
}


val test1 = Queue( 1, 2, 3 )
//val test1 = new Queue( Nil, List( 1, 2, 3 ) )
val test2 = test1 enqueue 4

val test3 = test2.head
println( "test2 head:" + test3 )
