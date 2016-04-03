
def isEqual( x:Int, y: Int ) = x == y
// isEqual: (Int, Int)Boolean

isEqual( 421, 421 )
//Boolean = true

def isEqual( x: Any, y: Any ) = x == y
// isEqual: (Any, Any)Boolean

isEqual( 421, 421 )
//Boolean = true



val x = new String( "abc" )
val y = new String( "abc" )

x == y
// Boolean = true

x eq y
// Boolean = false

x ne y
// Boolean = true
