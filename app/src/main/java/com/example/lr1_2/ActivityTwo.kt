package com.example.lr1_2

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
class ActivityTwo : AppCompatActivity(), View.OnClickListener {
    private val tag = "States"
    private var btnActTwo: Button? = null
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnActTwo = findViewById<View>(R.id.btn_go_to) as Button
        btnActTwo!!.setOnClickListener(this)
        Log.d(tag, "MainActivity: onCreate()")
    }
    override fun onRestart() {
        super.onRestart()
        Log.d(tag, "MainActivity: onRestart()")
    }
    override fun onStart() {super.onStart()
        Log.d(tag, "MainActivity: onStart()")
    }
    override fun onResume() {
        super.onResume()
        Log.d(tag, "MainActivity: onResume()")
    }
    override fun onPause() {
        super.onPause()
        Log.d(tag, "MainActivity: onPause()")
    }
    override fun onStop() {
        super.onStop()
        Log.d(tag, "MainActivity: onStop()")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag, "MainActivity: onDestroy()")
    }
    override fun onClick(v: View) {
        finish()
    }
}