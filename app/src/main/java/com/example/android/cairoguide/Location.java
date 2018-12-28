package com.example.android.cairoguide;

public class Location{
    private String mLocationName;
    private String mAddress;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    public Location(String locationName, String address){
        mLocationName = locationName;
        mAddress = address;
    }

    public Location(String locationName, String address, int imageResourceId){
        mLocationName = locationName;
        mAddress = address;
        mImageResourceId = imageResourceId;
    }

    public String getLocationName(){
        return mLocationName;
    }
    public String getAddress(){
        return mAddress;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
