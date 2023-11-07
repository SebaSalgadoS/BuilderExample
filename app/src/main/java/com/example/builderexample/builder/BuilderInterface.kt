package com.example.builderexample.builder

interface BuilderInterface {

    fun setBread(bread:String): BuilderInterface
    fun setCondiments(condiments:String): BuilderInterface
    fun setMeat(meat:String): BuilderInterface
    fun setFish(fish:String): BuilderInterface
    fun build(): FoodOrder

}