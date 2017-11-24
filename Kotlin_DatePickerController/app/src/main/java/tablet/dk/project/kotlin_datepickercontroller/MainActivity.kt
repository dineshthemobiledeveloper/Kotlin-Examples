package tablet.dk.project.kotlin_datepickercontroller

import android.annotation.SuppressLint
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.widget.DatePicker
import android.widget.TimePicker
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*
// The above line is used to import all the controllers which are all present in the activity xml file.


class MainActivity : AppCompatActivity()
{

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        example_datePicker.setOnDateChangedListener(object:DatePicker.OnDateChangedListener
        {
            override fun onDateChanged(view: DatePicker?, year: Int, monthOfYear: Int, dayOfMonth: Int)
            {
                Toast.makeText(applicationContext,"Date is : "+dayOfMonth.toString()+" - "+monthOfYear.toString()+" - "+year.toString(),Toast.LENGTH_LONG).show()
            }
        })
    }
}
