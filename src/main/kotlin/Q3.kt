/*
    *Given two arrays of integers, find the intersection of the two arrays using a HashMap.
    *An intersection is defined as the set of elements that are common to both arrays,
    *and the result should not contain any duplicates.
 */
fun findIntersection(arr1: ArrayList<Int>, arr2: ArrayList<Int>) {
    var map = HashMap<Int, Int>()//Use map to find the frequency
    for (x in arr1) {
        map[x] = 1
    }

    var list = ArrayList<Int>()

    for (x in arr2) {

        if (map[x] == 1) {
            list.add(x)
            map[x] = 0
        }

    }

    for (x in list) {
        println(x)
    }

}

fun main(args: Array<String>){
    var arr1 = arrayListOf<Int>(1, 2, 2, 3)
    var arr2 = arrayListOf<Int>(2, 2)

    findIntersection(arr1, arr2)
    //Time Complexity - O(n)
    //Space Complexity - O(n)
}