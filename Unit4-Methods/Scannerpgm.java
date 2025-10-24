import java.util.Scanner;

class Scannerpgm{
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in); //creating scanner Object

    //1.Read and Display a Name

        System.out.print("Enter Your Name :");
        String name=sc.nextLine(); //Reads Full Line (till Enter)
        System.out.println("Hello " + name + " !!!");

    //2.Read an Integer Check larger num 

        System.out.print("Enter Two Numbers : ");
        int a =sc.nextInt(); //Reads an Integer
        int b =sc.nextInt();
        System.out.println("Larger Number is " + (a>b ? a : b ));
   
    //3.Check even or Odd

        System.out.print("Enter a number : ");
        int num= sc.nextInt();
        System.out.println(num % 2 == 0 ? "This is Even number":"This is Odd Number");
   
   
    }
}
