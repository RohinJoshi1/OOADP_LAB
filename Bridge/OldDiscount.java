package Bridge;

public class OldDiscount implements iDiscount {

    @Override
    public double calculateDiscount(double cost) {
       return 0.1f*cost;
    }
    
}
