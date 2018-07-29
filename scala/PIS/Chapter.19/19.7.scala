
// 반공변성 출력 채널
trait OutputChannel[-T] {
  def write( x: T )
}
