/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package car_rental_system;

/**
 *
 * @author ADMIN
 */
public class Car_Rental_System {
    /**
     * @param args the command line arguments
     */
    public static Login1 page1;
    
    //public static FirstPage_GUI page2;

    public static Customer loginUser = null;
    
    public static void main(String[] args){
        DataIO.readFromTextFile();
        DataIO.readFromCarTextFile();
        DataIO.readFromBookingTextFile();
        DataIO.readFromPaymentTextFile();
        DataIO.readFromFeedbackTextFile();
        page1 = new Login1();
    } 
}

