/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ibrhaim
 */
public class RunnerAs1Lab8Publication {
    public static void main(String[] args) {
        Book b = new Book();
        Tape t = new Tape();
        t.setTitle(" The Day Earth Cried ");
        b.setTitle(" Oyasumi Punpun ");
        b.setPrice(4000);
        t.setPrice(200);
        b.setPage_Count(250);
        t.setPlay_Time(12);
        b.display();
        System.out.println();
        t.display();
    }
}

