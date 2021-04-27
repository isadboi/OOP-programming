/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

/**
 *
 * @author Ibrhaim
 */
public class StringTokenizer {
   
    
    int count_Token;
    
    public StringTokenizer(){
        this.count_Token=0;
    }
    
    public StringTokenizer(int countToken){
        this.count_Token=countToken;
    }
    
    public void count_Token(){
        count_Token++;
    }
    
    public void setCountToken(int countToken){
        this.count_Token=countToken;
    }
    
    public int getToken(){
        return count_Token;
        
    }
    public void print(){
        System.out.print("CountTokens: "+count_Token);
    }
    
    
}
    
