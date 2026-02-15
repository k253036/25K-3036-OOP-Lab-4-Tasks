class Mobile {

    String brand;
    int price;

    // No-argument constructor
    Mobile() {
        this("Unknown", 0);
    }

    // Constructor with brand only
    Mobile(String brand) {
        this(brand, 20000);
    }

    // Full constructor
    Mobile(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    void display() {
        System.out.println("Brand: " + brand + ", Price: " + price);
    }

    public static void main(String[] args) {

        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile("Samsung");
        Mobile m3 = new Mobile("iPhone", 150000);

        m1.display();
        m2.display();
        m3.display();
    }
}
