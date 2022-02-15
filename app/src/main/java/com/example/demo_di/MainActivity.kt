package com.example.demo_di

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.example.demo_di.di.annotiation.Detail
import com.example.demo_di.ultis.IClick
import com.example.demo_di.ultis.Status
import com.example.demo_di.viewmodel.Animal
import com.example.demo_di.viewmodel.MainViewModel
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var viewmodeFactory: ViewModelProvider.Factory
    @Inject lateinit var viewmainModle: MainViewModel
    @Inject lateinit var views:MainViewModel
    @Inject lateinit var animal: Animal
    @com.example.demo_di.di.annotiation.Button
    @Inject lateinit var clickButton :IClick

    @Detail
    @Inject lateinit var clickDetailt:IClick
    lateinit var name: TextView
    lateinit var btnSearch: Button
    lateinit var searchBox: EditText
    lateinit var imgeView: ImageView
    lateinit var pg: ProgressBar
    override fun onCreate(savedInstanceState: Bundle?) {
        val a = (application as MyApplication).appComponent.exposeActivityComponent().create()
        a.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("TAG", "onCreate: "+ a)
     //   viewmainModle = ViewModelProvider(this, viewmodeFactory)[MainViewModel::class.java]
        Log.d("TAG", "viewmodel in main activity: "+ viewmainModle)
        Log.d("TAG", "onCreate: " + views)
        Log.d("TAG", "onCreate: "+ animal)
        name = findViewById(R.id.name)
        btnSearch = findViewById(R.id.btn_search)
        searchBox = findViewById(R.id.tv_search)
        imgeView = findViewById(R.id.img)
        pg = findViewById(R.id.pg)
        pg.visibility = View.GONE


        viewmainModle.result.observe(this, Observer {
            pg.visibility = View.GONE
            if (it.status == Status.SUCCESS) {
                name.setText(it.data?.login)
                Glide.with(this).load(it.data?.avatarURL).into(imgeView)
                Log.d("TAG", "onCreate: " + it.data?.avatarURL)


            } else if (it.status == Status.LOADING) {
                pg.visibility = View.VISIBLE
            } else {
                name.setText(it.msg)
            }
        })
        btnSearch.setOnClickListener {
            viewmainModle.getSearchResult(searchBox.text.toString())
           clickButton.click()
        }

        name.setOnClickListener {
            clickDetailt.click()
            val intent = Intent(this, DetailActivity::class.java)
            startActivity(intent)
        }


    }
}