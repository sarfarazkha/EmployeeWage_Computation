package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line comparison Program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter co-ordinates of first point :");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Enter co-ordinates of second point :");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        float length;
        length = (float) Math.sqrt((Math.pow((x1 - x2), 2)) + (Math.pow((y1 - y2), 2)));
        System.out.println("Length of line is : " + length);
    }
}
