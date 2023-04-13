import kotlin.math.max
/*
    *Given a string, find the length of the longest substring without repeating characters.
 */
fun longestSub(str: String):Int{
    var n = str.length
    var len = 1
    var res = ""
    res += str[0]
    var start = 0
    var end = 1
    var mp = HashMap<Char, Int>()
    mp[str[start]] = 1
    while (end < n) {
        //Use the sliding window technique and shrink and expand the window accordingly
        if (mp[str[end]] == 1) {

            mp[str[start]] = 0
            start++

        } else {

            if (len < end - start + 1) {

                len = end - start + 1
                res = str.substring(start, end + 1)
            }
            mp[str[end]] = 1
            end++
        }

        if (start == end) {

            end++
            mp[str[start]] = 1
        }
    }
    return res.length
}
fun main(args: Array<String>) {
    var str = readln()
    println(longestSub(str))
    //Time Complexity-O(n)
    //Space Complexity- O(n)
}