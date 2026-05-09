package org.example.app.lesson_11

class Ingredient(
    val name: String,
    val quantity: String,
)

class Recipe(
    val id: Int,
    val title: String,
    val imageUrl: String,
    val ingredients: List<Ingredient>,
    val method: List<String>,
    var isFavorite: Boolean = false
)

class Category (
    val id: Int,
    val title: String,
    val description: String,
    val imageUrl: String,
    val recipes: List<Recipe>
)

fun main() {
    val beef = Ingredient("beef", "500 г")
    val bun = Ingredient("bun", "1 шт")

    val burgerRecipe = Recipe(
        id = 101,
        title = "Classic burger",
        imageUrl = "burger.jpg",
        ingredients = listOf(beef, bun),
        method = listOf("form a patty", "fry", "assemble the burger")
    )

    // 3. Создаем категорию и кладем туда рецепт
    val burgersCategory = Category(
        id = 1,
        title = "Burgers",
        description = "Recipes for all popular types of burgers",
        imageUrl = "category_burgers.jpg",
        recipes = listOf(burgerRecipe)
    )

    println("Created category: ${burgersCategory.title} with ${burgersCategory.recipes.size} recipe(s)")
}