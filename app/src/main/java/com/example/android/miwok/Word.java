package com.example.android.miwok;

/**
 * eyy
 */

public class Word {
    private static final int NO_IMAGE = -1;

    private String defaultTranslation;
    private String miwokTranslation;
    private int imageResourceId = NO_IMAGE;
    private int audioResourceId;


    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.audioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId,
                int imageResourceId) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.audioResourceId = audioResourceId;
        this.imageResourceId = imageResourceId;
    }


    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public int getAudioResourceId() {
        return audioResourceId;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public boolean hasImage() {
        return imageResourceId != NO_IMAGE;
    }
}
