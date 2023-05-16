package car_rental_system;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Customer {
    private String username;
    private int password;
    private String ic;
    private String phone_num;

    public void setTemp_pwd(String temp_pwd) {
        this.temp_pwd = temp_pwd;
    }

    public String getTemp_pwd() {
        return temp_pwd;
    }
    private int age;
    private String gender;
    private String email;
    private String address;
    private String temp_pwd;

    private ArrayList<Booking> allBookings = new ArrayList<Booking>();

    public Customer(String username, int password, String ic, String phone_num, int age, String gender, String email, String address, String temp_pwd) {
        this.username = username;
        this.password = password;
        this.ic = ic;
        this.phone_num = phone_num;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.address = address;
        this.temp_pwd = temp_pwd;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIc() {
        return ic;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getUsername() {
        return username;
    }

    public int getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void setBooking(ArrayList<Booking> allBookings) {
        this.allBookings = allBookings;
    }
}

class blacklist extends Customer{
    private Boolean blacklisted;
    public blacklist(String username, int password, String ic, String phone_num, int age, String gender,
            String email, String address, String temp_pwd, Boolean blacklisted) {
        super(username, password, ic, phone_num, age, gender, email, address, temp_pwd);

}

    public static void showblacklisted(){
        JOptionPane.showMessageDialog(null, "You have been blacklisted");
    }
}
