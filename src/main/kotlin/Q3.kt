fun main(args: Array<String>){
    var arr1= arrayListOf<Int>(1,2,2,3)
    var arr2= arrayListOf<Int>(2,2)
    var map=HashMap<Int,Int>()
    for(x in arr1){
        map[x] = 1
    }
    var list= ArrayList<Int>()
    for(x in arr2){
        if(map[x]==1){
            list.add(x)
            map[x]=0
        }
    }
    for(x in list){
        println(x)
    }
}