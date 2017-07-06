package com.example.admin.greekwetlandkerkinitour;

/**
 * {@link Galery} represents the benefits of a tour to wetland Kerkini that the user wants to learn.
 */
public class Galery {

    /**
     * Title of the Kerkkinis benefit
     */
    private int mTitleBenefit;

    /**
     * Adress of the Kerkkinis benefit
     */
    private int mAdressBenefit;

    /**
     * Image resource ID for a photo
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Galery object.
     *
     * @param imageResourceId is the drawable resource ID for a photo
     **/
    public Galery(int imageResourceId) {
        mImageResourceId = imageResourceId;

    }

    /**
     * Create a new Galery object.
     *
     * @param titleBenefit  is the title of a benefit visiting Kerkini
     * @param adressBenefit is the adress of a benefit visiting Kerkini
     **/
    public Galery(int titleBenefit, int adressBenefit) {
        mTitleBenefit = titleBenefit;
        mAdressBenefit = adressBenefit;

    }

    /**
     * Get the title resource of a Kerkini's benefit.
     */

    public int getTitleBenefit() {
        return mTitleBenefit;
    }

    /**
     * Get the adress resource of a Kerkini's benefit.
     */

    public int getAdressBenefit() {
        return mAdressBenefit;
    }


    /**
     * Get the image resource ID of the photo.
     */

    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this benefit.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}