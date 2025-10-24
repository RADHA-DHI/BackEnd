public class Moverloadtype {

         //Eg 1:Method overloading by Changing Parameters
    void add(int a,int b){
        System.out.println("Sum of Two numbers : "+ (a+b));
    }

    void add(int a,int b,int c){
        System.out.println("Sum of three numbers : "+(a+b+c));
    }


        //Eg 2:By Changing Data Types
    void multiply(int a,int b){
        System.out.println("Multiplication(int-datatype):" + (a* b));
    }

    void multiply(double a,double b){
        System.out.println("Multiplication(Double-DType):"+ (a*b));
    }

        //Eg 3:By Changing the order of Parameter
    void show(String name,int age){
        System.out.println("Name : "+ name + "Age :"+ age);
    }

    void show(int age, String name){
        System.out.println("Age :"+ age + "NAme  :" + name);
    }

        //Eg 4:Area CAlculation
    void findArea(int side){
        System.out.println("Area of Square :"+ (side*side));
    }

    void findArea(int length,int breath){
        System.out.println("Area of Rectangle :"+ (length * breath));
    }

    void findArea(double radius){
        System.out.println("Area of Circle :" + (3.14 * radius* radius));
    }

    public static void main(String[] args) {

        Moverloadtype obj= new Moverloadtype(); //by creating this object we can call all non-static methods
        
       //.......Eg 1.........//
        obj.add(15, 20);
        obj.add(45,25,60);

        //.......Eg 2........//
        obj.multiply(15,15);
        obj.multiply(30.5,2.5);

        //......Eg 3.........//
        obj.show(16,"Reshmi");
        obj.show("Gokul", 20 );

        //........Eg 4........//
        obj.findArea(10.5);
        obj.findArea(10);
        obj.findArea(8,20);
        
    
    }  
}
