/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

/**
 *
 * @author Ibrhaim
 */
import java.util.StringTokenizer;

public class CustomStringTokenizer 
{
    
    public static int count_Token(StringTokenizer  st)
    {
        int co=st.countTokens(), finalCo=0;
        String temp;
        boolean flag;
        double doubleValue;
       
        for(int i=0;i<co;i++)
        {
            flag=true;
            temp=st.nextToken();
          
            try
            {
                doubleValue = Double.parseDouble(temp);
            }
            catch(NumberFormatException e)
            {
                flag=false;
            }
            
            if(!flag)
                finalCo++;
        }
        return finalCo;
    }
    
    
    
     public static void main(String[] args) 
    {
     
        StringTokenizer student1 = new StringTokenizer("There are 5 students in this class");
        StringTokenizer student2 = new StringTokenizer("There are five students in this class");
        int co = count_Token(student1);
        System.out.println("Token no in string 1: "+ co);
        co = count_Token(student2);
        System.out.println("Token no in string 2: "+ co);
    }
    
    
}