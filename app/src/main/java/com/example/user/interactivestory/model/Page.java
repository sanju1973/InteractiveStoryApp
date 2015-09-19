package com.example.user.interactivestory.model;

import android.media.Image;

/**
 * Created by user on 8/30/2015.
 */
public class Page {

    private String mText;
    private int mImageId;
    private Choice mChoice1;
    private Choice mChoice2;
    private boolean mIsFinal = false;
// Custom Constructor for pages 0 to 4
    public Page(String text, int imageId, Choice choice1, Choice choice2){
        mText = text;
        mImageId = imageId;
        mChoice1 = choice1;
        mChoice2 = choice2;
    }

// Custom constructor for pages 5 and 6

    public Page(String text, int imageId){

        mText = text;
        mImageId = imageId;
        mChoice1 = null;
        mChoice2 = null;
        mIsFinal = true;

    }

    // Getter and setter methods

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getImageId() {
        return mImageId;
    }

    public void setImageId(int imageId) {
        mImageId = imageId;
    }

    public Choice getChoice1() {
        return mChoice1;
    }

    public void setChoice1(Choice choice1) {
        mChoice1 = choice1;
    }

    public Choice getChoice2() {
        return mChoice2;
    }

    public void setChoice2(Choice choice2) {
        mChoice2 = choice2;
    }

    public boolean isFinal() {
        return mIsFinal;
    }

    public void setFinal(boolean isFinal) {
        mIsFinal = isFinal;
    }
}
