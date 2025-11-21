public class StaticPublicMethod {
        
        //static method belongs to that class,not to any object
        //it be called without creating an object
    static void myStaticMethod(){
        System.out.println("This is a Static Method");
    }

    static void add(int a,int b){
        System.out.println("Sum : " + (a+b));
    }

        //public method accessible from anywhere
        //can be called using an object of the class
    public void myPublicMethod(){
        System.out.println("This is a Public Method");
    }

    public void multiply(int c,int d){
        System.out.println("Product : " + (c*d));
    }

    public static void main(String[] args) {
        myStaticMethod();
        add(4,10);

        StaticPublicMethod pub=new StaticPublicMethod();
        pub.myPublicMethod();
        pub.multiply(10, 20);
        
    }
}   
    

