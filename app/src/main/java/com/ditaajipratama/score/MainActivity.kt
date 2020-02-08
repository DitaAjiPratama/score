package com.ditaajipratama.score

import android.content.Context
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.VibrationEffect
import android.os.Vibrator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plusRed.setOnClickListener {
            vibratePhone()
        }
        minusRed.setOnClickListener {
            vibratePhone()
        }
        plusBlue.setOnClickListener {
            vibratePhone()
        }
        minusBlue.setOnClickListener {
            vibratePhone()
        }

    }

    fun vibratePhone() {
        val vibrator = this.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        if (Build.VERSION.SDK_INT >= 26) {
            vibrator.vibrate(VibrationEffect.createOneShot(60, VibrationEffect.DEFAULT_AMPLITUDE))
        }
        else {
            vibrator.vibrate(60)
        }
    }
}
