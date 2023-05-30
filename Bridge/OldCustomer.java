package Bridge;

public class OldCustomer extends iCustomer {

    public OldCustomer(String name, int age) {
        super(name, age);
        this.discount = new OldDiscount();
    }

     public void display(){
        System.out.println("Senior citizen");
        super.display();
    }

}
