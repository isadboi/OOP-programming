/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ibrhaim
 */
public class Laptop extends Computer{
    public int Length;
    public int Width;
    public int Height;
    public int Weight;
    
    public Laptop(){
        super();
        
    }
  
     public Laptop(int Length,int Width,int Height,int Weight){
         this.Length=Length;
         this.Width=Width;
         this.Weight=Weight;
         this.Height=Height;
    
     }
    public void display(){
        System.out.println(" Weight of the laptop is " +Weight+ " grams. \nLength of the laptop is "+Length+ " inches. \nWidth of this laptop is " +Width+ " inches. \nHeight of the laptop is "+Height+" inches");
        super.display();
    }
    
}