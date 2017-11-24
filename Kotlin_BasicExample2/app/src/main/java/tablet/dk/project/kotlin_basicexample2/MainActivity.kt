package tablet.dk.project.kotlin_basicexample2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CompoundButton
import android.widget.RadioGroup
import android.widget.Switch

import kotlinx.android.synthetic.main.activity_main.*
// The above line is used to import all the controllers which are all present in the activity xml file.


class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        example_toggleButton.setOnClickListener {

            if(example_toggleButton.isChecked)
            {
                example_textView.text = "Toggle Button is ON"
            }
            else
            {
                example_textView.text = "Toggle Button is OFF"
            }
        }

        example_checkBox.setOnClickListener {

            if(example_checkBox.isChecked)
            {
                example_textView.text = "CheckBox is Checked"
            }
            else
            {
                example_textView.text = "CheckBox is UnChecked"
            }
        }




    }
}
