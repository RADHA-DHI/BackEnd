//Constructor chaining Action

//Bank Acc details 
class ThisconsOL {
    String name;
    int accno;
    String branchplace;

    ThisconsOL(){
        this("unknown",000000000,"NA"); 
    }

    ThisconsOL(String name,int accno){
        this(name,accno,"Tamilnadu"); //default Place
    }

    ThisconsOL(String name,int accno,String branchplace){
        this.name=name;
        this.accno=accno;
        this.branchplace=branchplace;
    }

    void display(){
        System.out.println(name + " "+ accno + " " + branchplace);
    }

public static void main(String[] args){
    ThisconsOL bank=new ThisconsOL();
    ThisconsOL bank1=new ThisconsOL("Ravi",123456789);
    ThisconsOL bank2=new ThisconsOL("mathi",234567123,"Madurai");

    bank.display();
    bank1.display();
    bank2.display();
}
    
}
