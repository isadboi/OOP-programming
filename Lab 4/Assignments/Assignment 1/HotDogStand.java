/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ggggg;


public class HotDogStand {
    private int standID;
    private int hotdogssold;
    private static int totalhotdogssold;
    
    
    public HotDogStand(){
        standID=0;
        hotdogssold =0;
        
        
        
    } 
    public HotDogStand(int givenstandID, int newhotdogssold){
        standID=givenstandID;
        hotdogssold=newhotdogssold;
        totalhotdogssold+=newhotdogssold;
        
        
        
        
        
    }
    public void sethotdogssold(){
        hotdogssold++;
        totalhotdogssold++;
        
        
        
        
        
    }
    public int gethotdogs(){
        return hotdogssold;
        
        
        
        
    }
    public  static int gettotalhotdogs(){
        return totalhotdogssold;
    }
    
    public int getstandID(){
        return standID;
    }
    
    
    
    
    
    
    
}