package com.example.fisheries

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.model_list_item.view.*

class ExampleAdapter(val context: Context, val fishList: ArrayList<Fish>) :
    RecyclerView.Adapter<ExampleViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {
        return ExampleViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.model_list_item,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return fishList.size
    }

    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {
        holder.imageIv.setImageResource(R.drawable.ic_launcher_background)
        holder.nameTv.text = fishList[position].fishName

        holder.cardView.setOnClickListener{
            Toast.makeText(context, ""+fishList[position], Toast.LENGTH_LONG).show()
        }
    }
}

class ExampleViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val cardView = view.cv_itemClickId
    val imageIv = view.iv_imageId
    val nameTv = view.tv_nameId
}