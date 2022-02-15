package com.example.demo_di

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.demo_di.viewmodel.Animal
import com.example.demo_di.viewmodel.MainViewModel
import javax.inject.Inject
import kotlin.math.log

class DetailActivity : AppCompatActivity() {
    @Inject
    lateinit var viewmodelFactory: ViewModelProvider.Factory
    @Inject lateinit var viewmodel: MainViewModel
    @Inject lateinit var animal:Animal
    override fun onCreate(savedInstanceState: Bundle?) {
        val a = (application as MyApplication).appComponent.exposeActivityComponent().create()
        a.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        Log.d("TAG", "onCreate: "+ a)
//        viewmodel = ViewModelProvider(this, viewmodelFactory)[MainViewModel::class.java]
        Log.d("TAG", "onCreate: " + viewmodelFactory)
        Log.d("TAG", "onCreate: "+ animal)
        Log.d("TAG", "viewmodel in detail activity: "+ viewmodel)
        val textView = findViewById<TextView>(R.id.detail)
        val detail = viewmodel.result.value?.data
        textView.setText(detail.toString())
    }
}