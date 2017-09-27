package com.example.android.miwok;

/**
 * Created by sav on 26.09.2017.
 */

public class Word {
    private String mMiwokWord;
    private String mDefaultWord;
    private int mImageId;

    /**
     * Create a new Word object.
     *
     * @param defaultWord is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokWord is the word in the Miwok language
     * @param imageId is the drawable resource ID for the image associated with the word
     *
     */

    public Word(String defaultWord, String miwokWord, int imageId) {
        this.mMiwokWord = miwokWord;
        this.mDefaultWord = defaultWord;
        this.mImageId = imageId;
    }

    public Word(String defaultWord, String miwokWord)
    {
        this(defaultWord, miwokWord, 0);
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
