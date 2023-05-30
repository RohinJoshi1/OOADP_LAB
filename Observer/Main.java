package Observer;
/*
 *Observer (Behavioural): There will be different discounts being offered for the sports items
 *in Decathlon Stores across the globe for different festivals being celebrated 
 *in the various countries these stores are established. Assume that the Decathlon Chain of Stores
 *fixes a particular discount slab for its items for a festival of a country.                
 *Use the Observer Pattern to design and implement a system to notify the 
 *customers of the Decathlon stores of that country about the various
 *festival / seasonal discount rates as and when they are announced. 
 */
public class Main {
    public static void main(String[] args) {
        Store s = new Store();
        Customer c = new Customer(s);
        Customer c3 = new Customer(s);
        s.setDiscount(100);
        s.setDiscount(50);
    }
}
