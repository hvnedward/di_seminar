package com.example.demo_di.ultis

import android.content.Context
import android.widget.Toast
import dagger.hilt.android.qualifiers.ActivityContext
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class MovingScreen @Inject constructor(@ActivityContext val context: Context) : ICLick {
    override fun toast() {
        Toast.makeText(context, "Moving screen", Toast.LENGTH_SHORT).show()
    }
}