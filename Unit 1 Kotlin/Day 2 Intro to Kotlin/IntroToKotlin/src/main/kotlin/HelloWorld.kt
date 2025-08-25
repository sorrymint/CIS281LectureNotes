fun main() {
    println("Hello World")


    val a: Int = 1
    val b = 2
    val c: Int //Type is required when given no value
    c = 3 //change the value of c



    var course = readln()
    val greeting = if (course == "Mobile") {
        "Welcome to Mobile"
    } else {
        "Your in the wrong class"
    }
    println(greeting)

    val sumOfTwoNums = sum(1, 3)
    println(sumOfTwoNums)
}

//Function parameters are defined using Pascal notation
fun sum (a: Int, b: Int): Int {
    //you can put the ";" but it is not necessary
    return a + b;
}
