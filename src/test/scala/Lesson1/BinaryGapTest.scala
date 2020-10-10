package Lesson1

import org.junit.{Assert, Test}

class BinaryGapTest {

  @Test
  def solutionTest(): Unit ={
    val bg = new Lesson1.BinaryGap()

    val expected = bg.solution(1041)
    val actual = 5

    println("running...")
    Assert.assertEquals(expected, actual)
  }
}
