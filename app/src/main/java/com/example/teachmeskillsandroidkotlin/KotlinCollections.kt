package com.example.teachmeskillsandroidkotlin

import android.util.Log

class KotlinCollections {

    fun logCollections() {

        // Mutable List
        val mutableList = mutableListOf("AUDI", "BMW", "Citroen")
        Log.d("TEST_ANDROID", "Mutable List:")
        for (item in mutableList) {
            Log.d("TEST_ANDROID", item)
        }

        // Immutable List
        val immutableList = listOf("Dog", "Cat", "Fish")
        Log.d("TEST_ANDROID", "Immutable List:")
        for (item in immutableList) {
            Log.d("TEST_ANDROID", item)
        }

        // Mutable Set
        val mutableSet = mutableSetOf(1, 2, 3)
        Log.d("TEST_ANDROID", "Mutable Set:")
        for (item in mutableSet) {
            Log.d("TEST_ANDROID", item.toString())
        }

        // Immutable Set
        val immutableSet = setOf(1.5, 2.3, 3.7)
        Log.d("TEST_ANDROID", "Immutable Set:")
        for (item in immutableSet) {
            Log.d("TEST_ANDROID", item.toString())
        }

        // Mutable Map
        val mutableMap = mutableMapOf("One" to 1, "Two" to 2, "Three" to 3)
        Log.d("TEST_ANDROID", "Mutable Map:")
        for ((key, value) in mutableMap) {
            Log.d("TEST_ANDROID", "$key -> $value")
        }

        // Immutable Map
        val immutableMap = mapOf("Four" to "Четыре" , "Five" to "Пять", "Six" to "Шесть")
        Log.d("TEST_ANDROID", "Immutable Map:")
        for ((key, value) in immutableMap) {
            Log.d("TEST_ANDROID", "$key -> $value")
        }
    }
}