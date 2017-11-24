package tablet.dk.project.kotlin_passingdatabetweenactivities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var intentone: Intent = intent

        textView_username.text = intentone.getStringExtra("username");
        textView_phonenumber.text = intentone.getStringExtra("phonenumber")
    }
}
