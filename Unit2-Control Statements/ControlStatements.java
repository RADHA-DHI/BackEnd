//if
//if..else
//nested if..else
//Ladder if..javaelse



class ControlStatements{
    public static void main(String args[]){
        int mark=50;
        //if loop
        if (mark>=35){
            System.out.println("Pass");
        }

        int numchk=98;
        if(numchk%2==0){
            System.out.println("Number is Even Number");
        }

        //if...else//
        int mark1=20;
        if(mark1<=35){
            System.err.println("Fail");
        }
        else{
            System.out.println("Pass");
        }

        
        int num = 20;
        if (num % 5 == 0) {
            System.out.println(num + " is Divisible by 5");
        } else {
            System.out.println(num + " is Not Divisible by 5");
        }
    


        //Finding bigger Value
        int a=80;
        int b=40;
        if(a>b){
            System.out.println("A is Bigger Value");
        }
        else{
            System.out.println("B is Bigger Value");
        }


        //Voter Eligibility check
        int age=11;
        if(age>=18){
            System.out.println("Eligible to Vote");
        }
        else{
            System.out.println("Not Eligible to Vote");
        }

        //Vote Eligibility Checker
        int year=2048;
        if(year%4==0){
            System.out.println(year+" is Leap Year");
        }
        else{
            System.out.println(year+" is Not Leap Year");
        }

        //Finding Odd or Even
        int num1=53;
        if(num1%2==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }

        
        
                     //Nested if..else..//
        //Finding Biggest number 
        int a2=100;
        int b2=300;
        int c2=80;
        if(a2>b2){
            if(a2>c2){
                System.out.println("Ais Bigger");
            }
            else{
                System.out.println("C is Bigger");
            }
        }
        else{
            if(b2>c2){
                System.out.println("B is Bigger");
            }
            else{
                System.out.println("C is Bigger");
            }
        }

        //Grading System
        int mark2=30;
        if(mark2>=50){
            if(mark2>=75){
                System.out.println("Distinction");
            }else{
                System.out.println("Pass");
            }
            }
            else{
                System.out.println("Fail");
            }
        
        //..Account Withdrawal Status..//
        int balance=15000;
        int withdraw=4000;
        if(withdraw<=balance){
            if(withdraw%100==0){
                System.out.println( "Withdrawal of Rs."+ withdraw+" Successful");
            }
            else{
                System.out.println("Enter Amount in multiples of 100");
            }
        }else {
            System.out.println("Insufficient Balance");
        }



                     //....Ladder if Else...//
        //Finding Positive or Negative number//
        int num2 = -18;
        if (num2 == 0) {
            System.out.println("Zero");
        } else if (num1 > 0) {
            System.out.println("+VE Number");
        } else {
            System.out.println("-VE Number");
        }


        //Finding biggest VAlue
        int a1 = 58;
        int b1 = 65;
        int c1 = 87;
        if (a1 > b1 && a1 > c1) {
            System.out.println("A is Biggest Value");
        } else if (b1 > a1 && b1 > c1) {
            System.out.println("B is Biggest value");
        } else if (c1 > a1 && c1 > b1) {
            System.out.println("C is Biggest Value");
        }
        else{
            System.out.println("A = B = C Same Value");
        }

        //..Finding DAy of a Week..//
        int day = 5;
        if(day == 1) {
            System.out.println("Monday");
        } else if(day == 2) {
            System.out.println("Tuesday");
        } else if(day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid Day");
        }

        int age1=30;
        if(age1<=13){
            System.out.println("Child");
        }else if(age1<=18){
            System.out.println("Teenager");
        }else if(age<=60){
            System.out.println("Adult");
        }else{
            System.out.println("SeniorCitizen");
        }

        //BMI Calculator
        
        double bmi = 27.5;
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal Weight");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }


        //......Switch Case......//
        int num3 = 50;
        int num4 = 100;
 
        String answer = "*";
        switch (answer) {
            case "+": {
                int result = num3+num4;
                System.out.println(result);
                break;
            }
            case "-": {
                int result = num3 - num4;
                System.out.println(result);
                break;
            }
            case "*": {
                int result = num3 * num4;
                System.out.println(result);
                break;
            }
            default: {
                System.out.println("Please Check Value");
                break;
            }
        }






    }
}