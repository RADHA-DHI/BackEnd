//Single inheritance
import java.util.Scanner;

class BankAccount{
    double balance=1000;
    void deposit(double amount){
        balance+=amount;
    }
}

class SavingsAcc extends BankAccount{
    void displayBalance(){
        System.out.println("Current Balance :" + balance);
    }
}

public class SingleEg3 {
    public static void main(String[] args) {
        SavingsAcc SA= new SavingsAcc();
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter Deposit Amount:");
        int amount =sc.nextInt();  //Reads Full Line (till Enter)
        
        SA.deposit(amount);
        SA.displayBalance();
    }
}
