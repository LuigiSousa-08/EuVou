package com.example.euvou

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.example.euvou.databinding.ActivityLoginScreenBinding

class Login_Screen : AppCompatActivity() {
    private var binding: ActivityLoginScreenBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginScreenBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        acessaCadastro()

    }

    private fun acessaCadastro() {
        binding?.buttonNavegaCadastro?.setOnClickListener {
            startActivity(Intent(this, Register_Screen::class.java))
        }
    }
}