package com.michael.shoppinglist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recyclerView:RecyclerView = findViewById(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        var user = ArrayList<recyclerData>()

        user.add(recyclerData("1.)  Buy fresh tomatoes" ))
        user.add(recyclerData("2.)  Buy 1 packet of maggi" ))
        user.add(recyclerData("3.)  Power Oil (one litre)" ))
        user.add(recyclerData("4.)  20 pieces of sachet tomato" ))
        user.add(recyclerData("5.)  2 wraps of fresh pepper" ))
        user.add(recyclerData("6.)  A pack of salt" ))
        user.add(recyclerData("7.)  2 kilos of beef" ))
        user.add(recyclerData("8.)  1 kilo of goat meat" ))
        user.add(recyclerData("9.)  A pack of curry" ))
        user.add(recyclerData("10.)  Oven gloves for baking" ))
        user.add(recyclerData("11.)  Matches, lighter, etc" ))
        user.add(recyclerData("12.)  Hand sanitizer for the whole family" ))



        var adapter = recyclerViewAdapter(user)

        recyclerView.setAdapter(adapter)
    }
}
