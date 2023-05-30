package Facade;
import java.util.*;
import java.util.Map.Entry;
class Item{
    String name;
    double price;
    Item(String name,double price){
        this.name = name;
        this.price = price;
    }
    double getPrice(){
        return this.price;
    }
    String getItemDetails(){
        String s = String.format("Name: %s\nPrice: %f",name,price);
        return s;
    }
}
public class PurchaseItems {
    int count;
    //Item -> Quantity
    HashMap<Item, Integer> map;
    PurchaseItems(){
        map = new HashMap<>();
        addToCart();
    }
    private void addToCart() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of items you wish to purchase");
        this.count = Integer.parseInt(sc.nextLine());
        for(int i=0;i<count;i++){
            System.out.println("Enter name");
            String name = sc.nextLine();
            System.out.println("Enter Quantity");
            int q = Integer.parseInt(sc.nextLine());
            System.out.println("Enter price");
            double p = Double.parseDouble(sc.nextLine());
            Item it = new Item(name, p);
            map.put(it,q);
        }
    }
    public void displayCart(){
        for(Entry<Item,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey().getItemDetails()+"\n"+entry.getValue());
        }

    }
    public int getCount(){
        return this.count;
    }
    public double getTotalCost(){
        double cost = 0.0f;
        for(Entry<Item,Integer> entry:map.entrySet()){
            cost+= entry.getKey().getPrice()*entry.getValue();
        }
        return cost;
    }
}
