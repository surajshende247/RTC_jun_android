package org.roadtocode.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("DebugMainActivity", "onCreate() Called")
        Toast.makeText(this, "onCreate() Called", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("DebugMainActivity", "onRestart() Called")
        Toast.makeText(this, "onRestart() Called", Toast.LENGTH_SHORT).show()
    }


    override fun onResume() {
        super.onResume()
        Log.d("DebugMainActivity", "onResume() Called")
        Toast.makeText(this, "onResume() Called", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d("DebugMainActivity", "onPause() Called")
        Toast.makeText(this, "onPause() Called", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d("DebugMainActivity", "onStop() Called")
        Toast.makeText(this, "onStop() Called", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("DebugMainActivity", "onDestroy() Called")
        Toast.makeText(this, "onDestroy() Called", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Log.d("DebugMainActivity", "onStart() Called")
        Toast.makeText(this, "onStart() Called", Toast.LENGTH_SHORT).show()
    }

    

}