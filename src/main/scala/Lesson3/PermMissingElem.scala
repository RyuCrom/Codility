package Lesson3

import scala.util.control._
/*
An array A consisting of N different integers is given.
The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.
Your goal is to find that missing element.
Write a function:
object Solution { def solution(a: Array[Int]): Int }
that, given an array A, returns the value of the missing element.
For example, given array A such that:
  A[0] = 2
  A[1] = 3
  A[2] = 1
  A[3] = 5
the function should return 4, as it is the missing element.
Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..100,000];
the elements of A are all distinct;
each element of array A is an integer within the range [1..(N + 1)].
 */
class PermMissingElem {
//  def sortFunc(arr: Array[Int]): Array[Int] = {
//    arr.sortWith( _ < _)
//  }
//  def solution(a: Array[Int]): Int = {
//    if( a.size < 2) a(0)+1
//    else {
//      val loop = new Breaks
//      val sortArr = sortFunc(a)
//      var rst = 0
//      loop.breakable {
//        for (i <- 0 to sortArr.size) {
//          if (sortArr(i+1) - sortArr(i) != 1 ) {
//            rst = sortArr(i) + 1
//            loop.break
//          }
//        }
//      }
//      rst
//    }
//  }

  def solution(A: Array[Int]): Int = {
    def findMissing(i: Int, L: List[Int]): Int = {
      if (L.isEmpty || L.head != i + 1) i + 1
      else findMissing(i + 1, L.tail)
    }

    if (A.length == 0) 1
    else findMissing(0, A.toList.sorted)
  }
}
