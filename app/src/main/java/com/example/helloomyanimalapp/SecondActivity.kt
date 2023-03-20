package com.example.helloomyanimalapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.helloomyanimalapp.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val cat1 = intent.getParcelableExtra<Animal>(MainActivity.ANIMAL_KEY1)
        val cat2 = intent.getParcelableExtra<Animal>(MainActivity.ANIMAL_KEY2)
        val cat3 = intent.getParcelableExtra<Animal>(MainActivity.ANIMAL_KEY3)
        cat1?.let {
            val catStr =
                "Name: ${cat1.name}, age: ${cat1.age}, owner name: ${cat1.ownerName}, color: ${cat1.color}, species: ${cat1.species}, sex: ${cat1.sex}"
            binding.textView77.text = catStr

        }

        cat2?.let {
            val catStr =
                "Name: ${cat2.name}, age: ${cat2.age}, owner name: ${cat2.ownerName}, color: ${cat2.color}, species: ${cat2.species}, sex: ${cat2.sex}"
            binding.textView77.text = catStr

        }

        cat3?.let {
            val catStr =
                "Name: ${cat3.name}, age: ${cat3.age}, owner name: ${cat3.ownerName}, color: ${cat3.color}, species: ${cat3.species}, sex: ${cat3.sex}"
            binding.textView77.text = catStr

        }


    }
}