//Abstraction-Hiding internal implementation and showing only necessary details.
//Reduces complexity-increases security-Avoids unwanted access of internal logic-makes code clean and maintainable
//Abstract class-(0-100% abstraction)
//Interface-100% abstraction in java 8 and earlier
abstract class Animal{
    abstract void sound();//abstract method
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("Cat Meow");
    }
}

public class AbstractionEg{
    public static void main(String[] args) {
        Animal A=new Dog();//A is the ref.variable of abstract parent class Animal-new Dog() creates object of child class
        A.sound();        
        Animal B=new Cat();
        B.sound();
    }
}
