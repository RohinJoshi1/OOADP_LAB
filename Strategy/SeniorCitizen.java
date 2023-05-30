package Strategy;

import java.io.StreamCorruptedException;

public class SeniorCitizen extends Strategy {

    @Override
    double calculatePrice(double amt) {
        return 0.1f*amt;
    }
    
}
