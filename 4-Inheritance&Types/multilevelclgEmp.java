//College Employee details
class Employee{
    String ClgName="ABC College";
    String empId;
    String empName;
    String doj;

    Employee(String empName,String empId,String doj){
        this.empName=empName;
        this.empId=empId;
        this.doj=doj;
    }

    void displayEmpInfo(){
        System.out.println("College Name :" + ClgName);
        System.out.println("Employee Id:" +empId);
        System.out.println("Employee Name :" +empName);
        System.out.println("Employee Date of Joining :" +doj);

    }
}

class department extends Employee{
    String dept;
    double Salary;
    String position;

    department(String empName,String empId,String doj,String dept,String position,double Salary){
        super(empName, empId, doj);
        this.dept=dept;
        this.position=position;
        this.Salary=Salary;
    }

    void deptdetails(){
        System.out.println("Department :" + dept + "," + "Position : " + position + "," + "Salary :" + Salary);
    }
}

class profProfile extends department{
    String Edu;
    String Speci;
    int publication;
    int exp;
    profProfile(String empName,String empId,String doj,String dept,String position,double Salary,String Edu,String Speci,int publication,int exp){
        super(empName, empId, doj, dept, position, Salary);
        this.Edu=Edu;
        this.Speci=Speci;
        this.publication=publication;
        this.exp=exp;
    }

    void professional(){
        System.out.println("Qualification :" + Edu + "," + "Specilization :" + Speci +","+ " PaperPublications :" + publication +","+ "Experience :" + exp+"yrs");
    }    
}

public class multilevelclgEmp {
    public static void main(String[] args){
    profProfile pf= new profProfile("Radha","98765","16.9.2019","EEE","Professor",65000,"M.E","Applied Electronics",3 ,5);
    pf.displayEmpInfo();
    pf.deptdetails();
    pf.professional();    
    }
}

