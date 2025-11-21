//Hospital MAnagment System
class Hospital{
    String name;
    int age;

    Hospital(String name,int age){
        this.name=name;
        this.age=age;
    }

    void showDetails(){
        System.out.println("Name :"+name);
        System.out.println("Age:"+age);
    }
}

class Doctor extends Hospital{
    String specialization;
    int exp;

    Doctor(String name,int age,String specialization,int exp){
        super(name,age);
        this.specialization=specialization;
        this.exp=exp;
    }

    void showDetails(){
        System.out.println("Doctor's Name:"+name +" Specialization :"+specialization+" Experience :"+exp); 
       }
}

class Patient extends Hospital{
    String disease;
    String id;
    Patient(String name,int age,String id,String disease){
        super(name,age);
        this.id=id;
        this.disease=disease;
    }

    void showDetails(){
        super.showDetails();
        System.out.println("Pateint Id :" + id);
        System.out.println("Disease :" + disease);
    }
}

class Inpatient extends Patient{
    int roomno;

    Inpatient(String name,int age,String id,String disease,int roomno){
        super(name, age, id, disease);
        this.roomno=roomno;
    }

    void showRoom(){
        System.out.println("Room No :"+roomno);
    }
} 

//interface1-multiple inheritance
interface RoomBill{
    double calculateRB(int days);
}
//interface2-multiple inheritance
interface PharmacyBill{
    double calculatePB(double... price); //double[] price->this allows to pass n number of double values
}

class InpatientBill extends Inpatient implements RoomBill,PharmacyBill{
        InpatientBill(String name,int age,String id,String disease,int roomno){
        super(name, age, id, disease, roomno);
    }

    public double calculateRB(int days){
        return days*3500;
    }

    public double calculatePB(double... price){
        double sum=0;
        for(double p:price){ //for each p in the array price(for-each loop)
            sum+=p;
        }
        return sum;
    }

    void totalBill(int days,double... price){
        double roombill=calculateRB(days);
        double pharbill=calculatePB(price);
        double total=roombill+pharbill;

        System.out.println("Room Bill :"+roombill);
        System.out.println("Pharmacy Bill :"+pharbill);
        System.out.println("Total Bill Amount :"+total);
    }
}

public class HybridHospMang {
    public static void main(String[]args){
        System.out.println("Doctor's Details");
        System.out.println("--------------------------------------------------------------------");
        Doctor D=new Doctor("Nithya",40,"MD(Gen)",15);
        D.showDetails();
        InpatientBill IP=new InpatientBill("Kathir",50,"H5423I","Fever",321);
        System.out.println("Patient Details ");
        System.out.println("--------------------------------------------------------------------");
        IP.showDetails();
        IP.showRoom();
        System.out.println("Billing Details ");
        System.out.println("--------------------------------------------------------------------");
        IP.totalBill(6,150,250,356,891.5,78,65,123);
    }
}
