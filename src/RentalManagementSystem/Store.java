/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RentalManagementSystem;

import PersonManagement.Person;
import RentalManagement.Rental;
import StockManagement.Car;
import java.util.ArrayList;

/**
 *
 * @author Sanket
 */
public class Store {
    private ArrayList<Person> personList;
    private ArrayList<Rental> rentals;
    private ArrayList<Car> cars;
    
    public Store(){
        personList = new ArrayList<Person>();
        rentals = new ArrayList<Rental>();
        cars = new ArrayList<Car>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }

    public ArrayList<Rental> getRentals() {
        return rentals;
    }

    public void setRentals(ArrayList<Rental> rentals) {
        this.rentals = rentals;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }
    
    
}
