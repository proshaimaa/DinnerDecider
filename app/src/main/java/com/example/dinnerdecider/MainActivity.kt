package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val foodList = arrayListOf("chinese","italian","piza","hamburger")

        decideBtn.setOnClickListener(){
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            selectedFoodTxt.text = (foodList[randomFood])

        }

        addBtn.setOnClickListener(){
            val newFood = addFoodTxt.text.toString()
            foodList.add(newFood)
            addFoodTxt.text.clear()
            println(foodList)
        }



    }
}
