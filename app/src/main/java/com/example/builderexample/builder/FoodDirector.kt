package com.example.builderexample.builder

class FoodDirector {

    fun createMeatBread(foodBuilder: FoodBuilder): FoodOrder {
        return foodBuilder
            .setBread("Pan Blanco")
            .setMeat("Vacuno")
            .setCondiments("Mostaza")
            .build()
    }

    fun createFishBread(foodBuilder: FoodBuilder): FoodOrder{
        return foodBuilder
            .setBread("Pan Integral")
            .setFish("Reineta")
            .setCondiments("Mayonesa")
            .build()
    }
}
