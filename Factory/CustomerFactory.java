package Factory;

public class CustomerFactory {
    Customer getCustomer(String type){
        if(type.equalsIgnoreCase("Regular")){
            return new RegularCustomer();
        }
        else if(type.equalsIgnoreCase("Senior Citizen")){
            return new SeniorCitizen();
        }
        return new FirstTime();
    }
}
