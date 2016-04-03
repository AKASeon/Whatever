
class SlowHeadQueue[T]( smele: List[T] ) {
  def head = smele.last
  def tail = new SlowHeadQueue( smele.init )
  def enqueue( x: T ) = new SlowHeadQueue( x :: smele )
}
