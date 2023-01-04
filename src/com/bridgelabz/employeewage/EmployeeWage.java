package com.bridgelabz.employeewage;

public class EmployeeWage {
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;
    static final int EMP_RATE_PER_HOUR = 20;

    public static void main(String[] args) {
        int empHrs = 0;
        double empCheck = Math.floor(Math.random() * 10) % 3;
        switch ((int) empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
                    break;
            }
            int empSalary = empHrs * EMP_RATE_PER_HOUR;
            System.out.println("EmpWage:" + empSalary);
        }
    }