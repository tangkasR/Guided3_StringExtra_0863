package cca.tata.guided3_stringextra_0863

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Telephony
import android.widget.TextView

class DisplayMessage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent: Intent = intent
        val message: String = intent.getStringExtra(MainActivity.EXTRA_MESSAGE).toString()

        val textView = TextView(this)
        textView.setTextSize(40F)
        textView.setText("Anda memilih warna " + message)

        if(message == "Merah"){
            textView.setTextColor(Color.parseColor("#FF0000"))
        } else if(message == "Hijau"){
            textView.setTextColor(Color.parseColor("#00FF00"))
        } else {
            textView.setTextColor(Color.parseColor("#0000FF"))
        }
        setContentView(textView)
    }
}