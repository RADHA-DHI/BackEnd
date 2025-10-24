// Syntax:
// ----------------------------------
// try{
//     Code that may cause exception
// }
// catch(ExceptionType e){
//     Code to handle exception
// }
// finally{
//     code that always executes(optional)
// }

import java.util.Scanner;
public class Exception {
        static void  checkAge(int age){
            if(age<18)
                throw new ArithmeticException("Access Denied");
            else
                System.out.println("Access Granted");
            
        }
    public static void main(String[] args) {
               
        //Eg.1:Basic Try-Catch
        try {
            int a=10/0; //This causes Arithmetic Exception
        } catch (ArithmeticException e) {
            System.out.println("Cannot Divide by Zero!");
        }

        //Eg.2:Array Index Out of bound Exception
        try{
            int []arr={1,2,3,4,5};
            System.out.println(arr[12]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error-Invalid Array Index!!");
        }

        //Eg.3:Null Pointer Exception
        try {
            String str=null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Error Null Object cannot be Accessed!!!");
        }
        finally{
            System.out.println("Output Done");
        }

        //Eg.4:Throw an exception
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your Age");
            int a=sc.nextInt();
            checkAge(a);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        //Eg.5:Number Format Exception
        try {
            int num = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number Format");
        }     
    
    }
}
    

