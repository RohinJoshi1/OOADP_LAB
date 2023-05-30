package Bridge;
import java.util.*;
abstract public class iCustomer {
    String name;
    int age;
    iDiscount discount;
    double total;
    public iCustomer(String name,int age){
        this.name = name;
        this.age =age;
    }
    private void setTotal(double cost){
        this.total = cost;
    }
    protected void setDiscount(iDiscount discount){
        this.discount = discount;
    }
    public double storeLevelDiscount(double mrp){
        if(mrp>2000)return 200.0f;
        return 0f;
    }
    public double calculateDiscount(double cost){
        return discount.calculateDiscount(cost)+storeLevelDiscount(cost);
    }
    public void display(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total cost");
        double cost = Double.parseDouble(sc.nextLine());
        this.setTotal(cost);
        double discount = calculateDiscount(cost);
        String s = String.format("Name: %s\n Age: %d\n Total cost:%.3f\nDiscount:%.3f\n",name,age,cost,discount);
        System.out.println(s);
    }
}
