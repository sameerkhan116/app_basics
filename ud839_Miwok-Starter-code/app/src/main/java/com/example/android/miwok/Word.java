package com.example.android.miwok;

/**
 * Created by sameerkhan on 2/26/17.
 */

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;

    public Word(String MiwokTranslation, String DefaultTranslation) {
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}
