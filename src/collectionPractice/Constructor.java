package collectionPractice;

public class Constructor {
    Integer i;
    int num1;
    int num2;
    String name;
    boolean b;
    Boolean bl;
    Double d;
    double db;

    // Creating no-args constructor
    /*Constructor() {
        num1 = -1;
        num2 = -1;

    }*/

    public static void main(String[] args) {
        // no-args constructor will invoke
        Constructor obj_x = new Constructor();

        // Printing the values
        System.out.println("integer : " + obj_x.i);
        System.out.println("num1 : " + obj_x.num1);
        System.out.println("num2 : " + obj_x.num2);
        System.out.println("name : " + obj_x.name);
        System.out.println("boolean b : " + obj_x.b);
        System.out.println("Boolean : " + obj_x.bl);
        System.out.println("Double : " + obj_x.d);
        System.out.println("double : " + obj_x.db);
    }
}
