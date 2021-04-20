/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ibrhaim
 */
public class Book extends Publication {
    private int Page_Count;

    public Book() {

    }
    public Book(int Page_Count){
        this.Page_Count = Page_Count;
    }
    public void setPage_Count(int Page_Count){
        this.Page_Count = Page_Count;
    }
    public int getPage_Count(){
        return Page_Count;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Page count : " + getPage_Count());
        
    }
}