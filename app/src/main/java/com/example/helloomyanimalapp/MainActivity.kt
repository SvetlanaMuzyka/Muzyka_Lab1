package com.example.helloomyanimalapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.helloomyanimalapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val cat1 = Animal("Markiza", 3, "black", "Maks", "British Shorthair", "female")
        val cat2 = Animal("Jack", 2, "white", "Nastya", "Common", "male")
        val cat3 = Animal("Ammy", 6, "grey", "Ruslana", "American Bobtail", "female")
        cat1?.let {
            val cat1Str = "${cat1.name}"
            val cat1StrAge = "Age: ${cat1.age}"
            binding.textView2.text = cat1StrAge
            binding.textView.text = cat1Str
        }

        cat2?.let {
            val cat2Str = "${cat2.name}"
            val cat2StrAge = "Age: ${cat2.age}"
            binding.textView4.text = cat2StrAge
            binding.textView3.text = cat2Str
        }

        cat3?.let {
            val cat3Str = "${cat3.name}"
            val cat3StrAge = "Age: ${cat3.age}"
            binding.textView6.text = cat3StrAge
            binding.textView5.text = cat3Str
        }

        binding.button1.setOnClickListener {
            val intent1 = Intent(this, SecondActivity::class.java)
            intent1.putExtra(ANIMAL_KEY1, cat1)
            startActivity(intent1)
        }

        binding.button2.setOnClickListener {
            val intent2 = Intent(this, SecondActivity::class.java)
            intent2.putExtra(ANIMAL_KEY2, cat2)
            startActivity(intent2)
        }

        binding.button3.setOnClickListener {
            val intent3 = Intent(this, SecondActivity::class.java)
            intent3.putExtra(ANIMAL_KEY3, cat3)
            startActivity(intent3)
        }
    }

    companion object {
        val ANIMAL_KEY1 = "animal_1"
        val ANIMAL_KEY2 = "animal_2"
        val ANIMAL_KEY3 = "animal_3"
    }
}