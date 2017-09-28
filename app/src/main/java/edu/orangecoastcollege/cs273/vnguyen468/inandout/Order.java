package edu.orangecoastcollege.cs273.vnguyen468.inandout;

import java.lang.invoke.MutableCallSite;

/**
 * Created by Nghir on 9/28/2017.
 */

public class Order {
    public static final double PRICE_DOUBLE_DOUBLE = 3.60;
    public static final double PRICE_CHEESEBURGER = 2.15;
    public static final double PRICE_FRENCH_FRIES = 1.65;
    public static final double PRICE_SHAKES = 2.20;
    public static final double PRICE_SMALL_DRINKS = 1.45;
    public static final double PRICE_MEDIUM_DRINKS = 1.55;
    public static final double PRICE_LARGE_DRINKS = 1.75;
    public static final double TAX_RATE = 8.0;

    private int mDoubleDoubles;
    private int mCheeseburgers;
    private int mFrenchFries;
    private int mShakes;
    private int mSmallDrinks;
    private int mMediumDrinks;
    private int mLargeDrinks;

    public Order()
    {
        mDoubleDoubles = 0;
        mCheeseburgers = 0;
        mFrenchFries = 0;
        mShakes = 0;
        mSmallDrinks = 0;
        mMediumDrinks = 0;
        mLargeDrinks = 0;
    }

    public int getDoubleDoubles() {
        return mDoubleDoubles;
    }

    public void setDoubleDoubles(int doubleDoubles) {
        mDoubleDoubles = doubleDoubles;
    }

    public int getCheeseburgers() {
        return mCheeseburgers;
    }

    public void setCheeseburgers(int cheeseburgers) {
        mCheeseburgers = cheeseburgers;
    }

    public int getFrenchFries() {
        return mFrenchFries;
    }

    public void setFrenchFries(int frenchFries) {
        mFrenchFries = frenchFries;
    }

    public int getShakes() {
        return mShakes;
    }

    public void setShakes(int shakes) {
        mShakes = shakes;
    }

    public int getSmallDrinks() {
        return mSmallDrinks;
    }

    public void setSmallDrinks(int smallDrinks) {
        mSmallDrinks = smallDrinks;
    }

    public int getMediumDrinks() {
        return mMediumDrinks;
    }

    public void setMediumDrinks(int mediumDrinks) {
        mMediumDrinks = mediumDrinks;
    }

    public int getLargeDrinks() {
        return mLargeDrinks;
    }

    public void setLargeDrinks(int largeDrinks) {
        mLargeDrinks = largeDrinks;
    }

    public int getItemsOrdered()
    {
        return mDoubleDoubles + mCheeseburgers + mFrenchFries + mShakes + mSmallDrinks +
                mMediumDrinks + mLargeDrinks;
    }

    public double calculateSubtotal()
    {
        return ((mDoubleDoubles * PRICE_DOUBLE_DOUBLE)+
                (mCheeseburgers * PRICE_CHEESEBURGER)+
                (mFrenchFries * PRICE_FRENCH_FRIES)+
                (mShakes * PRICE_SHAKES)+
                (mSmallDrinks * PRICE_SMALL_DRINKS)+
                (mMediumDrinks * PRICE_MEDIUM_DRINKS)+
                (mLargeDrinks * PRICE_LARGE_DRINKS));
    }

    public double calculateTax()
    {
        return (calculateSubtotal() * TAX_RATE);
    }

    public double calculateTotal()
    {
        return calculateSubtotal() + calculateTax();
    }
}
