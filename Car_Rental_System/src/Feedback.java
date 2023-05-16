package car_rental_system;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Feedback {;
    private String rating;
    private String feedback_id,comments;
    private Customer customer;
    
    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setFeedback_id(String feedback_id) {
        this.feedback_id = feedback_id;
    }

    public Feedback( String feedback_id,String rating, String comments, Customer customer) {
        this.rating = rating;
        this.feedback_id = feedback_id;
        this.comments = comments;
        this.customer = customer;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getRating() {
        return rating;
    }

    public String getFeedback_id() {
        return feedback_id;
    }

    public String getComments() {
        return comments;
    }

    public Customer getCustomer() {
        return customer;
    }
}
