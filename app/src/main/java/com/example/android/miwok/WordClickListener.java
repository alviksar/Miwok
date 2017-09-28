package com.example.android.miwok;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import static android.R.attr.button;

/**
 * Created by sav on 28.09.2017.
 */

public class WordClickListener implements ListView.OnItemClickListener {

    private MediaPlayer mMediaPlayer;
    private Context mContext;

    public WordClickListener(Context context) {
        this.mContext = context;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Word word = (Word) adapterView.getItemAtPosition(i);
        mMediaPlayer = MediaPlayer.create(mContext, word.getAudioResourceId());
        mMediaPlayer.start(); // no need to call prepare(); create() does that for you
      //  mMediaPlayer.release();
      //  mMediaPlayer = null;
        mMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//            Word mWord = new Word("Test", "Text", 0);
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
               // Toast.makeText(mContext, mWord.getMiwokWord(), Toast.LENGTH_SHORT).show();
                mediaPlayer.release();
                mediaPlayer = null;
            }
        });
    }

    //  button.setOnClickListener(new CustomClickListener(context));
}
