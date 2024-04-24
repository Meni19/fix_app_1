package com.example.lr1_2

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

        setContentView(R.layout.activity_two)
        btnActTwo = findViewById<View>(R.id.btn_go_to) as Button
        btnActTwo!!.setOnClickListener(this)
        Log.d(tag, "ActivityTwo: onCreate()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(tag, "ActivityTwo: onRestart()")
    }

    override fun onStart() {
        super.onStart()
        Log.d(tag, "ActivityTwo: onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d(tag, "ActivityTwo: onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d(tag, "ActivityTwo: onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d(tag, "ActivityTwo: onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag, "ActivityTwo: onDestroy()")
    }

    override fun onClick(v: View) {
        finish()
    }
}