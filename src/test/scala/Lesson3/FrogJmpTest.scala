package Lesson3

import org.junit.{Assert, Ignore, Test}

class FrogJmpTest {
  @Test
  def solutionTest(): Unit ={
    val fj = new FrogJmp
    val expected = 3
    val actual = fj.solution(10, 85, 30)

    Assert.assertEquals(expected, actual)
  }
}
