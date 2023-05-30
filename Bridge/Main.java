package Bridge;
/*
 * You are a fresh analyst deputed to design the software for Decathlon Chain of Stores in Karnataka.
 *  You are informed about the Business Logic of Point of Sales criteria by Ms.Veronica Lodge, 
 * a dynamic business tycoon operating out of Decathlon Mumbai. She informs you that there are 
 * different types of Customers of Decathlon namely, Regular Customers, Senior Citizens and 
 * First Time Customers. Regular Customers are given a discount of 12%, 
 * Senior Citizens 10% and First Time Customers 15%. Apart from this, 
 * based on the sales-index of previous day, a Store-level discount is determined every day. This is dynamic.
 *  E.g.Rs.100 off for every purchase above Rs.2000.
 * /
 */
public class Main {
    public static void main(String[] args) {
        FirstTimeCustomer fc = new FirstTimeCustomer("Ram", 24);
        fc.display();

        System.out.println("########");
        OldCustomer oc = new OldCustomer("Ramesh", 82);
        oc.display();
        System.out.println("##########");
        RegularCustomer rc = new RegularCustomer("Jaks", 34);
        rc.display();
    }
    
}
