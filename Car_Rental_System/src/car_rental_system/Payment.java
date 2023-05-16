/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car_rental_system;

/**
 *
 * @author ADMIN
 */
public class Payment {
    private double amount;
    private String payment_id, method, date;
    private Customer rentee;
    
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setRentee(Customer rentee) {
        this.rentee = rentee;
    }

    public Customer getRentee() {
        return rentee;
    }

    public void setPayment_id(String payment_id) {
        this.payment_id = payment_id;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public String getPayment_id() {
        return payment_id;
    }

    public String getMethod() {
        return method;
    }

    public String getDate() {
        return date;
    }

    public Payment( String payment_id, double amount,String method, String date,Customer rentee) {
        this.amount = amount;
        this.payment_id = payment_id;
        this.method = method;
        this.date = date;
        this.rentee = rentee;
    }
}
