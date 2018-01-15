package edu.knoldus

class Function {

  def findElement(number: Int, inputList: List[Int]): Boolean = {
    inputList match {

      case (head :: tail) => if(number == head) true else findElement(number,tail)
      case _ => false

    }
  }

  def collatzFunction(number: Int, list: List[Int]): List[Int] = {
    if (findElement(number,list)) {
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
