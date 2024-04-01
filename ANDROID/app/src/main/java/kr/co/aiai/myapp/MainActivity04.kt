package kr.co.aiai.myapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity04 : AppCompatActivity() {

    private lateinit var tv1: TextView
    private lateinit var tv2: TextView
    private lateinit var tv3: TextView
    private lateinit var tv4: TextView
    private lateinit var tv5: TextView
    private lateinit var tv6: TextView
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main04)

        tv1 = findViewById(R.id.tv1)
        tv2 = findViewById(R.id.tv2)
        tv3 = findViewById(R.id.tv3)
        tv4 = findViewById(R.id.tv4)
        tv5 = findViewById(R.id.tv5)
        tv6 = findViewById(R.id.tv6)
        button = findViewById(R.id.button)

        button.setOnClickListener(View.OnClickListener {
            generateLottoNumbers()
        })
    }

    private fun generateLottoNumbers() {
        var lottoNumbers = arrayOfNulls<Int>(45)

        // 1부터 45까지의 숫자를 배열에 저장
        for (i in 0 until lottoNumbers.size) {
            lottoNumbers[i] = i + 1
        }

        val list: MutableList<Int?> = lottoNumbers.toMutableList()
        Collections.shuffle(list)
        lottoNumbers = list.toTypedArray()  // 수정된 부분

        // 배열 중 앞 6개 출력
        tv1.text = lottoNumbers[0].toString()
        tv2.text = lottoNumbers[1].toString()
        tv3.text = lottoNumbers[2].toString()
        tv4.text = lottoNumbers[3].toString()
        tv5.text = lottoNumbers[4].toString()
        tv6.text = lottoNumbers[5].toString()
    }
}
