package kr.co.aiai.myapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity03 : AppCompatActivity() {

    private lateinit var etDan: EditText
    private lateinit var btn: Button
    private lateinit var etDisp: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main03)

        etDan = findViewById(R.id.et_dan)
        btn = findViewById(R.id.btn)
        etDisp = findViewById(R.id.et_disp)

        btn.setOnClickListener(View.OnClickListener {
            val danStr = etDan.text.toString()

            if (!danStr.isEmpty()) {
                val dan = danStr.toInt()
                displayMultiplicationTable(dan)
            } else {
                etDisp.text = "단수를 입력하세요."
            }
        })
    }

    private fun displayMultiplicationTable(dan: Int) {
        val result = StringBuilder()

        for (i in 1..9) {
            val product = dan * i
            result.append("$dan x $i = $product\n")
        }

        etDisp.text = result.toString()
    }
}
