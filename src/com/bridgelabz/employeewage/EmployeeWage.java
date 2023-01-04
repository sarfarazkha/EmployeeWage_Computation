package com.bridgelabz.employeewage;

public class EmployeeWage {
    static final int IS_FULL_TIME = 8;
    static final int EMP_RATE_PER_HOUR = 20;

    public static void main(String[] args) {
        int empHrs = 0;
        int empWage = 0;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_FULL_TIME)
            empHrs = 8;
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Employee Wage:" + empWage);
    }
}