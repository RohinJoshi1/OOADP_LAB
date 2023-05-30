package Factory;
/*
 * The ‘Decathlon POS’ software system classifies its customers as 
 * senior-citizens (60 and above), First-Time customers, Regular Customers. 
 * There is a very high possibility that the Customer Type hierarchy will vary, 
 * depending upon the sales-pattern. 
 * For e.g. there could be the need to introduce new categories based on the customer gender, 
 * different age groups for kids (0-5, 6-12), teenagers (13-19) and 
 * age groups between 20 to 60(Twenties, 30s, 40s and 50s).  
 * You are advised by Mr.Sundar Pichai, 
 * the technical architect of your team, whom you trust, 
 * to use Factory Method Pattern in order to instantiate the above Customer Type hierarchy 
 * of concrete implementation of objects. Design and implement using this. 
 */
public class Main {
    public static void main(String[] args) {
        CustomerFactory cf = new CustomerFactory();
        Customer c1 = cf.getCustomer("Senior Citizen");
        c1.getType();
        Customer c2 = cf.getCustomer("First Time Customer");
        c2.getType();
        Customer c3 = cf.getCustomer("REgular");
        c3.getType();
    }
}
