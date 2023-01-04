package com.bridgelabz.employeewage;

public class EmployeeWage {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int IS_ABSENT = 0;
    public static final int WAGE_PER_HOUR = 20;

    public static void main(String[] args) {
        int wrkHrs = 0;
        int empCheck=(int)(Math.random()*10)%3;

        switch(empCheck) {
            case IS_FULL_TIME : wrkHrs=16;
                System.out.println("Employee is Present Full Time and working hours is = "+wrkHrs);
                break;

            case IS_PART_TIME : wrkHrs=8;
                System.out.println("Employee is Part Time and working hours is = "+wrkHrs);
                break;

            case IS_ABSENT : wrkHrs=0;
                System.out.println("Employee is Absent and working hours = "+wrkHrs);
                break;

            default:System.out.println("Invalid Input");
        }
        System.out.println("Employee's Daily Wage is = "+(wrkHrs*WAGE_PER_HOUR));

    }
}