class Shapes{
    void display(){
        System.out.println("This is a Shape");
    }
}
class Circle extends Shapes{
    void area(double radius){
        System.out.println("Area of Circle :" + (3.14 * radius *radius));
    }
}
class Square extends Shapes{
    void area(int side){
        System.out.println("Area of Square:" + (side * side));
    }
}
class Rectangle extends Shapes{
    void area(int length,int breath){
        System.out.println("Area of Rectangle :" + (length * breath));
    }
}
public class hierarchiShapes {
    public static void main(String[] args) {
        Circle C=new Circle();
        Rectangle R=new Rectangle();
        Square S=new Square();
        C.display();
        C.area(20);
        S.area(12);
        R.area(45,25);

    }   
}
