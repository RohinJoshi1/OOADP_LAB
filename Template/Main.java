package Template;
/*
 * Template Method (Behavioural): To keep up with the customer convenience of online ordering 
 * Decathlon Chain of stores decides to have two modes of order-processing, namely ‘online’ 
 * and ‘offline’. Both modes have the same processing steps for order-processing, namely 
 * ‘selectItem’, ‘doPayment’ and ‘doDelivery’. 
 * But, the way these steps are done varies between the two modes.              
 * selectItem – online – gives tabular depiction of price comparison of the              
 * item chosen. Offline – allows trying out of the items in the store             
 * do Payment – online – net-banking payment; offline – pays through cash /swipe-card 
 * doDelivery – online – needs to pay the charges for shipping & delivery address; 
 * offline – collect at the counter.              
 * Show how you as the analyst will use the Template Method pattern to              
 * design and implement this. 
 */
public class Main {
    public static void main(String[] args) {
        OrderProcess online = new Online();
        online.processOrder();
        OrderProcess offline = new Offline();
        offline.processOrder();
    }
}
