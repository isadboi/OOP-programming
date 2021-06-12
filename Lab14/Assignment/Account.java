/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ibrhaim
 */
import java.io.Serializable;
public class Account implements Serializable{
    
    private String accountNo;
    private int balance;
    
    public Account(String accountNo, int balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }
    
    public void setAccNo(String accountNo) {
        this.accountNo = accountNo;
    }
    
    public String getAccountNo() {
        return accountNo;
    }
    
    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    public int getBalance() {
        return balance;
    }
    
    @Override
    public String toString() {
        return "Account{" + "Account No='" + accountNo + '\'' + ", balance=" + balance + '}' + "\n";
    }
}

