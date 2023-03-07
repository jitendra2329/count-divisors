import scala.io.StdIn

object CountDivisors {
    def main(args:Array[String]): Unit = {
            // function call of takeInput
            takeInput
    }

    // Function for taking input from the user
    private def takeInput: Unit =  {
            print("Enter the first number : ")
            val firstnumber: Int = StdIn.readInt()
            print("Enter the second number : ")
            val secondnumber: Int = StdIn.readInt()
            print("Enter the divisor number : ")
            val divisor: Int = StdIn.readInt()
            // function call of countDivisors
            countDivisors(firstnumber, secondnumber, divisor)
    }

  // function for finding the number of divisor
    private def countDivisors(firstnumber:Int,secondnumber:Int,divisor:Int):Unit={
            var count = 0
            try{
                  for(index <- firstnumber to secondnumber ){
                    if(index % divisor == 0) {
                    count = count + 1
                    }
                  }
            } catch {
                case e :Exception =>{
                   print("Exception has arrived !")
                }
           }
           println("Number of Divisors : "+ count)
    }
}
