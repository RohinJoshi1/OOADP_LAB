package Observer;

public interface Publisher {
    public void addCustomer(Subscriber s);
    public void removeCustomer(Subscriber s);
    public void notifyCustomers();
}
