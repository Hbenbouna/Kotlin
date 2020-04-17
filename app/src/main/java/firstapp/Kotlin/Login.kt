package firstapp.Kotlin


import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import firstapp.Kotlin.PreferenceHelper.customPreference
import firstapp.Kotlin.PreferenceHelper.email
import firstapp.Kotlin.PreferenceHelper.pwd
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {
    val CUSTOM_PREF_LOGIN = "User_info"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        errorEmail.visibility = View.GONE
        val prefs = customPreference(this, CUSTOM_PREF_LOGIN)
        email.setText(prefs.email)
        pwd.setText(prefs.pwd)
    }
    fun connection(view: View){
        if (checkEmail(email.text.toString())){
            errorEmail.visibility = View.GONE;
            val prefs = customPreference(this, CUSTOM_PREF_LOGIN)
            prefs.email = email.text.toString()
            prefs.pwd = pwd.text.toString()
        }else{
            errorEmail.visibility = View.VISIBLE
        }
    }
    fun checkEmail(email: String): Boolean {

        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()

    }
}
object PreferenceHelper {

    val EMAIL = "EMAIL"
    val USER_PASSWORD = "PASSWORD"


    fun customPreference(context: Context, name: String): SharedPreferences = context.getSharedPreferences(name, Context.MODE_PRIVATE)

    inline fun SharedPreferences.editMe(operation: (SharedPreferences.Editor) -> Unit) {
        val editMe = edit()
        operation(editMe)
        editMe.apply()
    }

    var SharedPreferences.email
        get() = getString(EMAIL, "")
        set(value) {
            editMe {
                it.putString(EMAIL, value)
            }
        }

    var SharedPreferences.pwd
        get() = getString(USER_PASSWORD, "")
        set(value) {
            editMe {
                it.putString(USER_PASSWORD, value)
            }
        }

}