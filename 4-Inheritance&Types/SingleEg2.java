//Single inheritance
class Employee{
    int salary=50000;
}

class Programmer extends Employee{
    int bonus=20000;
    
}

public class SingleEg2{
    public static void main(String[] args) {
        Programmer pgm= new Programmer();
        System.out.println(pgm.salary + pgm.bonus);
        System.out.println(pgm.bonus);
        
    }
    
}
