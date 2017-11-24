package tablet.dk.project.kotlin_basicexample3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar

import kotlinx.android.synthetic.main.activity_main.*
// The above line is used to import all the controllers which are all present in the activity xml file.

class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        example_seekBar.max = 100

        example_seekBar.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener
        {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean)
            {
                example_textView.text = progress.toString()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?)
            {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?)
            {

            }

        })

        example_discreteseekBar.max = 5
        example_discreteseekBar.progress = 1

        example_discreteseekBar.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener
        {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean)
            {
                example_textView.text = progress.toString()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?)
            {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?)
            {

            }

        })
    }
}
