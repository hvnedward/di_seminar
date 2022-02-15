package com.example.demo_di

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.bumptech.glide.Glide
import com.example.demo_di.di.QButton
import com.example.demo_di.di.QMovingScreen
import com.example.demo_di.model.User
import com.example.demo_di.ultis.ICLick
import com.example.demo_di.ultis.Status
import com.example.demo_di.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @QButton
    @Inject
    lateinit var butonCLick: ICLick

    @QButton
    @Inject
    lateinit var butonCLick2: ICLick

    @QMovingScreen
    @Inject
    lateinit var movingScreenClick: ICLick

    @QMovingScreen
    @Inject
    lateinit var movingScreenClick2: ICLick
    val TAG = MainActivity::class.java.simpleName

    lateinit var name: TextView
    lateinit var btnSearch: Button
    lateinit var searchBox: EditText
    lateinit var imgeView: ImageView
    lateinit var pg: ProgressBar
    val viewmodle: MainViewModel by viewModels()
    var data: User? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        name = findViewById(R.id.name)
        btnSearch = findViewById(R.id.btn_search)
        searchBox = findViewById(R.id.tv_search)
        imgeView = findViewById(R.id.img)
        pg = findViewById(R.id.pg)
        pg.visibility = View.GONE
        viewmodle.result.observe(this, Observer {
            pg.visibility = View.GONE
            if (it.status == Status.LOADING) {
                pg.visibility = View.VISIBLE
            } else if (it.status == Status.SUCCESS) {
                imgeView.visibility = View.VISIBLE
                name.setText(it.data?.login)
                Glide.with(this).load(it.data?.avatarURL).into(imgeView)
                name.isEnabled = true
                data = it.data
            } else if (it.status == Status.ERROR) {
                imgeView.visibility = View.GONE
                name.setText(it.msg)
                name.isEnabled = false

            }
        })
        btnSearch.setOnClickListener {
            viewmodle.getSearchResult(searchBox.text.toString())
            butonCLick.toast()
        }
        name.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("data", data)
            movingScreenClick.toast()
            startActivity(intent)
        }

        Log.d(TAG, "onCreate: butonCLick " + butonCLick)
        Log.d(TAG, "onCreate: butonCLick2 " + butonCLick2)
        Log.d(TAG, "onCreate: movingScreenClick " + movingScreenClick)
        Log.d(TAG, "onCreate: movingScreenClick2 " + movingScreenClick2)
    }
}