package com.example.projetoemulador

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val TAG ="INFOTESTE"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        setContentView(R.layout.activity_main)
        binding.txtNome.text="curso kotlin"
        Log.i(TAG, "OnCreate")


        }

    /*2 esta visivel ao usuario*/
    override fun onStart() {
        super.onStart()
        Log.i(TAG, "OnStart")
    }
    /*3 pronta para usar*/
    /*override fun onResume() {
        super.onResume()
        Log.i(TAG, "OnResume")
    }*/
    /*4 saindo da activity*/
    override fun onPause() {
        super.onPause()
        Log.i(TAG, "OnPause")
    }
    /*5 esta invisivel ao usuario*/
    /*override fun onStop() {
        super.onStop()
        Log.i(TAG, "OnStop")
    }
    /*6 remove activity da memoria*/
    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "OnDestroy")
    }*/
    }