package com.example.android.miwok;

/**
 * Created by sav on 26.09.2017.
 */

public class Word {
    private String mMiwokWord;
    private String mDefaultWord;
    private int mImageId;

    public Word(String defaultWord, String miwokWord) {
        this.mMiwokWord = miwokWord;
        this.mDefaultWord = defaultWord;
    }

    public String getMiwokWord() {
        return mMiwokWord;
    }

    public String getDefaultWord() {
        return mDefaultWord;
    }

    public int getImageId() {
        return mImageId;
    }
}
