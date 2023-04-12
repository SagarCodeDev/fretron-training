fun checkpalin(str: String,a: Int,b: Int):Boolean{
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
fun main(args: Array<String>){
    var str= readln()
    var i=0
    var j=str.length-1
    while(i<j){
        if(str[i]==str[j]){
            i++
            j--
        }
        else{
            if(checkpalin(str,i,j-1) || checkpalin(str,i+1,j)){
                println("Valid")
                break
            }
            else{
                println("Not Valid")
                break
            }
        }
    }
    if(i==j){
        println("Valid")
    }
}