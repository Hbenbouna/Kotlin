package firstapp.Kotlin

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main3.*


class Main3Activity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        resultats.isEnabled = false
    }


    fun checkButton(v: View?) {
        val radioIdOne= radioGroupOne.checkedRadioButtonId
        val radioIdTwo = radioGroupTwo.checkedRadioButtonId
        val radioIdThree = radioGroupThree.checkedRadioButtonId
        val radioIdFour = radioGroupFour.checkedRadioButtonId
        if (radioIdOne != -1 && radioIdTwo != -1 && radioIdThree != -1 && radioIdFour != -1){
            resultats.isEnabled = true
        }


    }
    fun resultat(v: View?){
        resultats.visibility = View.GONE
        val reponseUser = arrayOf(radioGroupOne.checkedRadioButtonId, radioGroupTwo.checkedRadioButtonId, radioGroupThree.checkedRadioButtonId, radioGroupFour.checkedRadioButtonId)
        val reponseCorrect = arrayOf(2131230862, 2131230871, 2131230867, 2131230853)
        var resultatFinal: Int = 0
        reponseUser.forEach {
            if (it in reponseCorrect){
                resultatFinal += 1
            }
        }
        textResultat.text = resultatFinal.toString()+"/4"
    }

}
