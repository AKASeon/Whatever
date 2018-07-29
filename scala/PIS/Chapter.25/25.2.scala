/*  
 *  @author Martin Odersky  
 *  @version 2.8
 *  @since   2.8
 *  @tparam A    the element type of the collection
 *  @tparam Repr the type of the actual collection containing the elements.
 *
 *  @define Coll Traversable
 *  @define coll traversable collection
 */
trait TraversableLike[+A, +Repr] extends Any
                                    with HasNewBuilder[A, Repr]
                                    with FilterMonadic[A, Repr]
                                    with TraversableOnce[A]
                                    with GenTraversableLike[A, Repr]
                                    with Parallelizable[A, ParIterable[A]]
{
  private def filterImpl(p: A => Boolean, isFlipped: Boolean): Repr = {
    val b = newBuilder
    for (x <- this)
      if (p(x) != isFlipped) b += x

    b.result
  }

  /** Selects all elements of this $coll which satisfy a predicate.
   *
   *  @param p     the predicate used to test elements.
   *  @return      a new $coll consisting of all elements of this $coll that satisfy the given
   *               predicate `p`. The order of the elements is preserved.
   */
  def filter(p: A => Boolean): Repr = filterImpl(p, isFlipped = false)

   def map[B, That](f: A => B)(implicit bf: CanBuildFrom[Repr, B, That]): That = {
    def builder = { // extracted to keep method size under 35 bytes, so that it can be JIT-inlined
      val b = bf(repr)
      b.sizeHint(this)
      b
    }
    val b = builder
    for (x <- this) b += f(x)
    b.result
  }
}
