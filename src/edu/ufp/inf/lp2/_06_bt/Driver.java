package edu.ufp.inf.lp2._06_bt;

public class Driver {

    private String name;

    private int numPenalties;

    private String licenceNumber;

    private boolean isLicenceAprehended;

    private int points;


    public Driver(String name, String licenceNumber) {

        this.name = name; //this. -> aceder ao atributo da nossa classe
        this.licenceNumber = licenceNumber;
    }

    public Driver(String name, int numPenalties, String licenceNumber, boolean isLicenceAprehended, int points) {
        this.name = name;
        this.numPenalties = numPenalties;
        this.licenceNumber = licenceNumber;
        this.isLicenceAprehended = isLicenceAprehended;
        this.points = points;
    }

    public void addPoints(int points) {

        this.points += points;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getNumPenalties() {

        return numPenalties;
    }

    public void setNumPenalties(int numPenalties) {

        this.numPenalties = numPenalties;
    }

    public String getLicenceNumber() {

        return licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {

        this.licenceNumber = licenceNumber;
    }

    public boolean isLicenceAprehended() {

        return isLicenceAprehended;
    }

    public void setLicenceAprehended(boolean licenceAprehended) {

        isLicenceAprehended = licenceAprehended;
    }

    public int getPoints() {

        return points;
    }

    public void setPoints(int points) {

        this.points = points;
    }

    @Override
    public String toString() {

        return "Driver{" +
                "name ='" + name + '\'' +
                ", numPenalties =" + numPenalties +
                ", licenceNumber ='" + licenceNumber + '\'' +
                '}';
    }
}