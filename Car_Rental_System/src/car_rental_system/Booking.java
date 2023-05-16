/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car_rental_system;

/**
 *
 * @author ADMIN
 */
public class Booking {
    private int duration;
    private String booking_id,  booking_date, start_time, status;
    private Customer rentee; //Object oriented, use this to get other info: owner.getPhone
    private Car car;

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }
    
    public int getDuration() {
        return duration;
    }

    public void setRentee(Customer rentee){
    this.rentee = rentee;
    }
    
    public String getBooking_id() {
        return booking_id;
    }

    public String getBooking_date() {
        return booking_date;
    }

    public Customer getRentee() {
        return rentee;
    }

    public Booking(String booking_id,int duration, String booking_date, String start_time, String status,Customer rentee,Car car) {
        this.duration = duration;
        this.booking_id = booking_id;
        this.booking_date = booking_date;
        this.start_time = start_time;
        this.rentee = rentee;
        this.car = car;
        this.status = status;
    }
    
    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setBooking_id(String booking_id) {
        this.booking_id = booking_id;
    }

    public void setBooking_date(String booking_date) {
        this.booking_date = booking_date;
    }
}
