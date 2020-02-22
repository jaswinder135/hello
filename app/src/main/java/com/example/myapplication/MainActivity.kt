package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toast(view: View) {
        Toast toast = Toast.makeText(this, R.string.toast_message,Toast.LENGTH_SHORT)

        toast.show();
    }
    fun count(view: View) {}
}
