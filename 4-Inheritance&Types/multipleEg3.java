//Scenario:BAnk Account must Calculate interest and Log Transactions.

interface InterestCalc{
    double calculateInterest(double amount);
}

interface Transactionlogger{
    void logTransaction(String message);
}

class BankAcc implements InterestCalc,Transactionlogger{
    private double balance; //PRIVATE allows only code inside this class can access balance directly

    BankAcc(double balance){
        this.balance=balance;
    }

    public double calculateInterest(double amount){
        return amount*(8.5/100);
    }

    public void logTransaction(String message){
        System.out.println( message);
    }

    public void deposit(double amount){
        if(amount>0){
        balance+=amount;
        logTransaction("Amount Deposited:"+amount);
        }
    }

    public void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
            logTransaction("Withdrawn :" +amount);
        }else{
            System.out.println("Insufficient Balance");
        }
    }

    void addInterest(){
        double interest=calculateInterest(balance);
        balance+=interest;
        logTransaction("Interest Added:"+interest);
    }

    public double getBalance(){ //public method to return current balance
        return balance;
    }
}
public class multipleEg3 {
    public static void main(String[]args){
        BankAcc BA=new BankAcc(10000);
        System.out.println("----------------------------------------------------");
        BA.deposit(18000);
        BA.addInterest();
        System.out.println("Available BAlance in your Account:"+BA.getBalance());
        System.out.println("----------------------------------------------------");
        BA.withdraw(5000);
        BA.addInterest();
        System.out.println("Available BAlance in your Account:"+BA.getBalance());
        System.out.println("----------------------------------------------------");
    }
  }
