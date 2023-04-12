/*
    *Given a string, check if it is a valid palindrome after removing at most one character.
 */
fun checkPalin(str: String,a: Int,b: Int):Boolean{//to check whether the current pair of strings are palindrome or not
    var i=a
    var j=b
    while(i<j){
        if(str[i]!=str[j]){
            return false
        }
        else{
            i++
            j--
        }
    }
    return true
}
fun isPalin(str: String):Boolean{
    var i=0
    var j=str.length-1
    while(i<j){
        if(str[i]==str[j]){
            i++
            j--
        }
        else{
            if(checkPalin(str,i,j-1) || checkPalin(str,i+1,j)){
                return true
            }
            else{
                return false
            }
        }
    }
    return true
}
fun main(args: Array<String>){
    var str= readln()
    println(isPalin(str))
    //Time Complexity - O(n)
    //Space Complexity - O(1)
}