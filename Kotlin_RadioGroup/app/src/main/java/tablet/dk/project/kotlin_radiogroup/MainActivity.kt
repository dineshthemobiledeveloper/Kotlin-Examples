package tablet.dk.project.kotlin_radiogroup

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioGroup
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        example_radioGroup.setOnCheckedChangeListener( object: RadioGroup.OnCheckedChangeListener
        {
            override fun onCheckedChanged(group: RadioGroup?, checkedId: Int)
            {
                if(radioandroid.isChecked)
                {
                    example_textView.text = "Android"
                }
                else if(radioios.isChecked)
                {
                    example_textView.text = "iOS"
                }
                else if(radioblackberry.isChecked)
                {
                    example_textView.text = "Blackberry"
                }
            }

        })
    }
}
