package com.vasu;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        System.out.println("Enter the choice");
          String choice =y.next();
          int a[];
          int[] b;
          int c=new int[5];
          int[] d= new int[5];
          int d[]=new int[5];
          int e[]={1,2,3,4,5};
          int[] f=new int[]{1,2,3,4,5};

        switch (choice) {
            case "First" -> {
                System.out.println("First case");
                System.out.println("Second line");
            }
            case "Second" -> System.out.println("Second case");
            default -> System.out.println("Default case here");
        }
    }


}
