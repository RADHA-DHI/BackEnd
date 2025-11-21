class bankAccount{
    String accNo;
    String accHolder;
    double balance;

    bankAccount(String accNo, String accHolder, double balance) {
        this.accNo = accNo;
        this.accHolder = accHolder;
        this.balance = balance;
    }

    void deposit(double amount){
        balance+=amount;
    }

    void displayBalance(){
        System.out.println("Account Holder :" + accHolder);
        System.out.println("Account Number :"+ accNo);
        System.out.println("Available Balance :"+ balance);
    }
}

class SavingsAcc extends bankAccount{
    double interestRate;

    SavingsAcc(String accNo,String accHolder,double balance,double interestRate ){
        super(accNo,accHolder,balance); //super calls the parent class constructor(ie.,bankacc)
        this.interestRate=interestRate;
    }

    void savingsInterest(){
        double interest=balance*(interestRate/100);
        balance+=interest;
        System.out.println( "Interest Received :" +interest);
    }
}

class seniorCitizen extends SavingsAcc{
    double bonusRate;

    seniorCitizen(String accNo, String accHolder, double balance, double interestRate, double bonusRate) {
        super(accNo, accHolder, balance, interestRate);  //calls SavingsAcc constructor
        this.bonusRate = bonusRate;
    }

    void addbonusRate(){
        double bonus=balance*(bonusRate/100);
        balance+=bonus;
    }
}

public class multilevelBankSys{
    public static void main(String[] args) {
        seniorCitizen sacc=new seniorCitizen("SB12345678","Radha",60000,8.5,9.3);
        sacc.deposit(15000);
        sacc.displayBalance();
        sacc.savingsInterest();
        sacc.addbonusRate();
    }
}
