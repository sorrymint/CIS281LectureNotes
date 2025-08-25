fun main() {
    val rubberDucks = listOf(
        RubberDuck("001", 15.99, DuckType.valueOf("Pirate"), DuckType.Pirate.getDescription()),
        RubberDuck("002", 12.49, DuckType.valueOf("Ninja"), DuckType.Ninja.getDescription()),
        RubberDuck("003", 18.75, DuckType.valueOf("Giraffe"), DuckType.Giraffe.getDescription()),
        RubberDuck("004", 22.99, DuckType.valueOf("Chef"), DuckType.Chef.getDescription())
    )

    println("Duck Information:")
    rubberDucks.forEach { duck ->
        println("ID: ${duck.id}")
        println("Price: $${duck.price}")
        println("Type: ${duck.type.duckAbr} ${duck.type}")
        println("Description: ${duck.desc}")
        println("--------------")
    }
}
