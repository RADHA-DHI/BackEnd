//Basic Inheritance Example
//Single inheritance
class Animal{
    void eat(){
        System.out.println("Animal can eat");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog can bark");
    }
}

public class SingleEg1{
    public static void main(String[] args) {
        Dog D =new Dog();
        D.eat();
        D.bark();
    }
}