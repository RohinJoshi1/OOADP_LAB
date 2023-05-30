package Template;
// ‘selectItem’, ‘doPayment’ and ‘doDelivery’. 
public abstract class OrderProcess {
    public void processOrder(){
         selectItem();
         doPayment();
         doDelivery();
    }
    abstract void selectItem();
    abstract void doPayment();
    abstract void doDelivery();
}
