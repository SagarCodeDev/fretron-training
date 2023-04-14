import java.util.*
import java.util.Collections.swap
import kotlin.collections.ArrayList
/*
    *Given an array of integers and a number k, rotate the array k times to the right
    * (i.e., each element is shifted to the right k times).
    * Assume that 0 <= k <= 10^4 and 1 <= length of array <= 10^5.
 */
fun rotateArray(arr: List<Int>, k1: Int) {
    val n = arr.size - 1
    var k = k1
    k %= arr.size
    //Reverse left and right half separately then swap the entire array in one go
    for (x in k..k + ((n - k) / 2)) {
        swap(arr, x, n - x + k)
    }
    for (x in 0..(k - 1) / 2) {
        swap(arr, x, k - x - 1)
    }
    arr.reversed()
    for (x in arr) {
        println(x)
    }
}

fun main(args: Array<String>) {
    var arr = mutableListOf(1, 2, 3, 4, 5)
    var k = Scanner(System.`in`).nextInt()
    rotateArray(arr, k)
    //Time Complexity - O(n)
    //Space Complexity - O(1)
}