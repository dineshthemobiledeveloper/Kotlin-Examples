package tablet.dk.project.kotlin_videoview

import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import kotlinx.android.synthetic.main.activity_main.*
import android.support.v4.media.session.MediaControllerCompat.setMediaController
import android.widget.MediaController
import android.widget.VideoView



class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //    *****  playing video file from raw Resource folder *****     //

        example_videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.sample))
        example_videoView.start()

        val mediaController = MediaController(this)

        // set media controller object for a video view
        example_videoView.setMediaController(mediaController)


        //    *****  playing video file from External Storage Directory *****     //

        // just uncommand and use the below coding

//        val mediaControllerfile =  MediaController(this);
//
//        mediaControllerfile.setAnchorView(example_videoView);
//
//        //specify the location of media file
//
//        val uri=Uri.parse(Environment.getExternalStorageDirectory().getPath()+"/media/1.mp4");
//
//        //Setting MediaController and URI, then starting the videoView
//
//        example_videoView.setMediaController(mediaController);
//        example_videoView.setVideoURI(uri);
//        example_videoView.requestFocus();
//        example_videoView.start();



    }
}
