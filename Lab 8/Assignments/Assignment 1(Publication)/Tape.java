/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ibrhaim
 */
public class Tape extends Publication{
    private int Play_Time;

    public Tape(){

    }
    public Tape(int Price, String Title,int Play_Time){
        this.Play_Time = Play_Time;
    }
    public void setPlay_Time(int Play_Time){
        this.Play_Time = Play_Time;
    }
    public int getPlay_Time(){
        return Play_Time;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Play time : " + getPlay_Time()+" minutes ");
        
    }
}
