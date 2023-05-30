package Bridge;

public class RegularCustomer extends iCustomer{

    public RegularCustomer(String name, int age) {
        super(name, age);
        this.discount = new RegularDiscount();
    }
    public void display(){
        System.out.println("Regular customer");
        super.display();
    }


    
}
