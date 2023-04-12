fun main(args:  Array<String>){
    var str= readln()
    var count=0
    var prev=' '
    var ans=""
    for(x in 0..str.length-1){
        if(count==0){
            count++
            prev=str[x]
        }
        else{
            if(str[x]==prev){
                count++
            }
            else{
                ans+=count.toString()+prev
                count=1
                prev=str[x]
            }
        }
    }
    ans+=count.toString()+prev
    println(ans)
}