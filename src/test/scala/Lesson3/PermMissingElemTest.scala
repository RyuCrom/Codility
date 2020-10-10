package Lesson3
import org.junit.{Assert, Ignore, Test}

class PermMissingElemTest {
  @Test
  def solutionTest(): Unit = {
    val pm = new PermMissingElem
    val arr = Array(3, 5)
    val expected = 4
    val actual = pm.solution(arr)

    println("actual: " + actual)
    println("running...")
    Assert.assertEquals(expected, actual)
  }
}
