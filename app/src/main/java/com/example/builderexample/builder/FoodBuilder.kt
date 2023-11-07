package com.example.builderexample.builder

class FoodBuilder: BuilderInterface {
    private var bread: String? = null
    private var condiments: String? = null
    private var meat: String? = null
    private var fish: String? = null

    override fun setBread(bread: String): BuilderInterface {
        this.bread = bread
        return this
    }

    override fun setCondiments(condiments: String): BuilderInterface {
        this.condiments = condiments
        return this
    }

    override fun setMeat(meat: String): BuilderInterface {
        this.meat = meat
        return this
    }

    override fun setFish(fish: String): BuilderInterface {
        this.fish = fish
        return this
    }

    override fun build(): FoodOrder {
        return FoodOrder(
            bread,
            condiments,
            meat,
            fish
        )
    }
}