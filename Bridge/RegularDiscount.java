package Bridge;

public class RegularDiscount implements iDiscount {

    @Override
    public double calculateDiscount(double cost) {
        return 0.12f*cost;
    }
    
}
