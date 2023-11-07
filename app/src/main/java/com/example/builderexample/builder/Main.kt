package com.example.builderexample.builder

fun main(){
    val food = FoodDirector()
    val foodBuilder = FoodBuilder()

    food.createMeatBread(foodBuilder = foodBuilder)

    println(food.createMeatBread(foodBuilder = foodBuilder))
}