package com.example.android.miwok;

/**
 * Created by sav on 26.09.2017.
 */

public class Word {
    private String miwokWord;
    private String defaultWord;

    public Word(String defaultWord, String miwokWord) {
        this.miwokWord = miwokWord;
        this.defaultWord = defaultWord;
    }

    public String getMiwokWord() {
        return miwokWord;
    }

    public String getDefaultWord() {
        return defaultWord;
    }
}
