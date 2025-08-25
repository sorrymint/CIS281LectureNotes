enum class DuckType(val duckAbr: String) {

    Pirate("P"),
    Ninja("N"),
    Giraffe("G"),
    Chef("C");

    fun getDescription(): String {
        return when (this) {
            Pirate -> "This daring rubber duck is ready to sail the high seas with its trusty pirate hat and sword."
            Ninja -> "A stealthy rubber duck that moves silently through the water, equipped with a ninja headband and throwing stars."
            Giraffe -> "An adventurous rubber duck with a long neck and spots, exploring the wild waters with curiosity."
            Chef -> "A culinary rubber duck that cooks up fun in the bathtub, wearing a chef's hat and brandishing a spatula."
        }
    }
}