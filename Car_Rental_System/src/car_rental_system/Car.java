/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car_rental_system;

/**
 *
 * @author ADMIN
 */
public class Car {
    private double cost;
    private String car_id, car_type, car_brand, status,plate_number;
    
   
    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
    
    public String getCar_ID() {
        return car_id;
    }
    
    public void setCar_ID(String car_id) {
        this.car_id = car_id;
    }
    
    public Car(String car_id, String plate_number,  String car_brand, String car_type,String status,double cost) {
        this.car_id = car_id;
        this.plate_number = plate_number;
        this.cost = cost;
        this.car_type = car_type;
        this.car_brand = car_brand;
        this.status = status;
    }

    public void setPlate_Number(String plate_number) {
        this.plate_number = plate_number;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setCar_type(String car_type) {
        this.car_type = car_type;
    }

    public void setCar_brand(String car_brand) {
        this.car_brand = car_brand;
    }

    public String getPlate_number() {
        return plate_number;
    }

    public double getCost() {
        return cost;
    }

    public String getCar_type() {
        return car_type;
    }

    public String getCar_brand() {
        return car_brand;
    }
}
