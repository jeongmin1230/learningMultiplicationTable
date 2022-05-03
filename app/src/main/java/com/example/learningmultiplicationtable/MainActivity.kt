package com.example.learningmultiplicationtable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    val TAG : String = "jeongmin"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG,"처음 작동")
    }

    fun onClickNext(view: View) {
        val etInput : EditText = findViewById(R.id.etInput) // etInput 이라는 아이디 찾아오기
        val etInputValue = etInput.text.toString() // etInput 입력 값 가져오기

        etInput.text.clear() // 입력값 지우기

        var intent = Intent(this, ShowActivity::class.java)
        intent.putExtra("input", etInputValue) // 인텐트 넘어갈 때 입력값 같이 보내주기

        startActivity(intent)
        Log.d(TAG, "클릭 했을 때 입력 값 : $etInputValue")
    }
}