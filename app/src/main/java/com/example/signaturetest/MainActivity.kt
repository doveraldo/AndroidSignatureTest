package com.example.signaturetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.signaturetest.databinding.ActivityMainBinding
import android.R
import android.view.View

import android.widget.RelativeLayout
import layout.MySignatureCapture


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var signatureCapture: MySignatureCapture

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        signatureCapture = MySignatureCapture(this)
        binding.root.addView(signatureCapture)
        setContentView(binding.root)
    }
}