package com.therippleeffect;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Puddle {
    /** an integer representing puddle image resource*/
    private int miamgeResource = No_Image;
    /** a constant to check if there is an imgae*/
    private static final int No_Image = -1;
    /** a string representing the puddle initiator's name*/
    private String mpuddleInitiator;
    /** a string representing the puddle's title*/
    private String mpuddleName;
    /** a string representing the puddle's date od creation*/
    private String mpuddleDateCreated;
    /** a string representing the puddle's short discription*/
    private String mpuddleQuest;
    /** a string representing the puddle's status*/
    private String mpuddleStatus;
    /** a string representing the puddle's type*/
    private String mpuddleType;
    /** a string representing the puddle's details*/
    private String mpuddleDetails;
    /** a Integer representing the puddle's number of required ripples*/
    private String mpuddleRequiredRipples;
    /** a Integer representing the puddle's number of required ripples*/
    private String mpuddleCreatedRipples;
    /** a string representing the puddle's country location*/
    private String mpuddleCountryLocation;
    /** a string representing the puddle city location*/
    private String mpuddleCityLocation;
    /** a Integer representing the puddle's credibility*/
    private String mpuddleCredibilityBoostsNumber;
    /** a Integer representing the puddle's reports*/
    private String mpuddleCredibilityReportsNumber;
    /** a Array representing the puddle's heros*/
    private Array mpuddleHeroes;



    /**the class constructor*/
    public Puddle(int imageSource, String puddlesName, String initiatorName, String puddleQuest,
                  String puddleCountryLocation, String puddleCityLocation,
                  String puddleRequiredRipples, String puddleCreatedRipples, String puddleType, String puddleStatus,
                  String puddleCredibilityBoostsNumber, String puddleCredibilityReportsNumber, String puddleDetails, String dateCreated) {
        miamgeResource = imageSource;
        mpuddleInitiator = initiatorName;
        mpuddleName = puddlesName;
        mpuddleQuest = puddleQuest;
        mpuddleStatus = puddleStatus;
        mpuddleType = puddleType;
        mpuddleCountryLocation = puddleCountryLocation;
        mpuddleCityLocation = puddleCityLocation;
        mpuddleRequiredRipples = puddleRequiredRipples;
        mpuddleCreatedRipples = puddleCreatedRipples;
        mpuddleCredibilityBoostsNumber = puddleCredibilityBoostsNumber;
        mpuddleCredibilityReportsNumber = puddleCredibilityReportsNumber;
        mpuddleDetails = puddleDetails;
        mpuddleDateCreated = dateCreated;}


    public int getImageResource() { return miamgeResource; }

    public boolean puddleHasImage(){ return miamgeResource != No_Image;}

    public String getPuddleInitiator() { return mpuddleInitiator; }

    public String getPuddleName() { return mpuddleName; }

    public String getPuddleDateCreated(){return mpuddleDateCreated;}

    public String getPuddleQuest() { return mpuddleQuest; }

    public String getPuddleStatus() { return mpuddleStatus; }

    public String getPuddleType() { return mpuddleType; }

    public String getPuddleCountryLocation() { return mpuddleCountryLocation; }

    public String getPuddleCityLocation() { return mpuddleCityLocation; }

    public String getPuddleRequiredRipples() { return mpuddleRequiredRipples; }

    public String getPuddleCreatedRipples() { return mpuddleCreatedRipples; }

    public Array getPuddleHeroes() { return mpuddleHeroes; }

    public String getPuddleCredibilityBoostsNumber() { return mpuddleCredibilityBoostsNumber; }

    public String getPuddleCredibilityReportsNumber() { return mpuddleCredibilityReportsNumber; }

    public String getPuddleDetails() { return mpuddleDetails; }



    public void setPamgeResource(int mimageResource) { this.miamgeResource = mimageResource; }

    public void setPuddleInitiator(String mpuddleInitiator) { this.mpuddleInitiator = mpuddleInitiator; }

    public void setPuddleName(String mpuddleName) { this.mpuddleName = mpuddleName; }

    public void setPuddleQuest(String mpuddleQuest) { this.mpuddleQuest = mpuddleQuest; }

    public void setPuddleStatus(String mpuddleStatus) { this.mpuddleStatus = mpuddleStatus; }

    public void setPuddleType(String mpuddleType) { this.mpuddleType = mpuddleType; }

    public void setPuddleCountryLocation(String mpuddleCountryLocation) { this.mpuddleCountryLocation = mpuddleCountryLocation; }

    public void setPuddleCityLocation(String mpuddleCityLocation) { this.mpuddleCityLocation = mpuddleCityLocation; }

    public void setPuddleRequiredRipples(String mpuddleRequiredRipples) { this.mpuddleRequiredRipples = mpuddleRequiredRipples; }

    public void setPuddleCreatedRipples(String mpuddleCreatedRipples) { this.mpuddleCreatedRipples = mpuddleCreatedRipples; }

    public void setMpuddleHeroes(Array mpuddleHeroes) { this.mpuddleHeroes = mpuddleHeroes;}

    public void setMpuddleCredibilityBoostsNumber(String mpuddleCredibilityBoostsNumber) {
        this.mpuddleCredibilityBoostsNumber = mpuddleCredibilityBoostsNumber; }

    public void setMpuddleCredibilityReportsNumber(String mpuddleCredibilityReportsNumber) {
        this.mpuddleCredibilityReportsNumber = mpuddleCredibilityReportsNumber; }

    public void setPuddleDetails(String mpuddledetails) { this.mpuddleDetails = mpuddledetails; }

    public static String getCurrentDate(){

        Calendar calendar = Calendar.getInstance();
        Date now = calendar.getTime();
        SimpleDateFormat simpleDateFormat =  new SimpleDateFormat("yyyy-MM-dd' Time: 'HH:mm:ss", Locale.getDefault());
        return simpleDateFormat.format(now);
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        return super.equals(obj);
    }


    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @NonNull
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @NonNull
    @Override
    public String toString() {
        return super.toString();
    }
}
