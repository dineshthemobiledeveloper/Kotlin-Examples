package tablet.dk.project.kotlin_basicexample1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_main.*
// The above line is used to import all the controllers which are all present in the activity xml file.

class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Button controller click event listener

        example_button.setOnClickListener {

            // getting EditText value and assign for variable
            val gettextfromedittext = example_editText.text

            // setting variable containing value which is getting from EditText for TextView
            example_textView.text = gettextfromedittext
        }
    }
}
