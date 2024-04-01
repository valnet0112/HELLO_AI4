package kr.co.aiai.myapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity05 : AppCompatActivity() {

    private lateinit var tv: TextView
    private lateinit var btn1: Button
    private lateinit var btn2: Button
    private lateinit var btn3: Button
    private lateinit var btn4: Button
    private lateinit var btn5: Button
    private lateinit var btn6: Button
    private lateinit var btn7: Button
    private lateinit var btn8: Button
    private lateinit var btn9: Button
    private lateinit var btn0: Button
    private lateinit var btnCall: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main05)

        tv = findViewById(R.id.tv)
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)
        btn5 = findViewById(R.id.btn5)
        btn6 = findViewById(R.id.btn6)
        btn7 = findViewById(R.id.btn7)
        btn8 = findViewById(R.id.btn8)
        btn9 = findViewById(R.id.btn9)
        btn0 = findViewById(R.id.btn0)
        btnCall = findViewById(R.id.btn_call)

        btn1.setOnClickListener { handleButtonClick("1") }
        btn2.setOnClickListener { handleButtonClick("2") }
        btn3.setOnClickListener { handleButtonClick("3") }
        btn4.setOnClickListener { handleButtonClick("4") }
        btn5.setOnClickListener { handleButtonClick("5") }
        btn6.setOnClickListener { handleButtonClick("6") }
        btn7.setOnClickListener { handleButtonClick("7") }
        btn8.setOnClickListener { handleButtonClick("8") }
        btn9.setOnClickListener { handleButtonClick("9") }
        btn0.setOnClickListener { handleButtonClick("0") }

        btnCall.setOnClickListener { handleCallButtonClick() }
    }

    private fun handleButtonClick(number: String) {
        val currentText = tv.text.toString()
        tv.text = currentText + number
    }

    private fun handleCallButtonClick() {
        val phoneNumber = tv.text.toString()
        Toast.makeText(this, "Calling: $phoneNumber", Toast.LENGTH_SHORT).show()
    }
}
