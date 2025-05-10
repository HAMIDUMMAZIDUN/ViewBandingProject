package edu.unikom.eduviewbandingproject

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    //private lateinit var txtValue: TextView
    //private lateinit var btnValue: Button

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutinflater)
        setContentView(binding.root)
        binding.txtViewBinding.text = "ini adalah TextView dari hasil binding"

        binding.btnViewBinding.setOnClickListener {
            binding.txtViewBinding.text = "Text View nya berubah setelah di klik"
        }

        //setContentView(R.layout.activity_main)
        //txtValue = findViewByid(R.id.txtViewBinding)
        //btnValue = findViewByid(R.id.tbtnViewBinding)

        /*
        btnValue.setOnClickListener {
            txtValue.text = "Text View nya berubah setelah di klik"
        }
    }
}