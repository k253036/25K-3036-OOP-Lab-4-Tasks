class LibraryBook {

    String title;
    double price;

    // No-argument constructor
    LibraryBook() {
        this.title = "Unknown";
        this.price = 0;
    }

    // Constructor with title only
    LibraryBook(String title) {
        this.title = title;
        this.price = 500;
    }

    // Constructor with title and price
    LibraryBook(String title, double price) {
        this.title = title;
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title + ", Price: " + price);
    }

    public static void main(String[] args) {

        LibraryBook b1 = new LibraryBook();
        LibraryBook b2 = new LibraryBook("Java Programming");
        LibraryBook b3 = new LibraryBook("OOP Concepts", 1200);

        b1.display();
        b2.display();
        b3.display();
    }
}