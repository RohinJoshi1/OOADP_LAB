package Strategy;

public class RegularCustomer extends Strategy {

    @Override
    double calculatePrice(double amt) {
       return 0.12f*amt;
    }
    
}
