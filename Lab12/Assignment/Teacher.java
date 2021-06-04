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
public class Teacher  extends Person implements Association{
    private String designation;
    private String department;

    public Teacher(String name, String id){
        super(name,id);
    }
    
    public void associate(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Teacher Desingnation,");
        this.designation = input.nextLine();
        System.out.println("Enter Teacher Department,");
        this.department = input.nextLine();
        
    }
    
    @Override
     public String toString(){
        return " Teacher:\n" + super.toString() +  "\n Teacher Designation:\t" + designation + "\n Teacher:\t" + department;
    }  
}

