class Grandparent{
    void show(){
        System.out.println("I am a GrandParent");
    }
}

class Parent extends Grandparent{
    void show1(){
        System.out.println("I am a Parent");
    }
}

class child extends Parent{
    void show2(){
        System.out.println("I am a Child");
    }
}
public class multilevelEg {
    public static void main(String []args){
        child ml=new child();
        ml.show2();
        ml.show1();
        ml.show();
        Parent p=new Parent();
        p.show1();
        p.show();
        // p.show2(); these variables cant be accessed since it's a parent
        Grandparent gp=new Grandparent();
        // gp.show2(); these variables cant be accessed since it's a parent
        // gp.show1(); these variables cant be accessed since it's a parent
    }
}
