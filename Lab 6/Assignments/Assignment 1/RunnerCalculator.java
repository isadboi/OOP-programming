/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ibrhaim
 */
import java.util.Scanner;
public class RunnerCalculator {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number1;
        double number2;
        double angle;       
        System.out.print("Enter two digits: ");
        number1 =input.nextDouble();
        number2 =input.nextDouble();
        System.out.println(" Sum of " +number1+ " + " +number2+ " = " + Calculator.sum(number1,number2));
        System.out.println(" Product of " +number1+ " * " +number2+ " = " + Calculator.multiply(number1,number2));
        System.out.println(" Division of " +number1+ " / " +number2+ " = " + Calculator.divide(number1,number2));
        System.out.println(" Remainder of " +number1+ " % " +number2+ " = " + Calculator.remainder(number1,number2));
        System.out.print("Enter  angle: ");
        angle =input.nextDouble();
        System.out.println("sin of " +angle+ " = "+Calculator.sinfunc(angle));
        System.out.println("cos of " +angle+  " = "+Calculator.cosfunc(angle));
        System.out.println("tan of " +angle+ " = "+Calculator.tanfunc(angle));
        
    }
}
    
