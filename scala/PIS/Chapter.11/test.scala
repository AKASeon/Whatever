object Int extends AnyValCompanion {
  .....object Int extends AnyValCompanion {
      .....
        /** Language mandated coercions from Int to "wider" types. */
          import scala.language.implicitConversions
            implicit def int2long(x: Int): Long = x.toLong
              implicit def int2float(x: Int): Float = x.toFloat
                implicit def int2double(x: Int): Double = x.toDouble
  }
  /** Language mandated coercions from Int to "wider" types. */
  import scala.language.implicitConversions
  implicit def int2long(x: Int): Long = x.toLong
  implicit def int2float(x: Int): Float = x.toFloat
  implicit def int2double(x: Int): Double = x.toDouble
}
