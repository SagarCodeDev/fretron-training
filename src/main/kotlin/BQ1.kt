fun main(args: Array<String>){
    var str= readln()
    var mp=HashMap<Char,Int>()
    for(x in str){
        if(mp[x]==1){
            println(x)
            break
        }
        else{
            mp[x]=1
        }
    }
}