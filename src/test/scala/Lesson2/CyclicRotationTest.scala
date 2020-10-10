package Lesson2
import org.junit.{Assert, Ignore, Test}

class CyclicRotationTest {
  @Test
  def solutionTest(): Unit ={
    val cr = new CyclicRotation
    val arr = Array(3, 8, 9, 7, 6)

    val expected = Array(9, 7, 6, 3, 8)
    val actual = cr.solution(arr, 3)

    println("running...")
    Assert.assertArrayEquals(expected, actual)
  }
}
