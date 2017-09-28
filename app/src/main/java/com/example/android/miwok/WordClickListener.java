package com.example.android.miwok;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

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
        //   Toast.makeText(NumbersActivity.this, word.getMiwokWord(),Toast.LENGTH_SHORT).show();
    }

    //  button.setOnClickListener(new CustomClickListener(context));
}
