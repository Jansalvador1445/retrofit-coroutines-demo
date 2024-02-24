package com.example.esgueera

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings.Global
import android.telecom.Call
import android.util.Log
import android.widget.Button
import android.widget.TextView
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.security.auth.callback.Callback

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val productsApi = RetrofitHelper.getInstance().create(ProductAPI::class.java)
        val txtView: TextView = findViewById<TextView>(R.id.txtView)

        GlobalScope.launch {
            val result = productsApi.getProducts()
            if (result != null) {
                Log.d("ayush: ", result.body().toString())
            }
        }
    }
}