// Create a RecyclerView
// Populate it with 25 images and a captions
// Have the text popup when clicked (caption pops up when image is clicked)

package com.example.recyclerviewproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewproject.adapter.MyAdapter
import com.example.recyclerviewproject.models.MyModel

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var gridLayoutManager: GridLayoutManager
    lateinit var arrayList: ArrayList<MyModel>
    lateinit var thisAdapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // setup
        recyclerView = findViewById(R.id.idRV1)
        gridLayoutManager = GridLayoutManager(applicationContext, 3, LinearLayoutManager.VERTICAL, false)
        recyclerView.layoutManager = gridLayoutManager
        recyclerView.setHasFixedSize(true)

        // data
        arrayList = setupData()
        thisAdapter = MyAdapter(applicationContext, arrayList)
        recyclerView.adapter = thisAdapter

    }

    private fun setupData(): ArrayList<MyModel>{
        val items: ArrayList<MyModel> = ArrayList()

        // array list items
        items.add(MyModel(R.drawable.r11, "#9A3B3B"))
        items.add(MyModel(R.drawable.r12, "#C08261"))
        items.add(MyModel(R.drawable.r13, "#E2C799"))

        items.add(MyModel(R.drawable.r21, "#F2ECBE"))
        items.add(MyModel(R.drawable.r22, "#FFDDCC"))
        items.add(MyModel(R.drawable.r23, "#FFCCCC"))

        items.add(MyModel(R.drawable.r31, "#102C57"))
        items.add(MyModel(R.drawable.r32, "#DAC0A3"))
        items.add(MyModel(R.drawable.r33, "#EADBC8"))

        items.add(MyModel(R.drawable.r41, "#739072"))
        items.add(MyModel(R.drawable.r42, "#4F6F52"))
        items.add(MyModel(R.drawable.r43, "#3A4D39"))

        items.add(MyModel(R.drawable.r51, "#B3C8CF"))
        items.add(MyModel(R.drawable.r52, "#BED7DC"))
        items.add(MyModel(R.drawable.r53, "#F1EEDC"))

        items.add(MyModel(R.drawable.r61, "#49243E"))
        items.add(MyModel(R.drawable.r62, "#704264"))
        items.add(MyModel(R.drawable.r63, "#BB8493"))

        items.add(MyModel(R.drawable.r71, "#35374B"))
        items.add(MyModel(R.drawable.r72, "#344955"))
        items.add(MyModel(R.drawable.r73, "#50727B"))

        items.add(MyModel(R.drawable.r81, "#B5C0D0"))
        items.add(MyModel(R.drawable.r82, "#CCD3CA"))
        items.add(MyModel(R.drawable.r83, "#EED3D9"))

        items.add(MyModel(R.drawable.r91, "#8CB9BD"))
        items.add(MyModel(R.drawable.r92, "#FEFBF6"))
        items.add(MyModel(R.drawable.r93, "#ECB159"))

        return items
    }
}