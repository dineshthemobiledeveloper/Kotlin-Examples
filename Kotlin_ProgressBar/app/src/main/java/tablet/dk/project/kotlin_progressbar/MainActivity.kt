package tablet.dk.project.kotlin_progressbar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{


    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        example_progressBar.visibility = View.GONE
        example_horiprogressBar.visibility = View.GONE

        examplebutton.setOnClickListener {

            var progressBarStatus = 0
            var dummy:Int = 0

            Thread(Runnable
            {
                this@MainActivity.runOnUiThread(java.lang.Runnable
                {
                    example_horiprogressBar.visibility = View.VISIBLE
                })

                while (progressBarStatus < 100)
                {
                    try
                    {
                        dummy = dummy+25
                        Thread.sleep(1000)
                    }
                    catch (e: InterruptedException)
                    {
                        e.printStackTrace()
                    }

                    progressBarStatus = dummy

                    example_horiprogressBar.progress = progressBarStatus

                }

                this@MainActivity.runOnUiThread(java.lang.Runnable
                {
                    example_horiprogressBar.visibility = View.GONE
                })

            }).start()


            Thread(Runnable
            {

                this@MainActivity.runOnUiThread(java.lang.Runnable
                {
                    example_progressBar.visibility = View.VISIBLE
                })

                while (progressBarStatus < 100)
                {
                    try
                    {
                        dummy = dummy+25
                        Thread.sleep(1000)
                    }
                    catch (e: InterruptedException)
                    {
                        e.printStackTrace()
                    }

                    progressBarStatus = dummy

                }

                this@MainActivity.runOnUiThread(java.lang.Runnable
                {
                    example_progressBar.visibility = View.GONE
                })
            }).start()
        }
    }
}
