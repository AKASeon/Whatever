
val i: Int = null

// Predef 객체에 존재하는 메소드
def error( message: String ): Nothing =
  throw new RuntimeException( message )

// error 사용 예
def divide( x: Int, y: Int ): Int = 
  if ( y != 0 ) 
    x / y
  else 
    error( "Can not divide by zero" )
