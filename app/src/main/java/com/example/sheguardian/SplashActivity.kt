package com.example.sheguardian

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.sheguardian.databinding.ActivitySplashBinding


class SplashActivity : AppCompatActivity() {
    lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_splash)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_splash)
        binding.pbProgress.visibility = View.VISIBLE

        Handler().postDelayed({
            binding.pbProgress.visibility = View.GONE
            val i = Intent(applicationContext, MainActivity::class.java)
            startActivity(i)
        }, 5000)
    }
}