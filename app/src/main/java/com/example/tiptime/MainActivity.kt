package com.example.tiptime

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

//    private lateinit var binding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myWebView = findViewById<WebView>(R.id.webview) as WebView

//        myWebView.loadUrl("https://www.instagram.com/")
        myWebView.loadUrl(" https://42eb-125-23-34-124.ngrok-free.app")
        myWebView.settings.javaScriptEnabled = true

        myWebView.webViewClient = WebViewClient()

//        if(savedInstanceState !== null) {
//
//        }
//        setContentView(myWebView)


//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        binding.calculateButton.setOnClickListener {
//            calculateTip()
//        }
//
//        binding.costOfServiceText.setOnKeyListener { view, keyCode, _ ->
//            handleKeyEvent(
//                view,
//                keyCode
//            )
//        }
    }

//    private fun handleKeyEvent(view: View, keyCode: Int): Boolean {
//        if (keyCode == KeyEvent.KEYCODE_ENTER) {
//            // Hide the keyboard
//            val inputMethodManager =
//                getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
//            inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
//            return true
//        }
//        return false
//    }
//
//    private fun calculateTip() {
//        val stringInTextField = binding.costOfServiceText.text.toString()
//        val cost = stringInTextField.toDoubleOrNull()
//
//        if (cost == null || cost == 0.0) {
//            displayTip(0.0)
//            return
//        }
//
//        val tipPercentage = when (binding.tipOptions.checkedRadioButtonId) {
//            R.id.option_twenty_percent -> 0.20
//            R.id.option_eighteen_percent -> 0.18
//            else -> 0.15
//        }
//
//        var tip = tipPercentage * cost
//
//        if (binding.roundUpSwitch.isChecked) {
//            tip = kotlin.math.ceil(tip)
//        }
//
//        displayTip(tip)
//
//    }
//
//    private fun displayTip(tip: Double) {
//        val formattedTip = NumberFormat.getCurrencyInstance().format(tip)
//        binding.tipResult.text = getString(R.string.tip_amount, formattedTip)
//    }
}