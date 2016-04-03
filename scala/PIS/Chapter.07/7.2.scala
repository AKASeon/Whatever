
def gcdLoop( x: Long, y: Long ): Long = {
  var a = x
  var b = y 

  while ( a != 0 ) {
    val temp = a
    a = b % a
    b = temp
  }
  b
}

var line = ""

do {
  line = readLine()
  println( "read: " + line )
} while ( line != "" )

def gread() { println( "hi" ) }

great() == ()

var line = ""
while ( ( line = readLine() != "" ) // 작동하지 않음
  println( "Read: " + line )

def gcd( x: Long, y: Long ): Long = 
  if ( y == 0 ) x else gcd( y, x % y )

val filesHere = ( new java.io.File(".")).listFiles

for ( file < files )
  println( file )

for ( i <- 1 to 4 )
  println( "Iteration " + i )

for ( i <- 1 until 4 )
  println( "Iteration " + i )

// 스칼라에서 쓰지 말자
for ( i <- 0 to filesHere.length - 1 )
  println( filesHere(i) )

for ( file <- filesHere if file.getName.endwith( ".scala" ) )
  println( file )

for ( 
     file <- filesHere 
     if file.isFile
     if file.getName.endwith( ".scala" )
) println( file )

def fileLines( file: java.io.file ) = 
  scala.io.Source.fromFile( file ).getLines().toList

def grep( pattern: String ) =
  for (
       file <- filesHere
       is file.getName.endwith( ".scala" );
       line <- fileLines( file )
       if line.trim.matches( pattern )
  ) println( file + ": " + line.trim )

grep( ".*gcd.*" )


def scalaFiles = 
  for {
    file <- filesHere
    if file.getName.endwith( ".scala" )
  } yield file 

def forLineLenghths = 
  for {
    file < filesHere
    if file.getName.endwith( ".sacla" )
    line < fileLines( file )
    trimmed = line.trim
    if trimmed.matches( ".*for.*" )
  } yield trimmed.length


