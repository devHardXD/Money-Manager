package com.example.moneymanager
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.widget.AppCompatImageButton

class MainActivity : AppCompatActivity() {

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<AppCompatImageButton>(R.id.buttonAnalyst);
        button1.setOnClickListener {
            val intent = Intent(this,Analyst :: class.java)
            startActivity(intent)
        }

        val button2 = findViewById<AppCompatImageButton>(R.id.buttonWallet)
        button2.setOnClickListener {
            val intent = Intent(this, Wallet::class.java)
            startActivity(intent)
        }

        val button3 = findViewById<AppCompatImageButton>(R.id.buttonCard)
        button3.setOnClickListener {
            val intent = Intent(this, Card::class.java)
            startActivity(intent)
        }

        val button4 = findViewById<AppCompatImageButton>(R.id.buttonExport)
        button4.setOnClickListener {
            val intent = Intent(this, Export::class.java)
            startActivity(intent)
        }
        // Add your code here to initialize the UI elements and handle user interactions
    }
}