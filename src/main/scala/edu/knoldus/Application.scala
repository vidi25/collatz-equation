package edu.knoldus

import org.apache.log4j.Logger

object Application extends App {

  val log = Logger.getLogger(this.getClass)
  val app = new Function
  val inputNumber1 = 9
  val inputNumber2 = 7
  val list = app.collatzFunction(inputNumber1, Nil,Nil)
  log.info(s"List is ${app.collatzFunction(inputNumber2,Nil,list)}")

}
