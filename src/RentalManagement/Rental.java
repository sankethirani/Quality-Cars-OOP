/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RentalManagement;

import PersonManagement.Customer;
import StockManagement.Car;
import java.util.Date;

/**
 *
 * @author Sanket
 */
public class Rental {
    private Car car;
    private Customer customer;
    private Date rentDate;
    private Date dueDate;
    private Date returnDate;

    public Rental(Car car, Customer customer, Date dueDate) {
        this.car = car;
        this.customer = customer;
        this.dueDate = dueDate;
        this.returnDate = null;
        this.rentDate = new Date();
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getRentDate() {
        return rentDate;
    }

    public void setRentDate(Date rentDate) {
        this.rentDate = rentDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
    
    
    
}
