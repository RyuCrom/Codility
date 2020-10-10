package Lesson2

class OddOccurrencesInArray {
  def mapCount(a: Array[Int]): Int = {
    var map = scala.collection.mutable.Map[Int, Int]().withDefaultValue(0)
    for (v <- a) map(v) = map(v) + 1
    map.filter(_._2 % 2 == 1).head._1
  }
  def solution(a: Array[Int]): Int = {
    val mc = mapCount(a)
    mc
  }
}
