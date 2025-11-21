//----------Employee Pay Roll System-----------//

class Employee{
    String name;
    String empId;
    double basicPay;

    Employee(String name,String empId,double basicPay){
        this.name=name;
        this.empId=empId;
        this.basicPay=basicPay;
    }

    void displayDetails(){
        System.out.println("Employee NAme:"+name);
        System.out.println("Id :" + empId);
    }
}

class Fulltime extends Employee{
    double monthPay;
    double incentive;
    
    Fulltime(String name,String empId,double basicPay,double monthPay,double incentive){
        super(name, empId, basicPay);
        this.monthPay=monthPay;
        this.incentive=incentive;
    }

    double calculateSalary(){
        double Salary=basicPay+monthPay+incentive;
        return Salary;
    }
}

class Parttime extends Employee{
    int hour;
    double hpay;    
    Parttime(String name,String empId,double basicPay,int hour,double hpay){
        super(name, empId, basicPay);
        this.hour=hour;
        this.hpay=hpay;
    }
    double calculateSalary(){
        double Salary=basicPay+(hour*hpay);
        return Salary;
    }
}
public class hierEmployee {
    public static void main(String[]args){
        Fulltime FT=new Fulltime("Radha","F345126",20000,25000,15000);
        Parttime PT=new Parttime("Kavitha","P637241",10000, 250, 150);
        System.out.println("Fulltime Employee");
        System.out.println("------------------");
        FT.displayDetails();
        System.out.println("Salary: " +FT.calculateSalary());
        System.out.println("PartTime Employee");
        System.out.println("------------------");
        PT.displayDetails();
        System.out.println("Salary :" +PT.calculateSalary()); 
    }      
}
