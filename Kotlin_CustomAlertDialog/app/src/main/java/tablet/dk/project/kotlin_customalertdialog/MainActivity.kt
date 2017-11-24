package tablet.dk.project.kotlin_customalertdialog

import android.app.Dialog
import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.LayoutInflater
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.customdialog.*

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        example_button.setOnClickListener {

            var alertdialogbuilder = AlertDialog.Builder(this);
            var inflater = layoutInflater
            var alertview = inflater.inflate(R.layout.customdialog,null)
            alertdialogbuilder.setView(alertview)
            alertdialogbuilder.setPositiveButton("Okay", object:DialogInterface.OnClickListener{

                override fun onClick(dialog: DialogInterface?, which: Int)
                {
                    Toast.makeText(applicationContext,"Thank You",Toast.LENGTH_SHORT).show()
                }

            })
            alertdialogbuilder.setNegativeButton("Cancel",object :DialogInterface.OnClickListener{
                override fun onClick(dialog: DialogInterface?, which: Int)
                {
                    dialog!!.dismiss()
                }

            })
            var dialog :Dialog = alertdialogbuilder.create()
            dialog.show()

        }
    }
}
