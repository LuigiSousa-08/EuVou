package com.example.euvou

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.euvou.databinding.ActivityRegisterScreenBinding

class Register_Screen : AppCompatActivity() {
    private var binding: ActivityRegisterScreenBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterScreenBinding.inflate(layoutInflater)
        setContentView(binding?.root)
    }
}