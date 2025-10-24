//Method Overloading- Multiple methods can have the same name with different parametes(diff in number type or order of parmeters)

public class Methodoverloading {

    static int add(int a,int b){
        return a+b;
    }

    static double add(double a,double b){
        return a+b;
    }

    static String add(String a,String b){
        return a+b;
    }

    public static void main(String[]args){
        int num1=add(10,10);
        double num2=add(20,30);
        String num3=add("10","10");

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }    
}
