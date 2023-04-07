package com.example.teachmeskillsandroidkotlin


/* Создать 3 класса и реализовать в каждом из них 3 метода.
   Так же один класс, должен наследоваться от другого класса с его методами override. */


open class Cars(val capacity: Double,val maxSpeed: Int,val productionYear: Int) {

    open fun consumption() {
        println("$capacity Объем двигателя")
    }

    open fun accelerating() {
        println("$maxSpeed Максимальная скорость")
    }

    open fun produced() {
        println("$productionYear Год выпуска")
    }
}

class BMW : Cars(capacity = 3.5, maxSpeed = 220, productionYear = 2020) {

    override fun consumption() {
        println("$capacity Объем двигателя : 3.5 л.")
    }

    override fun accelerating() {
        println("$maxSpeed Максимальная скорость : 220 км/ч.")
    }

    override fun produced() {
        println("$productionYear Год выпуска : 2020 г.")
    }
}

class Mercedes : Cars(capacity = 2.5, maxSpeed = 200, productionYear = 2018) {

    override fun consumption() {
        println("$capacity Объем двигателя : 2.5 л.")
    }

    override fun accelerating() {
        println("$maxSpeed Максимальная скорость : 200 км/ч.")
    }

    override fun produced() {
        println("$productionYear Год выпуска : 2018 г.")
    }
}
