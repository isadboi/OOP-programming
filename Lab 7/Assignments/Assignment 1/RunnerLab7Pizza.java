/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ibrhaim
 */
public class RunnerLab7Pizza {
     public static void main(String[] args){
         
                Pizza pizza1 = new Pizza("small", 4, 3, 10);
		Pizza pizza2 = new Pizza("medium", 5, 3, 2);
		Pizza pizza3 = new Pizza("large", 4, 4, 6);
		
		System.out.println(pizza1.getDescription());
		System.out.println(pizza2.getDescription());
		System.out.println(pizza3.getDescription());
              
        PizzaOrder pizzaorder = new PizzaOrder(pizza1,pizza2,pizza3);
        System.out.println("Cost of the three ordered pizza:$"+pizzaorder.calcTotal());
        
    }
}
   
    
    

