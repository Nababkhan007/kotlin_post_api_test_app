package com.example.fisheries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recycler_view.*

class RecyclerViewActivity : AppCompatActivity() {
    var fishList = ArrayList<Fish>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        fishList.add(Fish(R.drawable.fisheries_govt_logo, "Elish"))
        fishList.add(Fish(R.drawable.fisheries_govt_logo, "Rui"))
        fishList.add(Fish(R.drawable.fisheries_govt_logo, "Katol"))
        fishList.add(Fish(R.drawable.fisheries_govt_logo, "Boal"))
        fishList.add(Fish(R.drawable.fisheries_govt_logo, "Shoil"))
        fishList.add(Fish(R.drawable.fisheries_govt_logo, "Taki"))
        fishList.add(Fish(R.drawable.fisheries_govt_logo, "Koi"))
        fishList.add(Fish(R.drawable.fisheries_govt_logo, "Surma"))
        fishList.add(Fish(R.drawable.fisheries_govt_logo, "Loitta"))
        fishList.add(Fish(R.drawable.fisheries_govt_logo, "Churi"))
        fishList.add(Fish(R.drawable.fisheries_govt_logo, "Lakkha"))
        fishList.add(Fish(R.drawable.fisheries_govt_logo, "Mrigel"))
        fishList.add(Fish(R.drawable.fisheries_govt_logo, "Kachki"))
        fishList.add(Fish(R.drawable.fisheries_govt_logo, "Puti"))
        fishList.add(Fish(R.drawable.fisheries_govt_logo, "Tengra"))

        rv_showListItemId.layoutManager = GridLayoutManager(this, 2)
//        rv_showListItemId.layoutManager = LinearLayoutManager(this)
        rv_showListItemId.adapter = ExampleAdapter(this, fishList)
    }
}
