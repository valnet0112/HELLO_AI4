package kr.co.aiai.myapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity01 : AppCompatActivity() {

    lateinit var tv : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main01)

        val btn: Button = findViewById(R.id.btn)
        tv = findViewById(R.id.tv)

        btn.setOnClickListener {
            myclick()

        }
    }

    private fun myclick() {
        tv.text = "Good Evening"
    }
}