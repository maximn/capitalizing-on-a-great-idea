package com.tutorial.idea

// Show Intention Actions (ALT+Enter)
class Bad {
  // tipo
  private val unused = new AnyRef

  Seq(5, 6).find(_ == 4).isDefined

  Seq(7, 8).length == 0

  Seq(9, 1).apply(0)

  Seq("a", "b", "c").drop(1).take(1)

  //illegal1


  //illegal2


  //illegal3
}