/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12;

/**
 *
 * @author Ibrhaim
 */
import java.util.Scanner;
public class Student extends Person implements Association{
    private int rollNo;
    private int semester;

    public Student(String name, String id) {
        super(name, id);
    }
    
    public void associate(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Roll No,");
        this.rollNo = input.nextInt();
        System.out.println("Enter your Semester No,");
        this.semester = input.nextInt();

    }
    
    @Override
     public String toString(){
        return " Student: \n" + super.toString() + "\n Roll No:\t" + rollNo + "\n Semester:\t" + semester;
    }  
}

