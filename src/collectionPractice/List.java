package collectionPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class List {
    int[] arrInt = new int[10];
    String[] arrString = new String[10];

    public int addRollNo(Scanner scanner){
        System.out.println("enter roll no...");
        int rollNo = scanner.nextInt();
        return rollNo;
    }

    public String addName(Scanner scanner){
        System.out.println("enter name...");
        String name  = scanner.nextLine();
         return name;
    }


    // Main Method
    public static void main(String[] args) {


    }

}

