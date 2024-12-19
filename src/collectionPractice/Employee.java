package collectionPractice;

public class Employee {
    int id;
    String name;
    String email;
    public Employee() {
        System.out.println("inside default...");
    }

    public Employee(int id) {
        this();
        System.out.println("inside 1 parameter const");
        this.id = id;
    }

    public Employee(int id, String name) {
        this(34);
        System.out.println("inside 2 parameter const");
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Employee employee = new Employee(34, "rachna");
    }
}
