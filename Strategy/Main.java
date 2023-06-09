package Strategy;
/*You are a fresh analyst deputed to design the software for 
Decathlon Chain of Stores in Karnataka. 
You are informed about the Business Logic of Point of Sales criteria by Ms.Veronica Lodge,
 a dynamic business tycoon operating out of Decathlon Mumbai. 
 She informs you that there are different types of Customers of Decathlon namely, 
 Regular Customers, Senior Citizens and First Time Customers. 
 Regular Customers are given a discount of 12%, Senior Citizens 10% and First Time Customers 15%. 
 Apart from this, based on the sales-index of previous day,
 a Store-level discount is determined every day. This is dynamic. E.g.Rs.100 off for every purchase above Rs.2000. 
 * Strategy (Behavioural):
 *  How will you use the Strategy Pattern to tackle the limitations of traditional 
 * Object Oriented Design highlighted in PART A? The design must handle varying 
 * price-schemes having different pricing algorithms. Design & implement.
 */
public class Main {
    public static void main(String[] args) {
        Strategy ft = new FirstTime();
        Context c1 = new Context(ft);
        c1.calculate(100000);
        c1.setStrategy(new RegularCustomer());
        c1.calculate(100000);
    }
}
