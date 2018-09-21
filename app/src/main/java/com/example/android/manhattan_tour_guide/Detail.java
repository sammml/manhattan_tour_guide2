package com.example.android.manhattan_tour_guide;

/**
 * {@link Detail} represents a vocabulary word that the user wants to learn.
 * It contains resource IDs for the name, hours, address, about us of each place
 */
public class Detail {

    /** String resource ID for name of location */
    private int mNameId;

    /** String resource ID for hours */
    private int mHoursId;

    /** String resource ID for address */
    private int mAddressId;

    /** String resource ID for about */
    private int mAboutId;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Detail object.
     *
     * @param nameId is the string resource ID for the names of the places
     * @param hoursId is the string resource Id for the hours of the places
     * @param addressId is the resource ID for the address of the places
     * @param aboutId is the resource ID for the about of the places
     */
    public Detail(int nameId, int hoursId, int addressId, int aboutId) {
        mNameId = nameId;
        mHoursId = hoursId;
        mAddressId = addressId;
        mAboutId = aboutId;
    }

    /**
     * Create a new Detail object.
     *
     * @param nameId is the string resource ID for the names of the places
     * @param hoursId is the string resource Id for the hours of the places
     * @param addressId is the resource ID for the address of the places
     * @param aboutId is the resource ID for the about of the places
     */
    public Detail(int nameId, int hoursId, int addressId, int aboutId, int imageResourceId) {
        mImageResourceId = imageResourceId;
        mNameId = nameId;
        mHoursId = hoursId;
        mAddressId = addressId;
        mAboutId = aboutId;

    }

    /**
     * Get the string resource ID for the name of the place
     */
    public int getNameId() {
        return mNameId;
    }

    /**
     * Get the string resource ID for the hours of the place
     */
    public int getHoursId() {
        return mHoursId;
    }

    /**
     * Get the string resource ID for the Address of the place
     */
    public int getAddressId() {
        return mAddressId;
    }

    /**
     * Get the string resource ID for the about info of the place
     */
    public int getAboutId() {
        return mAboutId;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }}