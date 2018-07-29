
val a1 = Array( "abc" )

//val a2: Array[Any] = a1
val a2: Array[Object] = a1.asInstanceOf[Array[Object]]
