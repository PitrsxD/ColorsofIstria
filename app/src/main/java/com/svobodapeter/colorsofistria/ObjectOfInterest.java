package com.svobodapeter.colorsofistria;

/**
 * Created by pitrs on 02.04.2018.
 */

public class ObjectOfInterest {
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mIconSourceID;
    private String mNameOfObject;
    private String mDescribeObject;
    private String mDateObject;
    private String mGpsOfObject;
    private Integer mImageResourceID = NO_IMAGE_PROVIDED;

    /**
     * Constructor for events in fragment Events
     * @param dateObject - date of event - string
     * @param nameOfObject - Name of event - string
     * @param describeObject - description od event - string
     */
    public ObjectOfInterest(String dateObject, String nameOfObject, String describeObject) {
        mDateObject = dateObject;
        mNameOfObject = nameOfObject;
        mDescribeObject = describeObject;
    }

    /**
     * Constructor for object of interest/services in fragments City info and Services
     * @param imageSourceID - Image of object - int
     * @param iconSourceID  - icon of object - int
     * @param nameOfObject - name of object - string
     * @param describeObject - description of object - string
     * @param GpsOfObject - GPS coordinates of object - string
     */
    public ObjectOfInterest(int imageSourceID, int iconSourceID, String nameOfObject, String describeObject, String GpsOfObject) {
        mImageResourceID = imageSourceID;
        mIconSourceID = iconSourceID;
        mNameOfObject = nameOfObject;
        mDescribeObject = describeObject;
        mGpsOfObject = GpsOfObject;

    }

    public String getGpsOfObject() {
        return mGpsOfObject;
    }

    public String getmDateObject() {
        return mDateObject;
    }

    public boolean hasString() {
        return mDateObject != null;
    }

    public int getImageResource() {
        return mImageResourceID;
    }

    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }

    public int getmIconSourceID() {
        return mIconSourceID;
    }

    public String getmNameOfObject() {
        return mNameOfObject;
    }

    public String getmDescribeObject() {
        return mDescribeObject;
    }
}
