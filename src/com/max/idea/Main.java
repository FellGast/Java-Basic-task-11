package com.max.idea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        String a;
        int b;
        System.out.println("Введите число a");
        Scanner sc = new Scanner(System.in);
        a = sc.next();
        System.out.println("Введите число b");
        b = sc.nextInt();
        sc.close();
        int c = Integer.parseInt(a);

        if(b > c)
        {
            System.out.println(String.format("%s ", b));
            double t = (double)c;
            System.out.println(String.format("%s ", t));
        }
        else
        {
            System.out.println(String.format("%s ", c));
            double t = (double)b;
            System.out.println(String.format("%s ", t));
        }
    }
}
