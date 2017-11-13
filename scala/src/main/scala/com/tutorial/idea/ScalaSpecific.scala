package com.tutorial.idea

import scala.concurrent.Future

class Conversion {
  val bi: BigInt = 1
}

class Parameter {

  import scala.concurrent.ExecutionContext.Implicits.global

  val doSomeWork: () => Unit = ???

  Future(doSomeWork)
}
