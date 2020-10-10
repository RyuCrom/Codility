package Lesson3

class FrogJmp {
  def solution(x: Int, y: Int, d: Int): Int ={
    Math.ceil((y-x)/d.toDouble).toInt
  }
}
