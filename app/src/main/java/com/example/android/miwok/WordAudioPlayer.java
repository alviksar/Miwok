package com.example.android.miwok;

import android.content.Context;
import android.media.MediaPlayer;

import java.io.IOException;

/**
 * Created by sav on 29.09.2017.
 */

public class WordAudioPlayer {

    private static MediaPlayer mMediaPlayer;

    private static  MediaPlayer.OnCompletionListener onCompletionListener = new MediaPlayer.OnCompletionListener() {

        public void onCompletion(MediaPlayer mediaPlayer) {
            // Toast.makeText(mContext, mWord.getMiwokWord(), Toast.LENGTH_SHORT).show();
            releaseMediaPlayer();
        }
    };

    public static void playWord(Context context, Word word) {
        releaseMediaPlayer();
        mMediaPlayer = MediaPlayer.create(context, word.getAudioResourceId());
        mMediaPlayer.start(); // no need to call prepare(); create() does that for you
        mMediaPlayer.setOnCompletionListener(onCompletionListener);
    }

    public static void releaseMediaPlayer() {
        if (mMediaPlayer != null) {
            mMediaPlayer.release();
            mMediaPlayer = null;
        }
    }

}
