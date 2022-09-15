package com.naveen.servicedemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.naveen.servicedemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val serviceIntent = Intent(this, MyBackgroundService::class.java)
        binding.btnStart.setOnClickListener{
            Log.i("MYTAG", "Starting Service")
           startService(serviceIntent)
        }
        binding.btnStop.setOnClickListener {
            Log.i("MYTAG", "Stopping Service")
             stopService(serviceIntent)
        }
    }
}
