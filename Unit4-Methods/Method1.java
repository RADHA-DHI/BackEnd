import java.util.Scanner;

public class Method1 {

   static void checkAge(int age){
    if(age>18){
        System.out.println("Eligible to Vote");
    }else{
        System.out.println("Not Eligible to Vote");
    }
   } 

   public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter Your Age : ");
    int a =sc.nextInt();
    checkAge(a);
    
   }
    
}
