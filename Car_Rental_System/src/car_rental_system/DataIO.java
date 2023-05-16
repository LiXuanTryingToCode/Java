/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car_rental_system;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import java.util.Collections;
import java.util.List;


public class DataIO {  //customer side changes update here
    public static ArrayList<Customer> allCustomers = new ArrayList<Customer>(); //static means only one database
    public static ArrayList<Car> allCars = new ArrayList<Car>(); //static means only one database
    public static ArrayList<Booking> allBookings = new ArrayList<Booking>();
    public static ArrayList<Payment> allPayments = new ArrayList<Payment>();
//    public static ArrayList<Booking> allPendings = new ArrayList<Booking>();
    public static ArrayList<Feedback> allFeedbacks = new ArrayList<Feedback>();
    
    public static void readFromTextFile(){
        try{
            Scanner s1 = new Scanner(new File("customer.txt"));
            Scanner s2 = new Scanner(new File("car.txt"));
            while(s1.hasNext()){
                String a = s1.nextLine();
                int b = Integer.parseInt(s1.nextLine());
                String i = s1.nextLine();
                String d = s1.nextLine();
                int e = Integer.parseInt(s1.nextLine());
                String f = s1.nextLine();
                String g = s1.nextLine();
                String h = s1.nextLine();
                String o = s1.nextLine();
                s1.nextLine();
                Customer c = new Customer(a,b,i,d,e,f,g,h,o); // read all cus then put into this arraylist
                allCustomers.add(c);
            }

        }catch(Exception c){
            JOptionPane.showMessageDialog(null,"Failed to connect CUSTOMERS DATABASE...\nTry Again.");
        }
    
    }
    public static void readFromCarTextFile(){
        try{
            Scanner s2 = new Scanner(new File("car.txt"));
            while(s2.hasNext()){              
                String line1 = s2.nextLine();
                String asd = line1.toString().trim();
                String[] cars = asd.split("/");
                Double costs = Double.parseDouble(cars[5]);
                Car o = new Car(cars[0],cars[1],cars[2],cars[3],cars[4],costs);
                allCars.add(o);
            }      
        }catch(Exception c){
            JOptionPane.showMessageDialog(null,"Failed to connect CARS DATABASE...\nTry Again.");
        }
    }
    
    public static void readFromBookingTextFile(){
        try{
            Scanner s3 = new Scanner(new File("booking.txt"));
            while(s3.hasNext()){              
                String line1 = s3.nextLine();
                String asd = line1.toString().trim();
                String[] bookings = asd.split("/");
                int duration = Integer.parseInt(bookings[1]);
                Customer customer = Check.checkUsername(bookings[5]);
                Car car = Check.checkCarPlate(bookings[6]);
                Booking p = new Booking(bookings[0],duration,bookings[2],bookings[3],bookings[4],customer,car); // read all cus then put into this arraylist
                allBookings.add(p);
            }      
        }catch(Exception c){
            JOptionPane.showMessageDialog(null,"Error to connect BOOKINGS DATABASE...\nTry Again.");
        }
    }
    
    public static void readFromPaymentTextFile(){
        try{
            Scanner s4 = new Scanner(new File("payment.txt"));
            while(s4.hasNext()){              
                String line1 = s4.nextLine();
                String asd = line1.toString().trim();
                String[] payments = asd.split("/");
                double amount = Double.parseDouble(payments[1]);
                Customer customer = Check.checkUsername(payments[4]);
                Payment p = new Payment(payments[0],amount,payments[2],payments[3],customer); // read all cus then put into this arraylist
                allPayments.add(p);
            }      
        }catch(Exception c){
            JOptionPane.showMessageDialog(null,"Error to connect PAYMENTS DATABASE...");
        }
    }
    
    public static void readFromFeedbackTextFile(){
        try{
            Scanner s5 = new Scanner(new File("feedback.txt"));
            while(s5.hasNext()){              
                String line1 = s5.nextLine();
                String asd = line1.toString().trim();
                String[] feedbacks = asd.split("/");
//                int rating = Integer.parseInt(feedbacks[1]);
                Customer customer = Check.checkUsername(feedbacks[3]);
                Feedback p = new Feedback(feedbacks[0],feedbacks[1],feedbacks[2],customer); // read all cus then put into this arraylist
                allFeedbacks.add(p);
            }      
        }catch(Exception c){
            JOptionPane.showMessageDialog(null,"Error to connect FEEDBACKS DATABASE...\nTry Again.");
        }
    }
    
    public static void writeToTextFile(){
        try{
            PrintWriter a = new PrintWriter("customer.txt");
            for(Customer c : allCustomers){
                a.println(c.getUsername());
                a.println(Integer.toString(c.getPassword()));
                a.println(c.getIc());
                a.println(c.getPhone_num());
                a.println(c.getAge());  
                a.println(c.getGender());
                a.println(c.getEmail());
                a.println(c.getAddress());
                a.println(c.getTemp_pwd());
                a.println();
            }
            a.close();
            
        }catch(Exception c){
            JOptionPane.showMessageDialog(null,"Failed to write...\nTry Again.");
        }
    }
    
    public static void writeToTextCarFile(){
        PrintWriter b = null;
        try {
            b = new PrintWriter("car.txt");
//            Scanner s1 = new Scanner(new File("customer.txt"));
//            Customer customer = checkUsername(s1.nextLine());
            for(Car t : allCars){
                b.println(t.getCar_ID()+"/"+t.getPlate_number()+"/"+t.getCar_brand()+"/"+t.getCar_type()+"/"+ t.getStatus()+"/"+t.getCost());
            }   b.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Failed to write...\nTry Again.");
        } finally {
            b.close();
        }
    }  
    
    public static void writeToTextBookingFile(){
        PrintWriter b = null;
        try {
            
            b = new PrintWriter("booking.txt");
//            Scanner s1 = new Scanner(new File("customer.txt"));
//            Customer customer = checkUsername(s1.nextLine());
            for(Booking t : allBookings){
                b.println(t.getBooking_id()+"/"+t.getDuration()+"/"+t.getBooking_date()+"/"+t.getStart_time()+"/"+ t.getStatus() + "/" + t.getRentee().getUsername()+"/"+t.getCar().getPlate_number());
            }   b.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Failed to write...\nTry Again.");
        } finally {
            b.close();
        }
    }
    
    public static void writeToTextPaymentFile(){
        PrintWriter b = null;
        try {
            b = new PrintWriter("payment.txt");
            for(Payment t : allPayments){
                b.println(t.getPayment_id()+"/"+t.getAmount()+"/"+t.getMethod()+"/"+t.getDate()+"/"+t.getRentee().getUsername());
            }   b.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Failed to write...\nTry Again.");
        } finally {
            b.close();
        }
    }
    
    public static void writeToTextFeedbackFile(){
        PrintWriter b = null;
        try {
            b = new PrintWriter("feedback.txt");
            for(Feedback t : allFeedbacks){
                b.println(t.getFeedback_id()+"/"+t.getRating()+"/"+t.getComments()+"/"+ t.getCustomer().getUsername());
            }   b.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Failed to write...\nTry Again.");
        } finally {
            b.close();
        }
    } 
    
    public static int createNewBookingID(){
        int new_id = 0; //before check so not found yet
        for(Booking e : allBookings){ //read whole arraylist
            int int_id = Integer.parseInt(e.getBooking_id());
            new_id  =  int_id + 1;        
        }
        return new_id;
    }
    
    public static int createNewPaymentID(){
        int new_id = 0; //before check so not found yet
        for(Payment e : allPayments){ //read whole arraylist
            int int_id = Integer.parseInt(e.getPayment_id());
            new_id  =  int_id + 1;
        }
        return new_id; 
    }
    
    public static int createNewFeedbackID(){
        int new_id = 0; //before check so not found yet
        for(Feedback e : allFeedbacks){ //read whole arraylist
            int int_id = Integer.parseInt(e.getFeedback_id());
            new_id  =  int_id + 1;
        }
        return new_id; //no object then null, if equal thn return that one 
    }
    
    
    public static Car checkCarID(String id){
        Car idfound = null;
        for(Car c : allCars){
            if(id.equals(c.getCar_ID())){
                idfound = c;
                break;
            }
        }
        return idfound;
    }
    
    public static Booking checkBookingCarPlate(String car_plate){
    Booking found = null;
    for(Booking c : allBookings){
        if(car_plate.equals(c.getCar().getPlate_number())){
            found = c;
            break;
            }
        }
        return found;
    }
    
    public static boolean validateJavaDate(String strDate)
   {
	if (strDate.trim().equals(""))
	{
	    return true;
	}
	else
	{
            SimpleDateFormat sdfrmt = new SimpleDateFormat("yyyy-MM-dd");
	    sdfrmt.setLenient(false);
	    try
	    {
	        Date javaDate = sdfrmt.parse(strDate); 
	        System.out.println(strDate+" is valid date format");
	    }
	    catch (ParseException e)
	    {
	        System.out.println(strDate+" is Invalid Date format");
	        return false;
	    }
	    return true;
	}
   }
    
    public static void sortFile() throws IOException
    {     
        List<String> lines = new ArrayList<String>();
        List<String> lines1 = new ArrayList<String>();
        List<String> lines2 = new ArrayList<String>();
        Scanner s5 = new Scanner(new File("booking.txt")); 
        while (s5.hasNext()) {
            String line1 = s5.nextLine();
            String asd = line1.toString().trim();
            String[] bookings = asd.split("/");
            if (Integer.parseInt(bookings[0]) < 10){
                lines.add(asd);    
            }else if (Integer.parseInt(bookings[0]) >= 10){
                lines1.add(asd);        
            }else if (Integer.parseInt(bookings[0]) >= 20){
                lines2.add(asd);        
            }       
        }
        Collections.sort(lines);
        Collections.sort(lines1);
        Collections.sort(lines2);
        for (String str: lines1){
            lines.add(str);
        }
        for (String str: lines2){
            lines.add(str);
        }
        FileWriter writer = new FileWriter("C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\Car_Rental_System\\booking.txt"); 
        for(String str: lines){
          writer.write(str + "\r\n");
        }
        writer.close();
    }
    
    public static void sortCarFile() throws IOException
    {     
        List<String> lines = new ArrayList<String>();
        List<String> lines1 = new ArrayList<String>();
        List<String> lines2 = new ArrayList<String>();
        Scanner s5 = new Scanner(new File("car.txt")); 
        while (s5.hasNext()) {
            String line1 = s5.nextLine();
            String asd = line1.toString().trim();
            String[] bookings = asd.split("/");
            if (Integer.parseInt(bookings[0]) < 10){
                lines.add(asd);    
            }else if (Integer.parseInt(bookings[0]) >= 10){
                lines1.add(asd);        
            }else if (Integer.parseInt(bookings[0]) >= 20){
                lines2.add(asd);        
            }       
        }
        Collections.sort(lines);
        Collections.sort(lines1);
        Collections.sort(lines2);
        for (String str: lines1){
            lines.add(str);
        }
        for (String str: lines2){
            lines.add(str);
        }
        FileWriter writer = new FileWriter("C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\Car_Rental_System\\car.txt"); 
        for(String str: lines){
          writer.write(str + "\r\n");
        }
        writer.close();
    }
    
    public static void deleteCar(String no){
        try{
            for(Car car:allCars){
                if(car.getCar_ID().equals(no)){
                    allCars.remove(car);
                    }
                }
            }catch(Exception e){
                
            }
    }
    
    public static void updateCar(String no, Car carToUpdate){
        try{
            for(Car car:allCars){
                if(car.getCar_ID().equals(no)){
                    int carindex = allCars.indexOf(car);
                    System.out.println(carindex);
                    allCars.set(carindex, carToUpdate);
                }
            }
            
        }catch(Exception e){          
        }   
    }
    
    public static void approveBooking(String id){
        try{
            for(Booking book:allBookings){
                if(book.getBooking_id().equals(id)){
                    book.setStatus("Appoved");
                }
            }
        }catch(Exception e){       
        }
    }

    public static void rejectBooking(String id){
        try{
            for(Booking book:allBookings){
                if(book.getBooking_id().equals(id)){
                    book.setStatus("Rejected");
                }
            }
        }catch(Exception e){
                    
            }
        }
    
    public static String generateRandomPassword(int len)
    {
        // ASCII range – alphanumeric (0-9, a-z, A-Z)
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
 
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
 
        // each iteration of the loop randomly chooses a character from the given
        // ASCII range and appends it to the `StringBuilder` instance
 
        for (int i = 0; i < len; i++)
        {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }
 
        return sb.toString();
    }
    
    
   }
    
    


