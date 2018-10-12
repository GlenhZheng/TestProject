package com.example.glen.testkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val x:Int = 10
        val y:Long = x.toLong()
        button.text="this is the test here. the test is to update to the server now"
        button.setOnClickListener {
            textView.text="I changed the clothes  " + y
        }
        /*this is the tag to update**/

    }

    fun Button.changeTest(content: String){
        this.setText(content)
    }
}
