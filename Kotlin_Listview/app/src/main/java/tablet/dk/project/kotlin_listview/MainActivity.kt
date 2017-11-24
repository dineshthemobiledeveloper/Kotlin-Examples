package tablet.dk.project.kotlin_listview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var arrayofstring = arrayOf("Padhu","Dinesh","Mani","Vishnu","Kesavan","Venkat")

        val arrayforlistview = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrayofstring)

        example_listview.adapter = arrayforlistview

        example_listview.onItemClickListener = object:AdapterView.OnItemClickListener
        {
            override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long)
            {
                example_textView.text = arrayofstring.get(position)
            }

        }
    }
}
