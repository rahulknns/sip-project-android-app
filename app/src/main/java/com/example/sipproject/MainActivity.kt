package com.example.sipproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.sipproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var password1:Int = 3
    var password2:Int = 30

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.calculateButton.setOnClickListener{ calculateFrequencies() }

    }

    fun calculateFrequencies(){
        var key:Int = (binding.detectedFrequency.text.toString().toInt() - 9500)/50
        binding.f1.text = (1000 + (key+ password1)*50).toString()
        binding.f2.text = (1000 + (key+ password2)*50).toString()
        tone()


    }
    fun tone(){


    }
}