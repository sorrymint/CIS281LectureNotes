import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun main() {
    val students = mutableListOf<Student>()

    val csvFile = File("grades.csv")

    //TODO chnage to garding if statment
    if (csvFile.exists()) {
        BufferedReader(FileReader(csvFile)).use { reader ->
            var line: String?
            while (reader.readLine().also { line = it } != null) {
                val values = line!!.split(",")
                if (values.size == 3) {
                    val firstName = values[0]
                    val lastName = values[1]
                    val grade = values[2].toDouble()
                    val student = Student(firstName, lastName, grade)
                    students.add(student)
                } else {
                    println("Invalid data in line: $line")
                }
            }
        }
    } else {
        println("grades.csv does not exist.")
    }
    val studentsInOrder = gradeOrder(students)
    generateReport(studentsInOrder)
}

fun calcAverageGrade(students: List<Student>): Double {
    val totalGrade = students.sumOf { it.grade }
    return totalGrade / students.size
}

fun gradeOrder(students: List<Student>): List<Student>{
    return students.sortedByDescending { it.grade }
}

fun generateReport(students: List<Student>) {
    println("Student Grade Report\n")

    for (student in students) {
        val gradeLetter = Grade.fromNumericGrade(student.grade)
        println("${student.firstName} ${student.lastName}: ${gradeLetter.name}")
    }

    val averageGrade = calcAverageGrade(students)
    println("\nAverage Grade: $averageGrade")
}