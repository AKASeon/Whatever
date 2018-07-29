
class Cell[+T]( init: T ) {
  private[this] var current = init
  
  def get = current 
  def set( x: T ) { current = x }
}

val c1 = new Cell[String]( "abc" )  // "abc" 문자열이 들어간 c1이라는 val 에 저장
val c2: Cell[Any] = c1              // c2 를 Cell[Any] 로 선언하면서 c1 으로 초기화

c2.set( 1 )                         // c2 에 있는 Cell 값을 1로 설정
val s: String = c1.get              // c1 의 값을 문자열에 할당
