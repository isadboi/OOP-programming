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
public class Person {
    protected String id;
    protected String name;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }
    
    @Override
    public String toString(){
        return "Name :\t" + name + "\n ID: \t" + id;
    }      
}