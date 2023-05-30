package Strategy;

public class FirstTime extends Strategy {

    @Override
    double calculatePrice(double amt) {
       return 0.15f*amt;
    }
}
