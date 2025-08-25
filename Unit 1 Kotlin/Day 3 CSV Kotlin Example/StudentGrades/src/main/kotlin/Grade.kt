enum class Grade {
    A {
        override fun isInRange(numericGrade: Double): Boolean = numericGrade >= 90
    },
    B{
        override fun isInRange(numericGrade: Double): Boolean = numericGrade >= 80
    },
    C{
        override fun isInRange(numericGrade: Double): Boolean = numericGrade >= 70
    },
    D{
        override fun isInRange(numericGrade: Double): Boolean = numericGrade >= 60
    },
    F {
        override fun isInRange(numericGrade: Double): Boolean = true
    };

    abstract fun isInRange(numericGrade: Double): Boolean

    companion object {
        fun fromNumericGrade(numericGrade: Double): Grade {
            return entries.firstOrNull { it.isInRange(numericGrade) } ?: F
        }
    }
}