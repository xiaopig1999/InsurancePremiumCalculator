package com.example.insurancepremiumcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Spinner
import android.widget.Switch
import androidx.core.view.get
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button2.setOnClickListener(){
            radgrp.clearCheck()
            checkBox.setChecked(false);
            spinner.setSelection(0)
            result.text = "0"
        }

        button.setOnClickListener(){
            val getPremium = getPremium()
            result.text = getPremium.toString()
        }

    }



    fun getPremium():Double{
        return when(spinner.selectedItemPosition){
            0 -> 60.00
            1 -> 70.00 +
                    (if(radioButton.isChecked) 50.00 else 0.0) +
                    (if(checkBox.isChecked) 100.00 else 0.0)
            2 -> 90.00 +
                    (if(radioButton.isChecked) 100.00 else 0.0) +
                    (if(checkBox.isChecked) 150.00 else 0.0)
            3 -> 120.00 +
                    (if(radioButton.isChecked) 150.00 else 0.0) +
                    (if(checkBox.isChecked) 200.00 else 0.0)
            4 -> 150.00 +
                    (if(radioButton.isChecked) 200.00 else 0.0) +
                    (if(checkBox.isChecked) 250.00 else 0.0)
            else -> 150.00 +
                    (if(radioButton.isChecked) 200.00 else 0.0) +
                    (if(checkBox.isChecked) 300.00 else 0.0)
        }
    }

}
