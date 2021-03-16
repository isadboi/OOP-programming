/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ggggg;


public class RunnerLab4As1 {
    public static void main(String[]args){
        HotDogStand p1= new HotDogStand();
        
        HotDogStand stand1= new HotDogStand(1234 , 50);
        HotDogStand stand2= new HotDogStand(2467 , 10);
        HotDogStand stand3= new HotDogStand(1521 , 40);
        stand1.sethotdogssold();
        stand1.sethotdogssold();
        stand1.sethotdogssold();
        
        stand2.sethotdogssold();
        stand2.sethotdogssold();
        
        
        stand3.sethotdogssold();
        stand3.sethotdogssold();
        stand3.sethotdogssold();
        stand3.sethotdogssold();
        
   

        System.out.println(" The stand Id number is " +stand1.getstandID()+ " The hotdogs sold is " +stand1.gethotdogs()  );
        System.out.println(" The stand Id number is " +stand2.getstandID()+ " The hotdogs sold is " +stand2.gethotdogs()  );
        System.out.println(" The stand Id number is " +stand3.getstandID()+ " The hotdogs sold is " +stand3.gethotdogs()  );
        
        System.out.println(" The total hotdogs sold on both stands are "+ HotDogStand.gettotalhotdogs()          );
     
        
        
    }
}
    
    
    
    
    
   

