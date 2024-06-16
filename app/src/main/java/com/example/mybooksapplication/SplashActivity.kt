package com.example.mybooksapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

            // Создаем объект Handler
            Handler().postDelayed({
                // Создаем объект Intent для запуска другой активити
                val intent = Intent(this, MainActivity::class.java)
                // Запускаем другую активити
                startActivity(intent)
                // Закрываем текущую активити
                finish()
            }, 3000) // Указываем задержку в 3 секунды (3000 миллисекунд)
        }
    }
