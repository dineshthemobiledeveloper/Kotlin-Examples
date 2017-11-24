package tablet.dk.project.kotlin_passingdatabetweenactivities

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

            var intent : Intent =  Intent(this,SecondActivity::class.java)
            intent.putExtra("username",editText_username.text.toString())
            intent.putExtra("phonenumber",editText_phonenumber.text.toString())
            startActivity(intent)
        }
    }
}
