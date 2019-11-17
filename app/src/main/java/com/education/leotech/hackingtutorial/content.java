package com.education.leotech.hackingtutorial;

public class content {

    private String mContentName;
    private int mImage;
    private int mActivityId;

    public content(String ContentName, int Image, int ActivityId){
        mContentName = ContentName;
        mImage = Image;
        mActivityId = ActivityId;
    }

   /* public content(String ContentName, int Image){
        mContentName = ContentName;
        mImage = Image;
    }*/

    public String getmContentName() {
        return mContentName;
    }

    public int getmImage() {
        return mImage;
    }

    public int getmActivityId(){
        return mActivityId;
    }
}
