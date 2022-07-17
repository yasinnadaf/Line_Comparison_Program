package com.bridgelabz.linecomparison;

import java.util.Scanner;
public class LineComparisonProgram {

    public static void main(String[] args) {
        System.out.println("welcome to line comparison computation program");
        LineComparisonProgram lineCompare=new LineComparisonProgram();
        lineCompare.getLength();


    }

    public void getLength() {
        Scanner scr = new Scanner(System.in);
        int x1, x2, x3, x4, y1, y2, y3, y4;

        System.out.println("Enter a x1 and y1 value of a first point of line1:");
         x1 = scr.nextInt();
         y1 = scr.nextInt();
        System.out.println("Enter a x2 and y2 value of a second point of line 1");
         x2 = scr.nextInt();
         y2 = scr.nextInt();
        System.out.println("Enter a x3 and y3 value of a third point of line 2");
         x3 = scr.nextInt();
         y3 = scr.nextInt();
        System.out.println("Enter a x4 and y4 value of a fourth point of line 2");
         x4 = scr.nextInt();
         y4 = scr.nextInt();

         int length1=(int) Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
         int length2=(int) Math.sqrt(Math.pow(y4-x3,2)+ Math.pow(y4-y3,2));
        System.out.println("Length of line1 is: "+length1);
        System.out.println("Length of line2 is: "+length2);
        Integer lineLength1=length1;
        Integer lineLength2=length2;


        if(lineLength1.equals(lineLength2)){
            System.out.println("Lines are equal");
        }
        else if(lineLength1.compareTo(lineLength2)==-1) {
            System.out.println("Line1 less than line2 ");
        }
        else if(lineLength1.compareTo(lineLength2)==+1) {
            System.out.println("Line1 greater than line2 ");
        }

    }


}