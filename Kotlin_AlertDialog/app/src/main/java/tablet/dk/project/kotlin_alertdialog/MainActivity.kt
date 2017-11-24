package tablet.dk.project.kotlin_alertdialog

import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*
// The above line is used to import all the controllers which are all present in the activity xml file.

class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        example_button.setOnClickListener {

            val alertbuilder = AlertDialog.Builder(this);
            alertbuilder.setTitle("Warning !!!")
            alertbuilder.setMessage("Are you sure want to delete the files??")
            alertbuilder.setPositiveButton("Yes",{ dialogInterface: DialogInterface, i: Int ->
                Toast.makeText(this,"Your Files Delete Successfully",Toast.LENGTH_SHORT).show()
            })
            alertbuilder.setNegativeButton("No",{dialog: DialogInterface?, which: Int ->

            })
            alertbuilder.show()
        }
    }
}
