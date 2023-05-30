package Bridge;

public class FirstTimeCustomer extends iCustomer {

    public FirstTimeCustomer(String name, int age) {
        super(name, age);
        this.discount = new FirstTimeDiscount();
    }
    public void display(){
        System.out.println("First time customer");
        super.display();
    }

    
}
