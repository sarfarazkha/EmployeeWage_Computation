package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line comparison Program");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter co-ordinates of first point of First line :");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Enter co-ordinates of second point of First line :");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.println("Enter co-ordinates of first point of Second line :");
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        System.out.println("Enter co-ordinates of second point of second line :");
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();

        float length1=lengthCal(x1,y1,x2,y2);
        float length2=lengthCal(a1,a2,b1,b2);

        compLines(length1,length2);
    }

    private static void compLines(float length1, float length2) {
        System.out.println("Length of lines are : "+length1+" & "+length2);
        if (Float.compare(length1, length2) >0) {
            System.out.println("Line 1 is greater than line 2");}
        else if (Float.compare(length1, length2) < 0) {
            System.out.println("Line 2 is greater than line 1");}
        else{
            System.out.println("Both lines are Equal");
        }
    }
    public static float lengthCal(int x1, int y1, int x2, int y2){
        float length;
        length = (float) Math.sqrt((Math.pow((x1-x2),2))+(Math.pow((y1-y2),2)));
        return length;
    }
}