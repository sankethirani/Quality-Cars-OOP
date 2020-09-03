/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonManagement;

import RentalManagement.Rental;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Sanket
 */
public class Customer extends Person{
    private ArrayList <Rental> rentals;
    private String licenceNumber;
    private int age;
    private Date licenceExpiry;

    public Customer(String licenceNumber, int age, Date licenceExpiry, int id, String name, Date dateOfBirth, String address, String telephoneNumber) {
        super(id, name, dateOfBirth, address, telephoneNumber);
        this.licenceNumber = licenceNumber;
        this.age = age;
        this.licenceExpiry = licenceExpiry;
        this.rentals = new ArrayList <Rental>();
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getLicenceExpiry() {
        return licenceExpiry;
    }

    public void setLicenceExpiry(Date licenceExpiry) {
        this.licenceExpiry = licenceExpiry;
    }

    public ArrayList<Rental> getRentals() {
        return rentals;
    }

    public void setRentals(ArrayList<Rental> rentals) {
        this.rentals = rentals;
    }
    
}
