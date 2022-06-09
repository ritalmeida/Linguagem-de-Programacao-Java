package edu.ufp.inf.lp2._10_examples.brigadatransito;

import java.io.Serializable;

public class Driver implements Serializable {
    private String name;
    private int nPenaltyFees;
    private String driversLicense;
    private boolean isLicenseApprehended;
    private int cardPoints;

    public Driver(String nome, String dlicense) {
        this.name = nome;
        this.driversLicense = dlicense;
        cardPoints = 20;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCardPoints() {
        return cardPoints;
    }
    public void removeCardPoints(int points){
           this.cardPoints-=points;
    }

    public int getnPenaltyFees() {
        return nPenaltyFees;
    }

    public void setnPenaltyFees(int nPenaltyFees) {
        this.nPenaltyFees = nPenaltyFees;
    }

    public String getDriversLicense() {
        return driversLicense;
    }

    public void setDriversLicense(String driversLicense) {
        this.driversLicense = driversLicense;
    }

    public boolean isLicenseApprehended() {
        return isLicenseApprehended;
    }

    public void setLicenseApprehended(boolean licenseApprehended) {
        this.isLicenseApprehended = licenseApprehended;
    }
}