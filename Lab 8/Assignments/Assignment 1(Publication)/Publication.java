/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ibrhaim
 */
public class Publication {
    private String Title;
    private int Price;

    public Publication(){
        
    }
    public Publication(String Title, int Price){
        this.Title = Title;
        this.Price = Price;
    }
   
    public void setPrice(int Price){
        this.Price = Price;
    }
    public int getPrice(){
        return Price;
    }
     public void setTitle(String Title){
        this.Title = Title;
    }
    public String getTitle(){
        return Title;
    }
    
    public void display(){
        System.out.println("Title:"+getTitle()+"\n Price:"+getPrice());
    }
}