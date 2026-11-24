class Mobile{
    String brand;
    double price;

    Mobile(){
        brand="Samsung";
        price=25000;
    }
    void displayDetails(){
        System.out.println("Mobile Brand: " + brand);
        System.out.println("Mobile Price: ₹" + price);
    }
}
class Main29{
    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.displayDetails();
    }
}