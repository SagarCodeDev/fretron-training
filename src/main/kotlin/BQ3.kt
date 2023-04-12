/*
    *Given a string, compress it by replacing repeated characters with their count.
 */
fun compress(str: String):String{
    var count=0
    var prev=' '
    var ans=""
    for(x in 0..str.length-1){
        //if a new character occurs then add the frequency and character to the result else move forward
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
    return ans
}
fun main(args:  Array<String>){
    var str= readln()
    println(compress(str))
    //Time Complexity- O(n)
    //Space Complexity- O(n)
}