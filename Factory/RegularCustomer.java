package Factory;

public class RegularCustomer extends Customer {

    @Override
    void getType() {
        System.out.println("Regular customer");
    }
    
}
