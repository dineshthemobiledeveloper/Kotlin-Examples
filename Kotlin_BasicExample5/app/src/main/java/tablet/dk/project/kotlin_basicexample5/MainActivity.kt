package tablet.dk.project.kotlin_basicexample5

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        example_imageButton.setOnClickListener { example_imageView.setImageResource(R.drawable.robot) }
    }
}
