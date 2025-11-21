//Method Overriding Example for inheritance
//Method overriding->Same MEthod name,same Parameters,Child class redefines the method of parent class
//Method Overriding ->Runtime Polymorphism

class Employee{
    double basicpay=40000;

    double CalculateSalary(){
        System.out.println("Basic Salary : " + basicpay );
        return basicpay;
    }
}

class Manager extends Employee{
    double bonus = 15000;

    @Override
    double CalculateSalary(){
        double totalsal=basicpay+bonus;
        System.out.println("Manager's Salary :" + totalsal);
        return totalsal;
    }
}

class Developer extends Employee{
    double incentive=8000;

    @Override
    double CalculateSalary(){
        double totalsal=basicpay+incentive;
        System.out.println("Developer's Salary :" + totalsal);
        return totalsal;
    }
}

public class OverrideEg {
    public static void main(String[]args){
        Employee e1= new Employee();
        Employee e2=new Manager(); //Parent reference child object
        Employee e3=new Developer();

        Manager m2=new Manager();
        Developer d2=new Developer();

        e1.CalculateSalary();
        e2.CalculateSalary();
        e3.CalculateSalary();

        m2.CalculateSalary();
        d2.CalculateSalary();
        
    }    
}
