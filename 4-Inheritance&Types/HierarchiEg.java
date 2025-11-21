class parent{
    void display(){
        System.out.println("Parent Class Method");
    }
}

class child1 extends parent{
    void display1(){
        System.out.println("Child 1 Class Method");
    }
}

class child2 extends parent{
    void display2(){
        System.out.println("Child 2 class Method");
    }
}

public class HierarchiEg {
    public static void main(String[] args) {
        child1 c1=new child1();
        c1.display();
        c1.display1();
        // c1.display2(); //cant inherit child to child since its hierarchi

        child2 c2=new child2();
        c2.display();
        c2.display2();
        // c2.display1();//cant inherit child to child since its hierarchi

    }
    
}
