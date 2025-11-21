//Method overloading Example for single inheritance
//Method overloading->Same methos name,Different Parameter list(number or type)

class Employee{
    void show(String name){ //method with 1parameter
        System.out.println("Employee Name : " + name);
    }
}

class Manager extends Employee{
    //Overloaded Method->Same method name but diff parameters(2P)
    void show(String name,double salary){
        System.out.println("Manager NAme :" + name + "  Salary : " + salary);
    }
}

public class OverloadEg {
    public static void main(String[] args){
        Manager M=new Manager();
        M.show("Radha"); 
        M.show("Radha",60000);
    }
    
}
