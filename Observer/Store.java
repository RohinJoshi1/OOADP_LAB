package Observer;
import java.util.*;;
public class Store implements Publisher {
    //It's probably better to create a discount object where we can store state variables for discount
    //Such as festival name and stuff
    float discount = 0.0f;
    ArrayList<Subscriber> customers;
    public Store(){
        customers = new ArrayList<>();
    }
    protected void setDiscount(float discount){
        this.discount = discount;
        notifyCustomers();
    }
    @Override
    public void addCustomer(Subscriber s) {
        this.customers.add(s);
    }

    @Override
    public void removeCustomer(Subscriber s) {
       this.customers.remove(s);
    }

    @Override
    public void notifyCustomers() {
        for(Subscriber c : customers){
            c.update(discount);
        }
    }
    
}
