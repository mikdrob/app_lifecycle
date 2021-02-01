package com.example.demo01lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(Tag, "onCreate")
        setContentView(R.layout.activity_second)
    }
    companion object{
        private val Tag = this::class.java.declaringClass!!.simpleName
    }
    override fun onStart() {
        super.onStart()
        Log.d(SecondActivity.Tag, "onStart")
    }
    override fun onResume() {
        super.onResume()
        Log.d(Tag, "onResume")
    }
    override fun onPause() {
        super.onPause()
        Log.d(Tag, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(Tag, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(Tag, "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(Tag, "onRestart")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(Tag, "onSaveInstanceState")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d(Tag, "onRestoreInstanceState")
    }

    fun buttonOnClick(view: View) {
        finish()
    }
}