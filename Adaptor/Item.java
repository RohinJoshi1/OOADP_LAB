package Adaptor;

public class Item {
    String name;
    int quantity;
    double price;
    double billAmount =0.0;
    iDecathlonTax tax;
    Item(String name,int quantity,double price,iDecathlonTax tax){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.tax = tax;
    }
    public String toString(){
        String s = String.format("%s %f %d", name,price,quantity);
        return s;
    }
    void setTax(iDecathlonTax tx){
        this.tax =tx;
    }
    void setQuantity(int qty){
        this.quantity= qty;
    }
    void printPrice(){
        double _tax = this.tax.tax(name,quantity,price);
        this.billAmount = price*quantity+_tax;
        System.out.println("Please pay "+billAmount);
        System.out.println(this.toString());

    }
}
