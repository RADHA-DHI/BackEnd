public class Methods {
//Simple example for Method
   static void display(){
    System.out.println("Welcome");
   } 

//1.Without Arguments/Parameters ,Without Return type
   static void add(){
    int a=100;
    int b=30;
    System.out.println(a+b);
   }

   static void sub(){
    int a=100;
    int b=30;
    System.out.println(a-b);
   }

   static void mult(){
    int a=100;
    int b=30;
    System.out.println(a*b);
   }

//2.With Argument/Parameter,Without Return type
   static void add(int a,int b,int c,int d,int e){
    System.out.println(a+b+c+d+e);
    System.out.println((a+b+c+d+e)/5);
   }

//3.Without Argument/Parameter,With Return type
   static int div(){
    int a=500;
    int b=250;
    return a-b;
   }

//4.With Argument/Parameter,with Return type
   static int sum(int i,int j,int k,int m,int n){
    return i+j+k+m+n;
   }

   public static void main(String[] args) {
       display();
       add();
       sub();
       mult();
       add(10,20,30,40,50);
       System.out.println(div());  //inorder to print the return value(type-3)
       System.out.println(sum(40,50,60,10,20));  //Type-4
   
    }
}
