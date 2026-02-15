class Product {

    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    static Product increasePrice(Product p) {
        return new Product(p.name, p.price + 1000);
    }

    void display() {
        System.out.println("Product: " + name + ", Price: " + price);
    }

    public static void main(String[] args) {

        Product p1 = new Product("Laptop", 50000);

        Product p2 = increasePrice(p1);

        System.out.println("Original Object:");
        p1.display();

        System.out.println("New Object:");
        p2.display();
    }
}
