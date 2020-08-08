package jp.techacademy.shuu.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {

            val num1 = editText1.text.toString().toDouble()
            val num2 = editText2.text.toString().toDouble()

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("VALUE1", num1)
            intent.putExtra("VALUE2",num2)
            startActivity(intent)
        }

        button2.setOnClickListener {

            val num3 = editText1.text.toString().toDouble()
            val num4 = editText2.text.toString().toDouble()


                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("VALUE3", num3)
                intent.putExtra("VALUE4",num4)
                startActivity(intent)
        }

        button3.setOnClickListener {

            val num5 = editText1.text.toString().toDouble()
            val num6 = editText2.text.toString().toDouble()

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("VALUE5", num5)
            intent.putExtra("VALUE6",num6)
            startActivity(intent)
        }

        button4.setOnClickListener {

            val num7 = editText1.text.toString().toDouble()
            val num8 = editText2.text.toString().toDouble()

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("VALUE7", num7)
            intent.putExtra("VALUE8",num8)
            startActivity(intent)
        }


    }
}
