/*
    *Given two strings, check if they are anagrams of each other.
 */
fun checkAnagrams(str1: String, str2: String){
    var freqArray=Array<Int>(26){0}//store the frquency of every char in the array
    for(x in str1){

        freqArray[x-'a']++

    }
    for(x in str2){

        freqArray[x-'a']--

    }
    for(x in freqArray){
        if(x!=0){

            println("Not anagrams")//if the frequency of any element in the end is not zero then not anagrams
            return
        }
    }

    println("Are anagrams")
}
fun main(args: Array<String>){
    var str1= readln()
    var str2= readln()
    checkAnagrams(str1,str2)
    //Time Complexity - O(n)
    //Space Complexity - O(n)
}