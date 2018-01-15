package edu.knoldus

class Function {

  def findElement(number: Int, inputList: List[Int]): Boolean = {
    inputList match {

      case (head :: tail) => if(number == head) true else findElement(number,tail)
      case _ => false

    }
  }

  def collatzFunction(number: Int, tempList: List[Int], outputList: List[Int]): List[Int] = {
    if (findElement(number, outputList)) {
      outputList
    }
    else {
      number match {
        case 1 => (1 :: tempList) ::: outputList
        case num if num % 2 == 0 => collatzFunction(number / 2, number :: tempList, outputList)
        case _ => collatzFunction(3 * number + 1, number :: tempList, outputList)
      }
    }
  }

}
