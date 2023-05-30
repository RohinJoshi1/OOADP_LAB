package Adaptor;

public class DecathlonTax implements iDecathlonTax {

    @Override
    public double tax(String item, int qty, double price) {
        return 0.05*qty*price;
    }
    
}
