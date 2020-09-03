/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StockManagement;

import RentalManagement.Rental;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Sanket
 */
public class Car {
    private String registrationNumber;
    private String make;
    private String model;
    private Transmission transmission;
    private double engineSize;
    private Date WOFDueDate;
    private Date regoDueDate;
    private double rentPerDay;
    private int yearOfManufacture;
    private String colour;
    private Status status;
    private BodyType bodyType;
    private ArrayList<Rental> rentals;

    public Car(String registrationNumber, String make, String model, Transmission transmission, 
               double engineSize, Date WOFDueDate, Date regoDueDate, 
               double rentPerDay, int yearOfManufacture, String colour, 
               Status status, BodyType bodyType) {
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.transmission = transmission;
        this.engineSize = engineSize;
        this.WOFDueDate = WOFDueDate;
        this.regoDueDate = regoDueDate;
        this.rentPerDay = rentPerDay;
        this.yearOfManufacture = yearOfManufacture;
        this.colour = colour;
        this.status = status;
        this.bodyType = bodyType;
        this.rentals = new ArrayList<Rental>();
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public ArrayList<Rental> getRentals() {
        return rentals;
    }

    public void setRentals(ArrayList<Rental> rentals) {
        this.rentals = rentals;
    }

    

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    public Date getWOFDueDate() {
        return WOFDueDate;
    }

    public void setWOFDueDate(Date WOFDueDate) {
        this.WOFDueDate = WOFDueDate;
    }

    public Date getRegoDueDate() {
        return regoDueDate;
    }

    public void setRegoDueDate(Date regoDueDate) {
        this.regoDueDate = regoDueDate;
    }

    public double getRentPerDay() {
        return rentPerDay;
    }

    public void setRentPerDay(double rentPerDay) {
        this.rentPerDay = rentPerDay;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }
    
    public void rented(){
        this.status = Status.Rented;
    }
    
    public void returned(){
        this.status = Status.Available;
    }
    
    public boolean updateStatus(Status status){
        boolean statusUpdated = false;
        if (this.status == Status.Available && status == Status.Maintenance){
            this.status = status;
            statusUpdated = true;
        }
        else if (this.status == Status.Maintenance && status == Status.Available){
            this.status = status;
            statusUpdated = true;
        }
        else if(this.status == status){
            statusUpdated = true;
        }
        
        return statusUpdated;
    }
    
}
