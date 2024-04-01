package kr.co.aiai.myapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity02 : AppCompatActivity() {

    private lateinit var tv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main02)

        tv = findViewById(R.id.tv)
        val btn: Button = findViewById(R.id.btn)

        btn.setOnClickListener(View.OnClickListener {
            myClick()
        })
    }

    private fun myClick() {
        val a: String = tv.text.toString()
        var aa = Integer.parseInt(a)
        aa--
        tv.text = aa.toString()
    }
}
