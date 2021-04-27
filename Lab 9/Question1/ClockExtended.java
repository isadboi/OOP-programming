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
public class ClockExtended extends Clock {
 
    public ClockExtended(String hr, String min, String sec){
        super(hr, min, sec);
    }
  
    @Override
    public void print(){
       
        System.out.println(" Time in 24 Hour Format is:");
        super.print();
        System.out.println(" Time in 12 Hour Format:");
        int hr1 = (int)hr.charAt(0) - '0';
        int hr2 = (int)hr.charAt(1)- '0';
        int hh = hr1 * 10 + hr2;
        String a;
        if(hh < 12)
            a="AM";
        else
            a="PM";
        hh %= 12;
        if (hh == 0) {
            System.out.print("12");
            System.out.print(":"+min+":"+sec);
        }
        else{
            System.out.print(hh);
            System.out.print(":"+min+":"+sec);
        }
        System.out.println(" "+a);
    }
}
    
