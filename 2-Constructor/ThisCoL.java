//Calling one constructor from Another
//using this keyword
//this -> refers to the current object of a class - Used to call another constructor of the same class - helps to reuse code &avoids duplication inside multiple constructor
//->must be first statment ina constructor

class ThisCoL {
    String name;
    int age;
    String course;

    //constructor1
    ThisCoL() {
        this("Unknown" ,0 , "Not Assigned"); //calling another constructor
        System.out.println("Default constructor CAlled");
    }
    //construcor 2
    ThisCoL(String n,int a,String c){
        name=n;
        age=a;
        course=c;
        System.out.println("Parameterized Constructor");
    }
    void display(){
        System.out.println(name+ " " + age + " "+course);
    }

    public static void main(String[] args) {
        ThisCoL cons=new ThisCoL(); //calls default then parameterized
        cons.display();

        ThisCoL cons1=new ThisCoL("sita",20,"FSD");
        cons1.display();
    }
    
}
