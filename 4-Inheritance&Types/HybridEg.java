//Hybrid Inheritance-A Combination of more than one type of inheritance 

interface A{
    void methodA();
}

interface B extends A{  //multilevel inheritance via interface)
    void methodB();
}

interface C{
    void methodC();
}

class D implements B,C{ //D implements 2interfaces->multiple inheritance
    public void methodA(){
        System.out.println("Method from interface A");
    }

    public void methodB(){
        System.out.println("Method from interface B");
    }

    public void methodC(){
        System.out.println("Method from interface C");
    }
}

public class HybridEg {
    public static void main(String[] args){
        D obj=new D();
        obj.methodA();
        obj.methodB();
        obj.methodC();
    } 
}
