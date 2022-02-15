package com.example.demo_di.ultis.Factory

import android.content.Context
import com.example.demo_di.ultis.IClick

enum class TypeClick {
    BUTTON,
    DETAIL
}

class IClickFactory(val context: Context) {
    fun getType(type: TypeClick): IClick? {
        if (TypeClick.BUTTON == type) {
            return ButtonOnClick(context)
        } else if (type == TypeClick.DETAIL) {
            return DetailedOnClick(context)
        }
        return null
    }
}