package edu.ufp.inf.lp2._10_examples.brigadatransito;

import java.util.Date;
import java.util.Objects;

public abstract class PenaltyFee implements Offense, Comparable<PenaltyFee> {

    private Date date;
    private String reason;
    private String local;
    private Driver driver;
    private Vehicle vehicle;

    public static float MIN_VALUE = 20.0f;
    public static int MIN_PUNISHMENT = 15;

    public PenaltyFee(Date data, String razao, String local, Driver condutor, Vehicle veiculo) {
        this.date = data;
        this.reason = razao;
        this.local = local;
        this.driver = condutor;
        this.vehicle = veiculo;

        condutor.setnPenaltyFees(condutor.getnPenaltyFees() + 1);
    }

    public PenaltyFee(Date data, String razao, String local) {
        this.date = data;
        this.reason = razao;
        this.local = local;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        if (this.driver == null) {
            this.driver = driver;
            driver.setnPenaltyFees(driver.getnPenaltyFees() + 1);
        }
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public int compareTo(PenaltyFee m) {
        if (this.getDriver().getDriversLicense().compareTo(m.getDriver().getDriversLicense()) == 0
                && this.getVehicle().getRegistration().compareTo(m.getVehicle().getRegistration()) == 0
                && this.getDate().compareTo(m.getDate()) == 0
                && this.getLocal().compareTo(m.getLocal()) == 0
                && this.getReason().compareTo(m.getReason()) == 0) {
            return 0;
        }
        return (this.date.before(m.date)?-1:1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PenaltyFee that = (PenaltyFee) o;
        return Objects.equals(date, that.date)
                && Objects.equals(reason, that.reason)
                && Objects.equals(local, that.local);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, reason, local, driver, vehicle);
    }
}
