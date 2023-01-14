package com.bridgelabz.employeewagecomputation;
public class EmployeeWageComputation {
    final int WAGE_PER_HRS = 20;
    final int WORKING_DAYS_PER_MONTH = 20;
    int maximumHrsInMonth = 100;
    int totalEmployeeHrs = 0;
    int totalWorkingDays = 0;
    int empHrs;
    static int totalEmployeeWage = 0;
    public void employeeWage() {
        while (totalEmployeeHrs <= maximumHrsInMonth &&
                totalWorkingDays < WORKING_DAYS_PER_MONTH) {
            totalWorkingDays++; {
                int empCheck = (int) Math.floor(Math.random() * 10) % 3;
                switch (empCheck) {
                    case 1:
                        System.out.println("Employee is Present");
                        empHrs = 8;
                        break;
                    case 2:
                        System.out.println("Employee is Part-Time Present");
                        empHrs = 4;
                        break;
                    default:
                        System.out.println("Employee is Absent");
                        empHrs = 0;
                }
                totalEmployeeHrs = empHrs + totalEmployeeHrs;
                System.out.println("Day:" + totalWorkingDays + " EmpHour: " + empHrs);
            }
            totalEmployeeWage = totalEmployeeHrs * WAGE_PER_HRS;
        }

    }
    public static void main(String[] args){
        EmployeeWageComputation obj = new EmployeeWageComputation();
        obj.employeeWage();
        System.out.println("Total Employee Wage is " + totalEmployeeWage);
    }
}

