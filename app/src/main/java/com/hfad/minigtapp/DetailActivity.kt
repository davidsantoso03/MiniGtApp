package com.hfad.minigtapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class DetailActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_activity)


            getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)

        var buy = findViewById<Button>(R.id.btn_buy)
        var fav = findViewById<Button>(R.id.btn_fav)

        buy.setOnClickListener {
            Toast.makeText(this, "Thanks for purchase", Toast.LENGTH_SHORT).show()
        }
        fav.setOnClickListener {
            Toast.makeText(this, "added to favorite", Toast.LENGTH_SHORT).show()
        }

        var intent = intent
        val name = intent.getStringExtra("nama")
        val detil = intent.getStringExtra("detail")
        val foto = intent.getIntExtra("photo", 0)
        val harga = intent.getStringExtra("price")
        val status = intent.getStringExtra("status")

        var tvname = findViewById<TextView>(R.id.tv_item_name)
        tvname.text = name
        var tvdetil = findViewById<TextView>(R.id.tv_item_desc)
        tvdetil.text = detil
        var tvfoto = findViewById<ImageView>(R.id.iv_photo)
        tvfoto.setImageResource(foto)
        var tvharga = findViewById<TextView>(R.id.tv_item_price)
        tvharga.text = harga
        var tvstatus = findViewById<TextView>(R.id.tv_item_status)
        tvstatus.text = status


    }


}