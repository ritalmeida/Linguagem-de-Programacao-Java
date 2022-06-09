package edu.ufp.inf.lp2._06_bt;

import edu.ufp.inf.lp2._01_intro.pl.Date;

public abstract class PenaltyFee implements Comparable<PenaltyFee> {

    private String motive;

    private String local;

    public static float MIN_VALUE = 20.0f;

    public static int MIN_PUNISHMENT = 15;

    private Date date;

    private Vehicle vehicle;
    private Driver driver;

    public PenaltyFee(String motive, String local, Date date, Vehicle vehicle, Driver driver) {

        this.motive = motive;
        this.local = local;
        this.date = date;
        this.vehicle = vehicle;
        this.driver = driver;
    }

    public int compareTo(PenaltyFee pf) {

        //comparar o motivo, o local, a data(compareTo), veiculos (registration), condutor(licensenumber)
        //igual 0
        //senao -1 se a data da nossa multa for anterior, 1 caso contrario
        if (this.getMotive().compareTo(pf.getMotive()) == 0 &&

                this.getLocal().compareTo(pf.getLocal()) == 0 &&
                this.getDate().compareTo(pf.getDate()) == 0 &&
                this.getVehicle().getRegistration().compareTo(pf.getVehicle().getRegistration()) == 0 &&
                this.getDriver().getLicenceNumber().compareTo(pf.getDriver().getLicenceNumber()) == 0) {

            return 0;
        }
        return this.getDate().beforeDate(pf.getDate()) ? -1 : 1;
    }

    public abstract float value();

    public abstract int punishment();

    public String getMotive() {

        return motive;
    }

    public void setMotive(String motive) {

        this.motive = motive;
    }

    public String getLocal() {

        return local;
    }

    public void setLocal(String local) {

        this.local = local;
    }

    public static float getMinValue() {

        return MIN_VALUE;
    }

    public static void setMinValue(float minValue) {

        MIN_VALUE = minValue;
    }

    public static int getMinPunishment() {

        return MIN_PUNISHMENT;
    }

    public static void setMinPunishment(int minPunishment) {

        MIN_PUNISHMENT = minPunishment;
    }

    public Date getDate() {

        return date;
    }

    public void setDate(Date date) {

        this.date = date;
    }

    public Vehicle getVehicle() {

        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {

        this.vehicle = vehicle;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {

        this.driver = driver;
    }

    @Override
    public String toString() {

        return "PenaltyFee{" +
                "motive ='" + motive + '\'' +
                ", local ='" + local + '\'' +
                ", date =" + date +
                ", vehicle =" + vehicle +
                ", driver =" + driver +
                '}';
    }
}