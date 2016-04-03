
var i = 0
var foundIt = false

while ( ( i < args.length ) &&
        ( !foundIt ) )
{
  if ( !args(i).startWith( "-" ) 
  {
    if ( args(i).endsWith( ".scala" ) )
    {
      foundIt = true
    }
    i = i + 1
  }
}

def searchFrom( i:Int ): Int = 
  if ( i > args.length ) -1
  else if ( args(i).startWith( "-" ) ) searchFrom( i+1 )
  else if ( args(i).endsWith( ".scala" ) i
  else searchFrom( i+1 )

var i = searchFrom(0)

import scala.util.control.Breaks._
import java.io._

val in = new BufferedReader( new InputStreamReader( System.in ) )

breakable {
  while ( true )
  {
    println( "? " )
    if ( in.readLine() == "" ) break
  }
}
