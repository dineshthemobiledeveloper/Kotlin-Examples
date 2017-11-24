package tablet.dk.project.kotlin_spinner

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter

import kotlinx.android.synthetic.main.activity_main.*
// The above line is used to import all the controllers which are all present in the activity xml file.


class MainActivity : AppCompatActivity()
{
    var otherStrings = arrayOf("Android", "iOS", "Windows","Blackberry","Symbian")

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapterforspinner = ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,otherStrings)

        example_spinner.adapter = adapterforspinner

        example_spinner.onItemSelectedListener =  object:AdapterView.OnItemSelectedListener
        {
            override fun onNothingSelected(parent: AdapterView<*>?)
            {
                example_textView.text = "Please Select any Options"
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long)
            {
                example_textView.text = otherStrings.get(position)
            }

        }
    }
}
