/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ibrhaim
 */
public class Computer {
   public int Word_Size;
   public int Memory_Size;
   public int Storage_Size;
   public int Speed;
    
   public Computer(){
       this(8,250,500,4200);
   }
   public Computer(int Word_Size ,int Memory_Size,int Storage_Size,int Speed){
       this.Word_Size=Word_Size;
       this.Memory_Size=Memory_Size;
       this.Storage_Size=Storage_Size;
       this.Speed=Speed;
   }
   public void display(){
       System.out.println("Wordsize of the computer is "+Word_Size+ " bits. \nMemory size of the computer is "+Memory_Size+" Megabytes. \nStorage size of the computer is "+Storage_Size
       +" Megabytes. \nSpeed of the computer is "+Speed+ " Megahertz ");
   }
   
   
}
    

