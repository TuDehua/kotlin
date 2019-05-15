package com.tdh.kotlinlearn

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv.text = ""
        tv.visibility = View.GONE
        onClick()

    }

    fun onClick(){
        toast("123")
        startActivity<MainActivity>("type" to 1, "value" to "noValue")
        toast("222")
    }
}
