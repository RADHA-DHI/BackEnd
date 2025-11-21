//Scenario: School Management System
//Question:A base class Person has attributes name, age.
//Subclasses Student and Teacher extend it.
//How can you prevent any further subclassing of Teacher?

class Person{
    String name;
    int age;

    Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    void display(){
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
    }
}

class Student extends Person{
    String role;
    String std;

    Student(String name,int age,String role,String std){
        super(name, age);
        this.role=role;
        this.std=std;
    }
    void display(){
        super.display();
        System.out.println("Category :"+role);
        System.out.println("Grade :"+std);
    }
}

final class Teacher extends Person{ //final prevents further subclassing
    String role;
    String sub;

    Teacher(String name,int age,String role,String sub){
        super(name, age);
        this.role=role;
        this.sub=sub;
    }

    void display(){
        super.display();
        System.out.println("Role :"+role);
        System.out.println("Subject:"+sub);
    }
}

// class Head extends Teacher{ //This operation cant be done,cant inherit from final Teacher
//     String desig;
//     String dept;

//     Head(String name,int age,String desig,String dept){
//         super(name,age);
//         this.desig=desig;
//         this.dept=dept;
//     }
//     void display(){
//         super.display();
//     }
// }


public class hierSchoolMang {
    public static void main(String[] args) {
        Student S=new Student("Kumar",15,"Student","Grade 10");
        Teacher T=new Teacher("Diya",35,"Teacher","Chemistry");
        System.out.println("Student DataSheet:");
        S.display();
        System.out.println("Teacher's DataSheet :");
        T.display();
        }      
}
