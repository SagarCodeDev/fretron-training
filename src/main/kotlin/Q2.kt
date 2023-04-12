import java.util.*
import java.util.Collections.swap

fun main(args: Array<String>) {
    var arr= arrayListOf<Int>(1,2,3,4,5)
    val n=arr.size-1
    var k= Scanner(System.`in`).nextInt()
    k%=arr.size
    for(x in k..k+((n-k)/2)){
        swap(arr,x,n-x+k)
    }
    for(x in 0..(k-1)/2){
        swap(arr,x,k-x-1)
    }
    arr.reverse()
    for(x in arr){
        println(x)
    }
}