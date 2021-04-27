/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

/**
 *
 * @author Ibrhaim
 */
public class Clock {
   
    String hr;
    String min;
    String sec;
    
    
    public Clock(String hr, String min, String sec){
        this.hr=hr;
        this.min=min;
        this.sec=sec;
    }
   
    public void print(){
        System.out.println(this.hr+":"+this.min+":"+this.sec);
    }
}
    

