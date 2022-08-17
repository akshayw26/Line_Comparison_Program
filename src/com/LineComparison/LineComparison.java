package com.LineComparison;

import java.util.Scanner;

public class LineComparison {

    public static void main(String[] args) {

        System.out.println(" Welcome to Line Comparison Computation Program ");
        System.out.println("----------------------------------------------");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x1 : ");
        double x1 = scan.nextDouble();
        System.out.println("Enter x2 : ");
        double x2 = scan.nextDouble();
        System.out.println("Enter y1 : ");
        double y1 = scan.nextDouble();
        System.out.println("Enter y2 : ");
        double y2 = scan.nextDouble();

        double lineLength = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
        System.out.println("Length of line => " +lineLength);
    }
}
