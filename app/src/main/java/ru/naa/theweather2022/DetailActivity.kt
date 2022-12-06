package ru.naa.theweather2022

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import ru.naa.theweather2022.databinding.ActivityDetailBinding
class DetailActivity : AppCompatActivity() {

    lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.icBackup.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}