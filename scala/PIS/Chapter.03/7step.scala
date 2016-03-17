
val big = new java.math.BigInteger( "12345" )

val greetStrings = new Array[String](3)
val greetStrings1: Array[String] = new Array[String](3) 

greetStrings(0) = "Hello"
greetStrings(1) = ", "
greetStrings(2) = "World!\n"

for ( i <- 0 to 2 )
  print( greetStrings(i) )

greetStrings.update( 0, "Hello1" )
greetStrings.update( 1, ",1 " )
greetStrings.update( 2, "World1\n" )

for ( i <- 0.to(2) )
  print( greetStrings.apply(i) )

