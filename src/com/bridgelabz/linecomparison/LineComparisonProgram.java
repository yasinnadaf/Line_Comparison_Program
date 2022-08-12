package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class LineComparisonProgram {
    
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter x1 and y1 Co-ordinates of first point");
        int x1 = scr.nextInt();
        int y1 = scr.nextInt();
        System.out.println("Enter x2 and y2 co-ordinates of second point");
        int x2 = scr.nextInt();
        int y2 = scr.nextInt();

        double length = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.println("Length of line is: "+length);

    }
}
