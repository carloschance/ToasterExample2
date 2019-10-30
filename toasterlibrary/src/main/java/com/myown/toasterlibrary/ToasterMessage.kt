package com.myown.toasterlibrary

import android.content.Context
import android.widget.Toast

class ToasterMessage {

    fun Context.s(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }

}