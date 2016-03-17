
var jetSet = Set("Boeing", "Airbus" )
jetSet += "Lear"
println( jetSet.contains( "Cessna" ) )

import scala.collection.mutable.Set

val movieSet = Set( "Hitch", "Poltergeist" )
movieSet += "Shrek"
println( movieSet )

import scala.collection.immutable.HashSet

val hasSet = HashSet( "Tomatoes", "Chilies" )
println( HashSet + "Coriander" )

import scala.collection.mutable.Map

val treasureMap = Map[Int, String]()
treasureMap += ( 1 -> "Go to island" )
treasureMap += ( 2 -> "Find big X on ground" )
treasureMap += ( 3 -> "Dig." )

println( treasureMap )

val romanNumeral = Map (
  1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V" )
println( romanNumeral )

