object SumOfMultiples {

  def sumOfMultiples(factors: Set[Int], limit: Int): Int = {

    1.until(limit)
      .filter ((index: Int) => factors.exists(value => index % value == 0))
      .sum
  }

}

