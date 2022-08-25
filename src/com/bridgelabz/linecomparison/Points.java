package com.bridgelabz.linecomparison;

import java.util.Scanner;

    import java.util.Scanner;

    public class Points {
        private double x,y;

        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }


        public void getPoints() {
            Scanner scr = new Scanner(System.in);
            System.out.println("Enter Point x");
            setX(scr.nextInt());
            System.out.println("Enter Point y");
            setY(scr.nextInt());
        }
    }

