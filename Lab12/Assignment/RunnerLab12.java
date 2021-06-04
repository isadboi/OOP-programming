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
public class RunnerLab12{
    public static void main(String[] args){
        HumanResource hr= new HumanResource();
        hr.add(new Teacher(" Mukhtar Azeem ", "521") );
        hr.add(new Teacher(" Saira Baig ", "345") );
        hr.add(new Student(" Ibrahim Abullah ", "311") );
        hr.add(new Student(" Usman Khalid ", "619" ));
        hr.add(new Student(" Hassan Nadeem Alvi ", "911") );
        hr.add(new Student(" Zain Ali Shaw ", "69420" ));
        hr.add(new Student(" Amna Younas ", "712") );
        Association s = new Student(" 38 ", " 4 "  );
        s.associate();
        Association t = new Teacher(" Lecturer ", " Computer Sciences ");
        t.associate();
        hr.print();
    }
}
