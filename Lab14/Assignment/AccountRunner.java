/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ibrhaim
 */
import java.io.*;

public class AccountRunner{
    private static Account[] atmArray = new Account[10];
    private static BufferedWriter bw;
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public void Inquiry(String accountNo){
        boolean isFound=false;
        for (int i=0;i<10;i++){
            if (atmArray[i].getAccountNo().equalsIgnoreCase(accountNo)){
                isFound=true;
                System.out.println(" Account Balance is: "+ atmArray[i].getBalance());
                break;
            }
        }
        if(!isFound)
            System.out.println(" Invalid account No ");
    }
    
    public void withdraw(String accountNo) throws IOException{
        boolean isFound=false;
        int withdrawing_Amount;
        for (int i=0;i<10;i++) {
            if (atmArray[i].getAccountNo().equalsIgnoreCase(accountNo)) {
                isFound = true;
                System.out.println(" Please enter the amount you want to withdraw: ");
                withdrawing_Amount = Integer.parseInt(br.readLine());
                if (atmArray[i].getBalance() >= withdrawing_Amount)
                    atmArray[i].setBalance(atmArray[i].getBalance() - withdrawing_Amount);
                else
                    System.out.println(" Sorry!!,insufficient balance in Account. Unable to withdraw ");
                break;
            }
        }
        if(!isFound)
            System.out.println(" Invalid Account No ");
    }
    
    public void deposit(String accountNo) throws Exception{
        boolean isFound=false;
        int deposit_Amount;
        for (int i=0;i<10;i++) {
            if (atmArray[i].getAccountNo().equalsIgnoreCase(accountNo)) {
                isFound = true;
                System.out.println(" Please enter the amount you want to deposit: ");
                deposit_Amount = Integer.parseInt(br.readLine());
                if (deposit_Amount < 0)
                    System.out.println(" Sorry! You cannnot add a negative amount to deposit ");
                else
                    atmArray[i].setBalance(atmArray[i].getBalance() + deposit_Amount);
                break;
            }
        }
        if(!isFound)
            System.out.println(" Invalid Account No ");
    }
    
    public void transfer(String accountNoFrom, String accountNoTo) throws Exception{
        int fPosition=-1, tPosition=-1;
        int transferAmount;
        for (int i=0;i<10;i++){
            if (atmArray[i].getAccountNo().equalsIgnoreCase(accountNoFrom)) {
                fPosition = i;
                break;
            }
        }
        for (int i=0;i<10;i++){
            if (atmArray[i].getAccountNo().equalsIgnoreCase(accountNoTo)) {
                tPosition = i;
                break;
            }
        }
        
        if (fPosition !=-1 && tPosition !=-1){
            System.out.println("Please enter the amount you want to transfer: ");
            transferAmount = Integer.parseInt(br.readLine());
            if (atmArray[fPosition].getBalance() >= transferAmount) {
                atmArray[fPosition].setBalance(atmArray[fPosition].getBalance() - transferAmount);
                atmArray[tPosition].setBalance(atmArray[tPosition].getBalance() + transferAmount);
            }else
                System.out.println(" Sorry!! insufficient balance to transfer ");
        }
    }
    
    public static void main(String[] args) throws Exception{
        
        Account a1 = new Account("1551285192", 600);
        Account a2 = new Account("4728419315", 10000);
        Account a3 = new Account("83193195951", 15345);
        Account a4 = new Account("01924051512", 1200000000);
        Account a5 = new Account("14056883212", 1500);
        Account a6 = new Account("31959590512", 120);
        Account a7 = new Account("51591293915", 40000);
        Account a8 = new Account("82194915121", 17245);
        Account a9 = new Account("59293151235", 16524);
        Account a10 =new Account("31995953232", 824);
        atmArray[0] = a1;
        atmArray[1] = a2;
        atmArray[2] = a3;
        atmArray[3] = a4;
        atmArray[4] = a5;
        atmArray[5] = a6;
        atmArray[6] = a7;
        atmArray[7] = a8;
        atmArray[8] = a9;
        atmArray[9] = a10;
        

        bw = new BufferedWriter(new FileWriter("D:\\JavaWork\\Labs\\Lab14\\AccountsFile.txt", false));
        bw.write("The Intial amount before transaction: \n");
        bw.write(a1.toString());
        bw.write(a2.toString());
        bw.write(a3.toString());
        bw.write(a4.toString());
        bw.write(a5.toString());
        bw.write(a6.toString());
        bw.write(a7.toString());
        bw.write(a8.toString());
        bw.write(a9.toString());
        bw.write(a10.toString());
    
        AccountRunner r1 = new AccountRunner();
        r1.Inquiry("4728419315");
        r1.deposit("4728419315");
        r1.withdraw("4728419315");
        r1.transfer("4728419315","14056883212");
        r1.deposit("01924051512");
        r1.deposit("59293151235");
        r1.withdraw("82194915121");
        r1.deposit("14056883212");
        r1.deposit("82194915121");
        r1.deposit("83193195951");
        r1.withdraw("01924051512");
        r1.deposit("1551285192");
        r1.transfer("01924051512","14056883212");
        r1.deposit("31995953232");
        r1.transfer("51591293915","31959590512");
        r1.Inquiry("01924051512");
        
        bw.write(" Final Amount after transaction: \n");
        bw.write(a1.toString());
        bw.write(a2.toString());
        bw.write(a3.toString());
        bw.write(a4.toString());
        bw.write(a5.toString());
        bw.write(a6.toString());
        bw.write(a7.toString());
        bw.write(a8.toString());
        bw.write(a9.toString());
        bw.write(a10.toString());
        bw.close();
    }
}
    

