package com.bridgelabz.oopsconcepts;

public class StaticAndBlock {
    static int count;
        static {
            System.out.println("Static block is executed");
            count = 10;
        }

        public static void main(String[] args) {
            System.out.println("Inside main method");
            System.out.println("Count: " + count);
        }
    }


