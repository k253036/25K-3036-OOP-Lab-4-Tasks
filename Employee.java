class Employee {

    String name;
    int salary;

    // Normal constructor
    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    // Copy constructor (safe duplicate)
    Employee(Employee other) {
        this.name = other.name;
        this.salary = other.salary;
    }

    void display() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee("Ali", 50000);
        Employee e2 = new Employee(e1); // duplicate

        e2.salary = 60000; // change duplicate

        e1.display();
        e2.display();
    }
}
