fun main() {
    //https://play.kotlinlang.org/#eyJ2ZXJzaW9uIjoiMS45LjEwIiwicGxhdGZvcm0iOiJqYXZhIiwiYXJncyI6IiIsIm5vbmVNYXJrZXJzIjp0cnVlLCJ0aGVtZSI6ImlkZWEiLCJjb2RlIjoiZnVuIG1haW4oKSB7XG5cbiAgICB2YWwgYTogSW50ID0gMSAgLy8gaW1tZWRpYXRlIGFzc2lnbm1lbnRcbiAgICB2YWwgYiA9IDIgICAvLyBgSW50YCB0eXBlIGlzIGluZmVycmVkXG4gICAgdmFsIGM6IEludCAgLy8gVHlwZSByZXF1aXJlZCB3aGVuIG5vIGluaXRpYWxpemVyIGlzIHByb3ZpZGVkXG4gICAgYyA9IDMgICAgICAgLy8gZGVmZXJyZWQgYXNzaWdubWVudFxuXG4gICAgcHJpbnRsbihcImEgPSAkYSwgYiA9ICRiLCBjID0gJGNcIilcbn0ifQ==

    //https://kotlinlang.org/docs/kotlin-tour-collections.html#list
    val numbers = mutableListOf<Int>()

    println("Enter a series of positive numbers (enter a negative number to stop):")

    while (true) {
        val input = readlnOrNull()?.toIntOrNull()

        if (input != null && input >= 0) {
            numbers.add(input)
        } else {
            println("Stopping input.")
            break
        }
    }

    println("Numbers entered: $numbers")
    println("Even numbers: ${filterEvenNumbers(numbers)}")
    println("Sum of numbers: ${calculateSum(numbers)}")
}

fun filterEvenNumbers(numbers: List<Int>): List<Int> {
    return numbers.filter { it % 2 == 0 }
}

fun calculateSum(numbers: List<Int>): Int {
    var sum = 0
    for (number in numbers) {
        sum += number
    }
    return sum
}
