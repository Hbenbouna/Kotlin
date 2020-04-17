package firstapp.Kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    fun sendMessage(view: View) {
        var content : String = editText2.text.toString()
        println("Content : $content")
        val intent = Intent(this, Activity2::class.java).apply {
            putExtra(Intent.EXTRA_TEXT, content)
        }
        startActivity(intent)
    }
}
