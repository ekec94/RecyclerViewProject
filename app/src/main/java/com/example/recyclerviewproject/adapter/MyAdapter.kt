package com.example.recyclerviewproject.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewproject.R
import com.example.recyclerviewproject.models.MyModel

// Translates the data to the widget on screen

class MyAdapter (
    var context: Context, var arrayList: ArrayList<MyModel>
    ): RecyclerView.Adapter<MyAdapter.ItemHolder>() {

        class ItemHolder(itemView: View): RecyclerView.ViewHolder(itemView){
            var icon = itemView.findViewById<ImageView>(R.id.idIconImg)
            var caption = itemView.findViewById<TextView>(R.id.idTextTitle)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val itemHolder = LayoutInflater.from(parent.context).inflate(R.layout.grid_item, parent, false)
        return ItemHolder(itemHolder)
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        val myCard: MyModel = arrayList[position] // arrayList.get(position)

        holder.icon.setImageResource(myCard.iconsCard!!)
        holder.caption.text = myCard.textCard

        holder.icon.setOnClickListener{
            Toast.makeText(context, myCard.textCard, Toast.LENGTH_LONG).show()
        }
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

}