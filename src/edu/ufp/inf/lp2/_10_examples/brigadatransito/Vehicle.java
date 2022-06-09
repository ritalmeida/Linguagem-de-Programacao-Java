package edu.ufp.inf.lp2._10_examples.brigadatransito;

import java.io.Serializable;

public class Vehicle implements Serializable {

    private String registration;
    private String brand;
    private String model;
    private int cylinders;

    public Vehicle(String r, String b, String m, int c) {
        this.registration = r;
        this.brand = b;
        this.cylinders = c;
        this.model = m;
    }
    
    /**
     * @return the matricula
     */
    public String getRegistration() {
        return registration;
    }

    /**
     * @param registration the matricula to set
     */
    public void setRegistration(String registration) {
        this.registration = registration;
    }

    /**
     * @return the marca
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the marca to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the modelo
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the modelo to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    public String getCylinders() { return Integer.toString(cylinders); }

    public void setCylinders(int cylinders) { this.cylinders = cylinders; }
}