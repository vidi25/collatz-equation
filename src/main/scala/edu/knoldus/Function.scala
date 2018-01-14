package edu.knoldus

class Function {

  def collatzFunction(number: Int, list: List[Int]): List[Int] = {
    if (list contains number) {
      list
    }
    else {
      number match {
        case 1 => 1 :: list
        case number if number % 2 == 0 => collatzFunction(number / 2, number :: list)
        case _ => collatzFunction(3 * number + 1, number :: list)
      }
    }
  }

}
