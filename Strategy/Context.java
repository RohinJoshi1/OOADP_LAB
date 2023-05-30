package Strategy;

import java.util.stream.Stream;

public class Context {
    Strategy s;
    StoreLevelDiscount st = new StoreLevelDiscount();
    public Context(Strategy s){
        this.s= s;
    }
    void calculate(double price){
        double amt = st.discount(price);
        double disc = s.calculatePrice(amt);
        double final_price = amt-disc;
        System.out.println("Please pay "+final_price);
    }
    public void setStrategy(Strategy s){
        this.s = s;
    }
}
