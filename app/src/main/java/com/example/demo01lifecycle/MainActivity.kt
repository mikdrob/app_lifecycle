package com.example.demo01lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object{
        private val Tag = this::class.java.declaringClass!!.simpleName
    }

    private var name = "Mihkel"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(Tag, "onCreate")
        setContentView(R.layout.activity_main)
    }


    override fun onStart() {
        super.onStart()
        Log.d(Tag, "onStart")
    }
    override fun onResume() {
        super.onResume()
        Log.d(Tag, "onResume")
        TextView2.text = name;
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
        outState.putString("name", name)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d(Tag, "onRestoreInstanceState")
        name = savedInstanceState.getString("name", "default") + "from state"
    }

    fun buttonSubmitOnClick(view: View) {
        TextView1.text = editTextPersonName.text;
        name = editTextPersonName.text.toString()
    }

    fun buttonLaunchOnClick(view: View) {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)

    }
}