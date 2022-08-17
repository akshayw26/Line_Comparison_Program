package com.LineComparison;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {

        System.out.println("Welcome to line comparison computation program");
        System.out.println("----------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x1 : ");
        double x1 = scanner.nextDouble();
        System.out.println("Enter x2 : ");
        double x2 = scanner.nextDouble();
        System.out.println("Enter y1 : ");
        double y1 = scanner.nextDouble();
        System.out.println("Enter y2 : ");
        double y2 = scanner.nextDouble();

        System.out.println("Enter x3 : ");
        double x3=scanner.nextDouble();
        System.out.println("Enter x4 : ");
        double x4=scanner.nextDouble();
        System.out.println("Enter y3 : ");
        double y3=scanner.nextDouble();
        System.out.println("Enter y4 : ");
        double y4=scanner.nextDouble();

        Double lineLength1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        Double lineLength2 = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));

        System.out.println("-------------------------------------");
        System.out.println(" Length of line 1 is  : "+lineLength1);
        System.out.println(" Length of line 2 is  : "+lineLength2);
        //used compareTo method
        if(compare(lineLength1,lineLength2)) {
            System.out.println(" Line 1 is greater than line 2 ");
        }else {
            System.out.println(" line 2 is greater than line 1 ");
        }
    }
