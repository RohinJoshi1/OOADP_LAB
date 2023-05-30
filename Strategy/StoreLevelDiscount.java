package Strategy;

public class StoreLevelDiscount {
    double discount =100;
    public double discount(double amt){
        if(amt>2000){
            amt-=discount;
        }
        return amt;
    }
}
