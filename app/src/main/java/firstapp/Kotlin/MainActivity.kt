package firstapp.Kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_2.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun ex1(view: View) {
        val intent = Intent(this, Main2Activity::class.java)
        startActivity(intent)
    }
    fun ex2(view: View) {
        val intent = Intent(this, Login::class.java)
        startActivity(intent)
    }
    fun ex3(view: View) {
        val intent = Intent(this, Main3Activity::class.java)
        startActivity(intent)
    }



}
