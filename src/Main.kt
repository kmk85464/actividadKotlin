fun main() {
    mostrarnumeros()
}

fun mostrarnumeros() {
    var num:Int=1

     while(num < 101){

         if (num % 3 == 0 ){
             println("tri")
             println()
             num++
         }
         else if (num % 5 == 0){
             println("qui")
             println()
             num++
         }
         else if ((num % 3 == 0 ) || (num % 5 == 0)){
             println("triqui")
             println()
             num++
         }
         else{
             println(num)
             println()
             num++
         }
    }
}
