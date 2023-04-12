fun main(args: Array<String>){
    var arr= arrayListOf<Int>(1,2,3,4,5)
    var leftprod= ArrayList<Int>()
    var rightprod=ArrayList<Int>()
    for(x in 0..arr.size-1){
        if(x==0){
            leftprod.add(1)
            rightprod.add(1)
        }
        else{
            leftprod.add(arr[x-1]*leftprod[x-1])
            rightprod.add(arr[arr.size-x]*rightprod[x-1])
        }
    }
    rightprod.reverse()
    for(x in 0..arr.size-1){
        arr[x]=leftprod[x]*rightprod[x]
    }
    for(x in arr){
        println(x)
    }
}