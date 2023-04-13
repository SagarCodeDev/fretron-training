/*
    *Given a string, find the first non-repeated character in it.
 */
fun findNonRepeat(str: String): Char {
    var mp = HashMap<Char, Int>()//used hash map for storing the character frequency

    for (x in str) {

        if (mp[x] == 1) {

            return x

        } else {

            mp[x] = 1

        }
    }
    return ' '
}
fun main(args: Array<String>){
    var str = readln()
    val ans = findNonRepeat(str)
    if (ans == ' ') {
        println("No repeated character") //if the function returns a blank then no repeated character found
    } else {
        println(ans)
    }
    //Time Complexity- O(n)
    //Space Complexity- O(n)

}