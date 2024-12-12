package com.example.listviewadvance

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var userArrayList : ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val name = arrayOf("Ashish", "Ankit", "Samanta", "Karan", "Akriti")
        val lastMsg = arrayOf("Hey ssup?", "I am fine", "Good", "Awesome", "cool")
        val lastMsgTime = arrayOf("6:25 AM", "5:45 AM", "7:10 PM", "9:00 PM", "5:00PM")
        val phoneNumber = arrayOf("987896789", "789654789", "95678090", "8540778909", "9889589089")
        val imgId = arrayOf(R.drawable.pic1, R.drawable.pic2, R.drawable.pic3, R.drawable.pic4, R.drawable.pic5)

        userArrayList = ArrayList()

        for(eachIndex in name.indices){
            val user = User(name[eachIndex], lastMsg[eachIndex], lastMsgTime[eachIndex], phoneNumber[eachIndex],imgId[eachIndex])
            userArrayList.add(user)
        }

        val listView = findViewById<ListView>(R.id.listView)
        listView.isClickable = true

        //Setting a Adapter here
         listView.adapter = MyAdapter(this,userArrayList)


    }
}