package car_rental_system;

import static car_rental_system.DataIO.allCars;
import static car_rental_system.DataIO.allCustomers;

abstract class ObjectChecker {
    public abstract void checkUsername();
    public abstract void checkCarPlate();
}

abstract class Check extends ObjectChecker{
    public static Customer checkUsername (String username){
        Customer found = null; //before check so not found yet
        for(Customer c : allCustomers){ //read whole arraylist
            if(username.equals(c.getUsername())){ //cannot use "=" becuz is oject
                found = c;
                break;
            }
        }
        return found; //no object then null, if equal thn return that one 
    }
    
    public static Car checkCarPlate(String car_plate){
        Car found = null;
        for(Car c : allCars){
            if(car_plate.equals(c.getPlate_number())){
                found = c;
                break;
            }
        }
        return found;
    }
}
