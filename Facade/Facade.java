package Facade;

public class Facade {
    PurchaseItems it;
    ProcessSales ps;
    Facade(boolean cert){
        it = new PurchaseItems();
        ps = new ProcessSales(cert, it.getTotalCost(), it.getCount());
    }
    void displayItems(){
        it.displayCart();
    }
    void processSale(){
        ps.makeSale();
    }
}
