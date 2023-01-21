package com.bridgelabz.employeewage;

public class EmpWageBuilder {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation program ");

        int maxHour, maxDays, wagePerHour;

        EmpWageComputation emp1 = new EmpWageComputation();

        System.out.print("Enter Maximum working hours : ");
        maxHour = EmpWageComputation.sc.nextInt();

        System.out.print("Enter Maximum working days : ");
        maxDays = EmpWageComputation.sc.nextInt();

        System.out.print("Enter Employee Wage per hour : ");
        wagePerHour = EmpWageComputation.sc.nextInt();

        emp1.totalWage(maxDays, maxHour, wagePerHour);

        System.out.println("Wage for different company started ");

        EmpWageComputation emp2 = new EmpWageComputation();

        System.out.print("Enter Maximum working hours : ");
        maxHour = EmpWageComputation.sc.nextInt();

        System.out.print("Enter Maximum working days : ");
        maxDays = EmpWageComputation.sc.nextInt();

        System.out.print("Enter Employee Wage per hour : ");
        wagePerHour = EmpWageComputation.sc.nextInt();

        emp2.totalWage(maxDays, maxHour, wagePerHour);

    }
}
