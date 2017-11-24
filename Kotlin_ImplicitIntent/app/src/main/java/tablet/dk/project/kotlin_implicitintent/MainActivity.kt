package tablet.dk.project.kotlin_implicitintent

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        example_url.setOnClickListener {
            var intentbrowser : Intent = Intent(Intent.ACTION_VIEW);
            intentbrowser.setData(Uri.parse("http:\\www.google.co.in"))
            startActivity(intentbrowser)
        }

    }
}
