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

import java.util.ArrayList;
public class HumanResource{
    private ArrayList<Association> resource;
    public HumanResource(){
        resource = new ArrayList<>();
    }
    
    public void add(Association a){
        resource.add(a);
    }
    public boolean delete(String Id){
        
        for(int i = 0; i<resource.size(); i++){
            if(((Person)resource.get(i)).id == Id){
                resource.remove(i);
                return true;
            }
        }
        return false;
    }
    public void print(){
        for(int i = 0; i <resource.size();i++){
            System.out.println();
            System.out.println(i+"-"+resource.get(i).toString());
            System.out.println();
        }
    }
    public String toString(){
        return " ";
    }
   
}
