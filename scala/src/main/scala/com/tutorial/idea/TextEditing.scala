package com.tutorial.idea

import scala.util.Random

class TextEditing {
  // Syntax aware selection - Incremental selection (ALT + UP/DOWN)
  def foo(): String = {
    val rand = new Random().nextString(8)
    rand.reverse
  }

  // Duplicate line (CMD + D)
  // Delete line (CMD + DELETE)
  // Move line (CMD + SHIFT + UP/DOWN)
  // Comment line (CMD + /)
}
