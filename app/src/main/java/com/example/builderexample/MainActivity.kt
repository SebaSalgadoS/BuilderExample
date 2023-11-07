package com.example.builderexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.builderexample.builder.FoodBuilder
import com.example.builderexample.builder.FoodDirector

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val food = FoodDirector()
        val foodBuilder = FoodBuilder()

        food.createMeatBread(foodBuilder = foodBuilder)

        println(food)
    }
}