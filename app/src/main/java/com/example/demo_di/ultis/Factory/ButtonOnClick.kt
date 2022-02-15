package com.example.demo_di.ultis.Factory

import android.content.Context
import android.widget.Toast
import com.example.demo_di.di.annotiation.ActivityScope
import com.example.demo_di.ultis.IClick
import javax.inject.Inject

@ActivityScope
class ButtonOnClick  @Inject constructor(val context: Context)   :IClick{
    override fun click() {
        Toast.makeText(context, "Button Search was pressed", Toast.LENGTH_SHORT).show()
    }
}