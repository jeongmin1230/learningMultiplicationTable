package com.example.learningmultiplicationtable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import java.lang.Integer.parseInt

class ShowActivity : AppCompatActivity() {

    val TAG : String = "jeongmin"
    lateinit var tvResult : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show)

        init()
    }
    private fun init() {
        tvResult = findViewById(R.id.tvResult) // 결과 보여주기 위해 tvResult 를 가져옴

        if(intent.hasExtra("input")) {
            Log.d(TAG, "intent 에서 넘어온 값 : " + intent.getStringExtra("input"))
            tvResult.text = intent.getStringExtra("input") + "단 결과\n\n"
        } else {
            Log.d(TAG, "넘어온 값이 없습니다.")
        }
        multiplicationTable()
    }
    // *단 보여주는 함수
    private fun multiplicationTable() {
        tvResult = findViewById(R.id.tvResult)
        val intentValue = intent.getStringExtra("input")
        var intentValueToInt = parseInt(intentValue)

        for(i : Int in 1..9) {
            Log.d(TAG, intentValue + " x " + i + " = " + intentValueToInt*i)
            tvResult.append(intentValue + " x " + i + " = " + intentValueToInt*i + "\n")
        }
    }

    fun onClickBack(view: View) {
        val intent = Intent(this, MainActivity::class.java)

        startActivity(intent)
    }
}