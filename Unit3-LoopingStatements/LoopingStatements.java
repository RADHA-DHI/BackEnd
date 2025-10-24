public class LoopingStatements {
    
    public static void main(String[] args) {
       
                //.....While Loop....//
        int j=1;
        while(j<=3){
            System.out.println(j);
            System.out.println("Welcome");
            j++;
        }

         //----Reverse a number-----//
        int num1=5326;
        int rev=0;
        while(num1>0){
            rev=rev*10 + num1%10;
            num1/=10;
        }
        System.out.println("Reverse number ="+rev);
    
         //---Counting Digits in a number---//
        int num2=8745697;
        int count=0;
        while(num2>0){
            count++;
            num2/=10;
        }
        System.out.println("No.of.Digits="+ count);

           
          //----Palindrome number----//
        int num3=123321;
        int temp=num3;
        int rev1=0;
        while(num3>0){
            rev1= rev1*10 + (num3%10);
            num3/=10;
        }
        if(rev1==temp){
            System.out.println("Number is Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }

        
            //-------Do..While-------//
        //The do…while loop executes the code at least once and then checks the condition.
        int i=1;
        do{
            System.out.println(i);
            i++;
        }
        while(i<=3);

            
              //-------For Loop--------//
        for(int x=1;x<=5;x++){
        System.out.println(x);
        System.out.println("Radha");
        }

             //...Multiplication Table
        for(int m=1;m<=10;m++){
            System.out.println(m + " *10 =" +m*10); //+ symbol is for concordination

        }

            //...Printing Even& Odd Numbers...//
        for(int e=1;e<=50;e++){
            if(e%2 == 0){
                System.out.println(e + " - Even Number");
            }
            else{
                System.out.println(e+ "- Odd Number");
            }
        }


           //...Skipping a number while Printing set of numbers
        for(int s=1;s<=20;s++){
            if(s==10){                  
                 continue;                  
            }            
            System.out.println(s);
        }  

      
             //------Finding Factorial------//
        int fact=1;
        int fvalue=10;
        for(int x=fvalue;x>=1;x--){
            fact*=x;
        }
        System.out.println("Factorial value of "+ fvalue +"="+ fact);
    }
}
