package Observer;

public class Customer implements Subscriber {
    private double discount;
    private Publisher s;
    public Customer(Publisher s){
        this.s = s;
        s.addCustomer(this);
    }
    public void setStore(Publisher s){
        this.s= s;
        s.addCustomer(this);
    }
    public void updateStore(Publisher oldStore,Publisher newStore){
        this.s.removeCustomer(this);
        setStore(newStore);
    }
    @Override
    public void update(double discount) {
      this.discount = discount;
      alert();
    }
    public void alert(){
        System.out.println("DISCOUNT ALERT");
        System.out.println("NEW DISCOUNT IS "+discount);
    }

    
}
