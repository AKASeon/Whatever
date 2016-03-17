
// list
val oneTwoThreadd = List( 1, 2, 3 )

val oneTwo = List( 1, 2 )
val ThreeFour = List( 3, 4 )
val oneTwoThreeFour = oneTwo :: ThreeFour

println( oneTwo + " and " + ThreeFour + " were not mutated." )
println( "Thus, ", oneTwoThreeFour + " is a new list." )

val twoThree = List( 2, 3 )
val oneTwoThree2 = 1 :: twoThree
println( oneTwoThree2 )

val oneTwoThree3 = 1 :: 2 :: 3 :: Nil
println( oneTwoThree3 )


