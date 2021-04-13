/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ibrhaim
 */
public class Pizza {
    private String size;
    private int NoOfCheeseToppings;
    private int NoOfPepperoniToppings;
    private int NoOfHamToppings;
    
    public Pizza(String size, int NoOfCheeseToppings, int NoOfPepperoniToppings, int NoOfHamToppings){
        this.size = size;
        this.NoOfCheeseToppings = NoOfCheeseToppings;
        this.NoOfPepperoniToppings = NoOfPepperoniToppings;
        this.NoOfHamToppings = NoOfHamToppings;
    }
    public void set(String size){
        this.size = size;
    }
     public String getSize(){
        return size;
    }
    public void setNoOfCheeseToppings(int NoOfCheeseToppings){
        this.NoOfCheeseToppings = NoOfCheeseToppings;
    }
      public int getNoOfCheeseToppings(){
        return NoOfCheeseToppings;
    }
    public void setNoOfPepperoniToppings(int NoOfPepperoniToppings){
        this.NoOfPepperoniToppings = NoOfPepperoniToppings;
    }
     public int getNoOfPepperoniToppings(){
        return NoOfPepperoniToppings;
    }
    public void setNoOfHamToppings(int NoOfHamToppings){
        this.NoOfHamToppings = NoOfHamToppings;
    }
      public int getNoOfHamToppings(){
        return NoOfHamToppings;
    }
    public double calCost(){
        double cost;
        if(size.equals("small")){
            cost = 10 + (2*(getNoOfCheeseToppings()+getNoOfPepperoniToppings()+getNoOfHamToppings()));
        }
        else if(size.equals("medium")){
            cost = 12 + (2*(getNoOfCheeseToppings()+getNoOfPepperoniToppings()+getNoOfHamToppings()));
        }
        else{
            cost = 14 + (2*(getNoOfCheeseToppings()+getNoOfPepperoniToppings()+getNoOfHamToppings()));
        }
        return cost;
    }
    public String getDescription(){
        return " Pizza size: "+getSize()+"\nCheese Toppings: "+getNoOfCheeseToppings()+"\nPepperoni Toppings: "+getNoOfPepperoniToppings()+"\nHam Toppings: "+getNoOfHamToppings();
    }
}
