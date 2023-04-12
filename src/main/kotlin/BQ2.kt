fun main(args: Array<String>){
    var str1= readln()
    var str2= readln()
    str1=str1.toCharArray().sorted().joinToString { "" }
    str2=str2.toCharArray().sorted().joinToString { "" }
    if(str1!=str2){
        println("Not anagrams")
    }
    else{
        println("Are Anagrams")
    }
}