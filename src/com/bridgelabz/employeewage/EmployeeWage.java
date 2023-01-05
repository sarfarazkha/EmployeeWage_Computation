package com.bridgelabz.employeewage;

public class EmployeeWage {
    public static final int IS_FULL_TIME = 2;
    public static final int IS_PART_TIME = 1;
    public static final int EMPLOYEE_WAGE_PER_HOUR = 20;
    public static final int FULL_TIME = 8;
    public static final int PART_TIME = 4;
    public static final int TOTAL_WORKING_DAYS = 20;
    public static final int TOTAL_WORKING_HRS = 100;

    public static void main(String[] args) {
        //int empHrs = 0;
        int workdays = 1;
        int totalwage = 0;

        int workingHrs = 0;
        while (workdays <= TOTAL_WORKING_DAYS && workingHrs <= TOTAL_WORKING_HRS) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            int empWage = 0;
            switch (empCheck) {
                case IS_FULL_TIME:
                    System.out.println("Employee is Full time Present");
                    empWage = FULL_TIME * EMPLOYEE_WAGE_PER_HOUR;
                    workingHrs+=FULL_TIME;
                    break;
                case IS_PART_TIME:
                    System.out.println("Employee is Part time Present");
                    empWage = PART_TIME * EMPLOYEE_WAGE_PER_HOUR;
                    workingHrs+=PART_TIME;
                    break;
                default:
                    System.out.println("Employee is Absent");
            }
            totalwage+=empWage;
            System.out.println("Employee wage for Day #" + workdays + " =>  " + empWage);
            workdays++;
        }
        System.out.println("Total wage: "+totalwage);
        System.out.println("Totalworking Hrs : "+workingHrs);
    }
}