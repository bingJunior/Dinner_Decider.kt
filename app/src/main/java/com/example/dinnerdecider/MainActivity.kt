package com.example.dinnerdecider

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
var foodList = arrayListOf("Chinese", "Hamburger", "Pizza", "McDonalds", "Barros Pizza")

@ExperimentalStdlibApi
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    decideBtn.setOnClickListener {
        val random = Random()
        val randomFood = random.nextInt(foodList.count())
        selectedFoodTxt.text = foodList[randomFood]
    }

    addFoodBtn.setOnClickListener {
        val newFood = addFoodTxt.text.toString()
        foodList.add(newFood)
        addFoodTxt.text.clear()
        println(foodList)
    }

    clrbtn.setOnClickListener{
        //  foodList.clear()     // <--- Removes all elements
        foodList.removeLast() // <--- Removes the last element
        println(foodList)
    }

}

}
