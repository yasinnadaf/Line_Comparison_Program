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

        Double lengthOfLineOne = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.println("Length of line1 is: "+lengthOfLineOne);

        System.out.println("Enter x3 and y3 co-ordinates of first point");
        int x3 = scr.nextInt();
        int y3 = scr.nextInt();
        System.out.println("Enter x4 and y4 co-ordinates of second point");
        int x4 = scr.nextInt();
        int y4 = scr.nextInt();
        Double lengthOfLineTwo = Math.sqrt(Math.pow(x3-x4,2)+Math.pow(y3-y4,2));
        System.out.println("Length of line2 is: "+lengthOfLineTwo);

        if(lengthOfLineOne.equals(lengthOfLineTwo)){
            System.out.println("line1 and line2 are equal");
        }
        else{
            System.out.println("line1 and line2 are not equal");
        }


    }
}
