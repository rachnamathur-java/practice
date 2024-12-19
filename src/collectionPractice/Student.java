package collectionPractice;

public class Student {
    String name;
    int age;
    String grade;
    String course;

    public Student(String name) {
        this(21,"john","A");
        System.out.println("Calling constructor 3...");
        this.name = name;
    }

    public Student(String name, int age) {
        this("Mike");
        System.out.println("Calling constructor 1...");
        this.name = name;
        this.age = age;
    }

    public Student(int age, String name, String grade) {
        System.out.println("hello I am Constructor 3...");

        this.age = age;
        this.name = name;
        this.grade = grade;
    }

    public Student(String name, int age, String grade, String course) {
        this("peter", 21);
        System.out.println("Calling constructor 2...");
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.course = course;
    }

    public static void main(String[] args) {
        Student student = new Student("Rachna", 32, "A", "Java");
    }
}
