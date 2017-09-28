package com.example.android.miwok;

/**
 * Created by sav on 26.09.2017.
 */

public class Word {
    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;
    private String mMiwokWord;
    private String mDefaultWord;
    /**
     * Image resource ID for the word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Audio resource ID for the word
     */
    private int mAudioResourceId = NO_IMAGE_PROVIDED;

    /**
     * Create a new Word object.
     *
     * @param defaultWord is the word in a language that the user is already familiar with
     *                    (such as English)
     * @param miwokWord   is the word in the Miwok language
     * @param imageId     is the drawable resource ID for the image associated with the word
     * @param audioID     is the raw resource ID for the audio file associated with the word
     */

    public Word(String defaultWord, String miwokWord, int imageId, int audioID) {
        this.mMiwokWord = miwokWord;
        this.mDefaultWord = defaultWord;
        this.mImageResourceId = imageId;
        this.mAudioResourceId = audioID;
    }

    public Word(String defaultWord, String miwokWord, int audioID) {
        this(defaultWord, miwokWord, NO_IMAGE_PROVIDED, audioID);
    }

    @Override
    public String toString() {
        return "Word{" +
                "mMiwokWord='" + mMiwokWord + '\'' +
                ", mDefaultWord='" + mDefaultWord + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }

    public String getMiwokWord() {
        return mMiwokWord;
    }

    public String getDefaultWord() {
        return mDefaultWord;
    }

    public int getImageResourceId() { return mImageResourceId; }

    public int getAudioResourceId() { return mAudioResourceId; }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
