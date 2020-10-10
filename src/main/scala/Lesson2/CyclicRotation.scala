package Lesson2

class CyclicRotation {
  def solution(a: Array[Int], k: Int): Array[Int] = {
    val max = a.size - 1
    val rst = new Array[Int](a.size)

    for ( i <- 0 to max ) {
      val tmp:Int = (i+k)%a.size
      rst(tmp) = a(i)
    }
    rst
  }
}
