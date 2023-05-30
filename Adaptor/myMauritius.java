package Adaptor;

public class myMauritius implements iDecathlonTax {
    MauritiusTax mt;
    public myMauritius(){
        mt = new MauritiusTax();
    }
    @Override
    public double tax(String item, int qty, double price) {
        return mt.taxCalculate(qty, price);
    }
    
}
