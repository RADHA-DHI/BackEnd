//Multiple inheritance -When a Class tries to inherit from more than one class-Java does not allow this directly
//Java supports multiple inheritance using interfaces

//Interface methods -> Always public & abstract by default
//implements keyword -> used to provide body for interface methods
//Java allows a class to implement multiple interfaces.
interface A{
    void displayA();
}

interface B{
    void displayB();
}

class C implements A,B{
    public void displayA(){
        System.out.println("Hello from A");
    }
    public void displayB(){
        System.out.println("Hello from B");
    }
}
public class MultipleEg {
    public static void main(String[] args) {
        C obj = new C();
        obj.displayA();
        obj.displayB();
    }
    
}
