package kraemer.leonard.de.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val handler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text.error = "ERROR"
        handler.postDelayed( { text.error = null }, 3000)
        text.requestFocus()
    }
}
