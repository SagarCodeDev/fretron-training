/*
    *Given an array of integers, return an array where each element is the
    * product of all the elements in the original array except itself.
    * The output array should have the same length as the input array and
    * should not use division in the calculation.
 */
fun checkProduct(arr: ArrayList<Int>){
    var leftProd= ArrayList<Int>()
    var rightProd=ArrayList<Int>()
    //Use two arrays,First one for calculating the left product and right one to calculate the right product.
    for(x in 0..arr.size-1){

        if(x==0){
            leftProd.add(1)
            rightProd.add(1)
        }

        else{
            leftProd.add(arr[x-1]*leftProd[x-1])
            rightProd.add(arr[arr.size-x]*rightProd[x-1])
        }

    }

    rightProd.reverse()

    for(x in 0..arr.size-1){
        arr[x]=leftProd[x]*rightProd[x] //Multiply the left and right products of that index
    }

    for(x in arr){
        println(x)
    }
}
fun main(args: Array<String>){
    var arr= arrayListOf<Int>(1,2,3,4,5)

    checkProduct(arr)
    //Time Complexity - O(n)
    //Space Complexity - O(n)
}