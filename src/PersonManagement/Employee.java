/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonManagement;

import RentalManagement.Rental;
import RentalManagementSystem.Store;
import StockManagement.Car;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Sanket
 */
public class Employee extends Person{
    private String officeAddress;
    private String phoneNumber;
    private String username;
    private String password;
    private Role role;
    

    public Employee(String officeAddress, String phoneNumber, String username, String password, Role role, int id, String name, Date dateOfBirth, String address, String telephoneNumber) {
        super(id, name, dateOfBirth, address, telephoneNumber);
        this.officeAddress = officeAddress;
        this.phoneNumber = phoneNumber;
        this.username = username;
        this.password = password;
        this.role = role;
    }
    
    //constructor overloading that allows us to create new employee incase the employee has not yet been assigned to a specific office.
    public Employee(String phoneNumber, String username, String password, Role role, int id, String name, Date dateOfBirth, String address, String telephoneNumber) {
        super(id, name, dateOfBirth, address, telephoneNumber);
        this.phoneNumber = phoneNumber;
        this.username = username;
        this.password = password;
        this.role = role;
        this.officeAddress = "Not assigned yet";
    }

    
    
    

    public String getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(String officeAddress) {
        this.officeAddress = officeAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    
    public void addPerson(Store store, Person person){
        store.getPersonList().add(person);
    }
    
    public Person searchPersonById(int id, Store store){
        ArrayList<Person> personList = store.getPersonList();
        Person person = null;
        for(Person per : personList){
            if(per.getId() == id){
                person = per;
            }                           
        }
        return person;
    }
    
    public void addCar(Car car, Store store){
        store.getCars().add(car);
    }
    
    public ArrayList<Car> searchCarByYearOfManufacture(Store store, int yearOfManufacture){
        ArrayList<Car> cars = store.getCars();
        ArrayList<Car> carsFound = new ArrayList<Car>();
        for (Car car : cars){
            if(car.getYearOfManufacture() == yearOfManufacture){
                carsFound.add(car);
            }
        }
        return carsFound;
    }
    
    public Car searchCarByRegistrationNumber(Store store, String registrationNumber){
        ArrayList <Car> cars = store.getCars();
        Car car = null;
        for(Car c : cars){
            if(c.getRegistrationNumber().equals(registrationNumber)){
                car = c;
                break;
            }
        }
        return car;
    }
    
    public void rentCar(Rental rental, Store store, Car car, Customer customer){
        store.getRentals().add(rental);
        customer.getRentals().add(rental);
        car.getRentals().add(rental);
        car.rented();
    }
    
    public boolean returnCar(String registrationNumber, Store store){
        boolean carReturned = false;
        for(Rental rental : store.getRentals()){
            Car car = rental.getCar();
            if(car.getRegistrationNumber().equals(registrationNumber) && rental.getReturnDate() == null){
                rental.setReturnDate(new Date());
                car.returned();
                carReturned = true;
                break;
            }
            else carReturned = false;
        }
        return carReturned;
    }
}
