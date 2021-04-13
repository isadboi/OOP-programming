/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ibrhaim
 */
public class PizzaOrder {
    private Pizza pizza1;
    private Pizza pizza2;
    private Pizza pizza3;
    
    public PizzaOrder(Pizza pizza1, Pizza pizza2,Pizza pizza3){
        this.pizza1 = pizza1;
        this.pizza2 = pizza2;
        this.pizza3 = pizza3;
    }
    public double calcTotal(){
        return pizza1.calCost() + pizza2.calCost()+ pizza3.calCost();
    }   
}
