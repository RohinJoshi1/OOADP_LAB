package Bridge;

public class FirstTimeDiscount implements iDiscount {

    @Override
    public double calculateDiscount(double cost) {
        return 0.2f*cost;
    }
    
}
