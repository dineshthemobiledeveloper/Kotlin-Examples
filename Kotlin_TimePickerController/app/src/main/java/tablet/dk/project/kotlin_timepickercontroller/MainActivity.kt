package tablet.dk.project.kotlin_timepickercontroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TimePicker
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*
// The above line is used to import all the controllers which are all present in the activity xml file.


class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        example_timePicker.setOnTimeChangedListener(object: TimePicker.OnTimeChangedListener
        {
            override fun onTimeChanged(view: TimePicker?, hourOfDay: Int, minute: Int)
            {
                Toast.makeText(getApplicationContext(),"Time is : "+ hourOfDay.toString() +" : "+minute ,Toast.LENGTH_SHORT).show();
            }

        })
    }
}
