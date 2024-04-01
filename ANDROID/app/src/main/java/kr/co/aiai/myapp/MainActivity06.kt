package kr.co.aiai.myapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity06 : AppCompatActivity() {

    private lateinit var tvFirst: TextView
    private lateinit var tvLast: TextView
    private lateinit var tvDisp: TextView
    private lateinit var etFirst: EditText
    private lateinit var etLast: EditText
    private lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main06)

        tvFirst = findViewById(R.id.tv_first)
        tvLast = findViewById(R.id.tv_last)
        tvDisp = findViewById(R.id.tv_disp)
        etFirst = findViewById(R.id.et_first)
        etLast = findViewById(R.id.et_last)
        btn = findViewById(R.id.btn)

        btn.setOnClickListener {
            drawStars()
        }
    }

    private fun drawStars() {
        val strFirst = etFirst.text.toString()
        val strLast = etLast.text.toString()

        if (strFirst.isEmpty() || strLast.isEmpty()) {
            // 입력값이 비어있을 경우 처리
            tvDisp.text = "첫별수와 끝별수를 모두 입력하세요."
            return
        }

        val first = strFirst.toInt()
        val last = strLast.toInt()

        if (first > last) {
            // 첫별수가 끝별수보다 큰 경우 처리
            tvDisp.text = "첫별수는 끝별수보다 작거나 같아야 합니다."
            return
        }

        // 입력된 범위의 별을 생성하여 텍스트뷰에 표시
        val stars = StringBuilder()
        for (i in first..last) {
            stars.append(getStarsLine(i))
        }

        // 텍스트뷰에 별 표시
        tvDisp.text = stars.toString()
    }

    // 주어진 갯수만큼의 별(*)을 포함한 문자열 반환 메서드
    private fun getStarsLine(count: Int): String {
        val starLine = StringBuilder()
        repeat(count) {
            starLine.append("*")
        }
        starLine.append("\n")
        return starLine.toString()
    }
}
