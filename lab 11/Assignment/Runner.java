/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

/**
 *
 * @author Ibrhaim
 */
public class Runner {
    public static void main(String[]args){
         Shape[] s = new Shape[7];
            s[0]= new Triangle(2.5, 1.7);
            s[1]= new Rectangle(1.9, 2.5);
            s[2]= new Circle(11.9);
            s[3]= new Triangle(3.7,4.5);
            s[4]= new Circle(7.2);
            s[5]=new Rectangle(7.2, 5.1);
            s[6]= new Triangle(11.6, 1.9);
            double areas[] = CalculateAreas.calcfunc(s);
            for(double a: areas) {
                System.out.println(a);
            }
        }
}
        
        



