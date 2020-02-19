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

        var red         = 0
        var blue        = 0

        scoreRed.text   = red.toString()
        scoreBlue.text  = blue.toString()

        plusRed.setOnClickListener {
            red++
            scoreRed.text = red.toString()
            vibratePhone()
        }

        minusRed.setOnClickListener {
            red--
            scoreRed.text = red.toString()
            vibratePhone()
        }

        plusBlue.setOnClickListener {
            blue++
            scoreBlue.text = blue.toString()
            vibratePhone()
        }

        minusBlue.setOnClickListener {
            blue--
            scoreBlue.text = blue.toString()
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
