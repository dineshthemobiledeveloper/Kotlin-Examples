package tablet.dk.project.kotlin_webview

import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.webkit.WebChromeClient
import android.webkit.WebSettings.PluginState
import android.R.attr.start
import android.support.v4.media.session.MediaControllerCompat.setMediaController
import android.widget.MediaController
import android.webkit.WebSettings




class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


       // <----***** loading webpage in webview *****----> //

        // example_webView.loadUrl("http://www.javatpoint.com/");

        // <----***** loading html file from Android Asset Folder in webview *****----> //

        //example_webView.loadUrl("file:///android_asset/index.html");

        // <----***** loading html coding directly in webview *****----> //

        //        val data = "<html><body><h1>Hello, Kotlin Developer!</h1></body></html>"
        //
        //        example_webView.loadData(data, "text/html", "UTF-8");

    }

}
