/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 23Dec2021
 *     <p>Exercise 4.23 (Financial application: payroll) Write a program that reads the following
 *     information and prints a payroll statement: Employee’s name (e.g., Smith) Number of hours
 *     worked in a week (e.g., 10) Hourly pay rate (e.g., 9.75) Federal tax withholding rate (e.g.,
 *     20%) State tax withholding rate (e.g., 9%) A sample run is as follows:
 *     <p>Enter employee’s name: Smith Enter number of hours worked in a week: 10 Enter hourly pay
 *     rate: 9.75 Enter federal tax withholding rate: 0.20 Enter state tax withholding rate: 0.09
 *     Employee Name: Smith Hours Worked: 10.0 Pay Rate: $9.75 Gross Pay: $97.50 Deductions: Federal
 *     Withholding (20.0%): $19.50 State Withholding (9.0%): $8.77 Total Deduction: $28.27 Net Pay:
 *     $69.22
 */
package com.github.jonathanbirkey.chapter04;

import java.util.Scanner;

public class Exercise23 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter employee's name: ");
    String name = input.next();
    System.out.print("Enter number of hours worked in a week: ");
    double hoursWorked = input.nextDouble();
    System.out.print("Enter hourly pay rate: ");
    double hourlyRate = input.nextDouble();
    System.out.print("Enter federal tax withholding rate: ");
    double federalTaxRate = input.nextDouble();
    System.out.print("Enter state tax withholding rate: ");
    double stateTaxRate = input.nextDouble();
    input.close();

    double grossPay = hourlyRate * hoursWorked;
    double federalWithholding = grossPay * federalTaxRate;
    double stateWithholding = grossPay * stateTaxRate;
    double totalDeduction = federalWithholding + stateWithholding;
    double netPay = grossPay - totalDeduction;

    System.out.printf(
        "Employee Name: %s\n"
            + "Hours Worked: %.1f\n"
            + "Pay Rate: $%.2f\n"
            + "Gross Pay: $%.2f\n"
            + "Deductions:\n"
            + "\tFederal Withholding (%.1f%%): $%.2f\n"
            + "\tState Withholding (%.1f%%): $%.2f\n"
            + "\tTotal Deduction: $%.2f\n"
            + "Net Pay: $%.2f",
        name,
        hoursWorked,
        hourlyRate,
        grossPay,
        federalTaxRate * 100,
        federalWithholding,
        stateTaxRate * 100,
        stateWithholding,
        totalDeduction,
        netPay);
  }
}
