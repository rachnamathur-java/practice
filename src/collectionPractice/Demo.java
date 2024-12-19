package collectionPractice;

import java.util.Scanner;

public class Demo {
    Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {


            Person person = new Person();
            System.out.println(person.getName());
            //System.out.println(person.setName());

            userDemo(person);
            //Integer s1 = 100;
            System.out.println("outside metod ..." + person.getName());
            //System.out.println(person.getName());
           //System.out.println(userDemo(input1));
            //System.out.println(s1);*/
        }

        public static Person userDemo(Person person) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your input");

            person.setName(scanner.next());

            System.out.println(person.getName());

            return person ;
        }

    }
    class Person{
    String name = "rachna";

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

