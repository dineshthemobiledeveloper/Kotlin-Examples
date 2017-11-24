package tablet.dk.project.kotlin_explicitintent

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        example_button.setOnClickListener {

            var intent : Intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)

        }
    }
}
