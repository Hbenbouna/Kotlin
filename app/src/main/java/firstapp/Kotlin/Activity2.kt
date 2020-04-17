package firstapp.Kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_2.*

class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val message : String = intent.getStringExtra(Intent.EXTRA_TEXT)

        // Capture the layout's TextView and set the string as its text
        val textView = findViewById<TextView>(R.id.textView1).apply {
            text = message
        }
    }
}
