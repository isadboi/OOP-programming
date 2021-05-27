/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

/**
 *
 * @author Ibrhaim
 */
public class CalculateAreas {
    static double[] calcfunc(Shape[] s){
        double[] answer = new double[s.length];
        for(int i=0;i<s.length;i++){
            if(s[i]!=null)
                answer[i] = s[i].area();
        }
        return answer;
    }
}
