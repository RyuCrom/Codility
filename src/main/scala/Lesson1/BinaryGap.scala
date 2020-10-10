package Lesson1

class BinaryGap {
  def convert(n: Int, base: Int): String = {
    assert(base >= 2 && base <= 16)

    def stack(n: Int): Array[Int] = {
      if (n < base) Array(n)
      else stack(n / base) :+ (n % base)
    }

    stack(n).map(i => if (i > 10) ('A' + i - 10).toChar.toString else i).mkString
  }

  def solution(n: Int): Int = {
    val dec = convert(n, 2)
    var i, tmp, rst = 0

    while(i < dec.size) {
      if (dec(i) == '0') tmp+=1
      else if(rst < tmp){
        rst = tmp
        tmp = 0
      }
      else tmp = 0

      i+=1
    }
    rst
  }
}