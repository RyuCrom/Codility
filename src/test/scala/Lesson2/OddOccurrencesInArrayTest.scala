package Lesson2
import org.junit.{Assert, Ignore, Test}

class OddOccurrencesInArrayTest {
  @Test
  def solutionTest(): Unit ={
    val oo = new OddOccurrencesInArray
    val ar = Array(9, 3, 9, 3, 9, 7, 9)
    val expected = 7
    val actual = oo.solution(ar)

    println("running...")
    Assert.assertEquals(expected, actual)
  }
}
