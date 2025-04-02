package vcmsa.ci.demo

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // find the TextView by Id
        val textview1 = findViewById<TextView>(R.id.textView2)

        //find the Button by Id
        val button1 = findViewById<Button>(R.id.start)

        //find the Edit text by Id
        val editText = findViewById<EditText>(R.id.input1)

        // find the Textview by  Id
        val textView = findViewById<TextView>(R.id.myanswer1)

        // find the Button by Id
        val button2 = findViewById<Button>(R.id.reset)

        button1.setOnClickListener{
            val text = editText.text.toString()

            if (text == "Morning"|| text == "morning"){
                textview1.text = "Eat bacon and eggs"

            }else if (text == "Mid morning" || text == "mid morning"){
                textview1.text = "Eat greek yogurt with strawberries"

            }else if (text == "Afternoon" || text == "afternoon"){
                textview1.text = "Eat kale chips"

            }else if (text == "Mid afternoon" || text == "mid afternoon"){
                textview1.text = "Eat hard boiled eggs"

            }else if (text == "Dinner" || text == "dinner"){
                textview1.text = "Eat chicken pasta"

                // Title: Meal suggestion app
                // Author: w3schools
                // Date: 30 March 2025
                // Version: 1.0
                // Available: https://www.w3schools.com/

            }
        }
        button2.setOnClickListener {
            editText.text.clear()
            textview1.text = "Enter new data"
        }} }




