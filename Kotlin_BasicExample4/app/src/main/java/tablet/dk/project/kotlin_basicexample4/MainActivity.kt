package tablet.dk.project.kotlin_basicexample4

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.CompoundButton
import android.widget.RadioGroup
import android.widget.RatingBar

import kotlinx.android.synthetic.main.activity_main.*
// The above line is used to import all the controllers which are all present in the activity xml file.


class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        example_ratingBar.setOnRatingBarChangeListener(object: RatingBar.OnRatingBarChangeListener
        {
            override fun onRatingChanged(ratingBar: RatingBar?, rating: Float, fromUser: Boolean)
            {
                example_textView.text = rating.toString()
            }
        })

        example_switch.setOnCheckedChangeListener(object: CompoundButton.OnCheckedChangeListener
        {
            override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean)
            {
                if(isChecked)
                {
                    example_textView.text = "Switch is ON"
                }
                else
                {
                    example_textView.text = "Switch is OFF"
                }

            }
        })
    }
}
