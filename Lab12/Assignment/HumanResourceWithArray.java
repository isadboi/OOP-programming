/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12;

/**
 *
 * @author Ibrhaim
 */
public class HumanResourceWithArray{
    private Association [] a1 = new Association [6];
    private int co = 0;
    
    public void add(Association  as){
        extend();
        
        a1[co] = as;
        co++;            
    }
    
    private void extend(){
        Association[] newPerson = new Association[co+1];
        
        if(co > 0)
        {
            for(int i=0; i<newPerson.length; i++)
            {
                newPerson[i] = a1[i];
            }
            
            a1 = newPerson;
        }
    }
        
    public void print(){
        for(int i=0; i<a1.length; i++)
        {
            System.out.println(a1[i] + "\n");
        }
    }
}

