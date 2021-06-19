package com.hfad.minigtapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toolbar
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    private lateinit var rvDiecast: RecyclerView
    private var list: ArrayList<Diecast> = arrayListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById(R.id.mytoolbar) as Toolbar?
        setSupportActionBar(toolbar)

        rvDiecast = findViewById(R.id.rv_diecast)
        rvDiecast.setHasFixedSize(true)


        list.addAll(DiecastData.listData)
        showRecyclerlist()
    }

    private fun setSupportActionBar(toolbar: Toolbar?) {
        val profilebtn = findViewById<ImageView>(R.id.profile_btn)
        profilebtn.setOnClickListener {
            startActivity(Intent(this@MainActivity, ProfileActivity::class.java))
        }
    }

    private fun showRecyclerlist() {
        rvDiecast.layoutManager = LinearLayoutManager(this)
        val listDiecastAdapter = DiecastAdapter(list)
        rvDiecast.adapter = listDiecastAdapter


        listDiecastAdapter.setOnItemClickCallback(object : DiecastAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Diecast) {
                showSelectedDiecast(data)
            }
        })

    }


    private fun showSelectedDiecast(diecast: Diecast) {
//        Toast.makeText(this, "Kamu memilih " + diecast.name, Toast.LENGTH_SHORT).show()

        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("nama", diecast.name)
        intent.putExtra("detail", diecast.detail)
        intent.putExtra("photo", diecast.photo)
        intent.putExtra("price", diecast.price)
        intent.putExtra("status", diecast.status)
        startActivity(intent)


    }

}