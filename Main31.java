class Product {
    String ProductName;
    int quantity;
    double price;

    Product(){
        ProductName = "Unknown";
        quantity = 1;
        price = 100;      
    }

    Product(String productName){
        this.ProductName = productName;
        quantity = 1;
        price = 100;
    }
    Product(String productName, int quantity, double price) {
        this.ProductName = productName;
        this.quantity = quantity;
        this.price = price;
    }
    void calculateTotal() {
        System.out.println("Total Price: ₹" + (quantity * price));
    }

}
 class Main31 {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.calculateTotal();

        Product p2 = new Product("Laptop");
        p2.calculateTotal();

        Product p3 = new Product("Mobile", 2, 15000);
        p3.calculateTotal();
    }
}

