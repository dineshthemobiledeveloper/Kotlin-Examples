package tablet.dk.project.kotlin_timepickerdialog

import android.app.TimePickerDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TimePicker
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity()
{
    var cal = Calendar.getInstance()

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val timeSetListener = object : TimePickerDialog.OnTimeSetListener
        {
            override fun onTimeSet(view: TimePicker?, hourOfDay: Int, minute: Int)
            {
                cal.set(Calendar.HOUR_OF_DAY,hourOfDay)
                cal.set(Calendar.MINUTE, minute)
                updateTimeInView()
            }
        }

        example_button.setOnClickListener {

            TimePickerDialog(this,timeSetListener,cal.get(Calendar.YEAR),cal.get(Calendar.MINUTE),true).show()

        }
    }

    private fun updateTimeInView()
    {
        example_textView.text = "Time is : "+cal.get(Calendar.HOUR_OF_DAY)+" : "+cal.get(Calendar.MINUTE)
    }
}
