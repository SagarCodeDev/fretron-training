import kotlin.math.max

fun main(args: Array<String>){
    var str= readln()
    var n=str.length
    var len=1
    var res=""
    res+=str[0]
    var start=0
    var end=1
    var mp=HashMap<Char,Int>()
    mp[str[start]]=1
    while(end<n){
        if(mp[str[end]]==1){
            mp[str[start]]=0
            start++
        }
        else{
            if(len<end-start+1){
                len=end-start+1
                res=str.substring(start,end+1)
            }
            mp[str[end]]=1
            end++
        }
        if(start==end){
            end++
            mp[str[start]]=1
        }
    }
    println(res)
}