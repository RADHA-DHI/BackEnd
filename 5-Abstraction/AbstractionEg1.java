interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("Drawing a square");
    }
}

public class AbstractionEg1 {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
        Shape sq= new Square();  
        sq.draw();
    }
} 
