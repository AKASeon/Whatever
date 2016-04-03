
class Rational(n: Int, d: Int ) {
//  println( "Created " + n + "/" + d )
  
  require ( d != 0 )

  private val g = gcd( n.abs, d.abs )
  val numer: Int = n / g
  val denom: Int = d / g

  def this( n: Int ) = this( n, 1 )

  override def toString = numer + "/" + denom

  def add( that: Rational ): Rational =
    this + that

  def + ( that: Rational ): Rational =
    new Rational( numer * that.denom + that.numer * denom, 
                  denom * that.denom )

  def + ( i: Int ): Rational = 
    new Rational( numer + i * denom, denom )

  def - ( that: Rational ): Rational =
    new Rational( numer * that.denom - that.numer * denom,
                  denom * that.denom )

  def - ( i: Int ): Rational =
    new Rational( numer - i * denom, denom )

  def * ( that: Rational ): Rational = 
    new Rational( numer * that.numer, denom * that.denom )

  def * ( i: Int ): Rational = 
    new Rational( numer * i, denom )

  def / ( that: Rational ): Rational = 
    new Rational( numer * that.denom, denom * that.numer )

  def / ( i: Int ): Rational =
    new Rational( numer, denom * i )

  def lessThan( that: Rational ) = 
    this.numer * that.denom < that.numer * this.denom

  def max( that: Rational ) = 
    if ( this.lessThan( that ) ) that else this

  private def gcd( a: Int, b: Int ): Int = 
    if ( b == 0 ) a else gcd( b, a % b ) 
}


println( new Rational( 1, 2 ) )
//println( new Rational( 1, 0 ) )
val oneHalf = new Rational( 1, 2 )
val twoThirds = new Rational( 2, 3 )
println( oneHalf add twoThirds )

val r = new Rational( 1, 2 )
println( r.numer )
println( r.denom )

val z = new Rational( 3 )
println( z )

println( new Rational( 66, 42 ) )

val x = new Rational( 1, 2 )
val y = new Rational( 2, 3 ) 

println( x + y )
println( x.+(y) )

println( x + x * y )
println( (x + x) * y )
println( x + ( x * y ) )

val x2 = new Rational( 2, 3 )
println( x2 * x2 )
println( x2 * 2 )

implicit def intToRational( x: Int ) = new Rational( x )

val r2 = new Rational( 2, 3 )
println( 2 * r2 )
