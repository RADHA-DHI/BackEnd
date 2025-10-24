class MathMethod {
    public static void main(String args[]){
        int a=40;
        int b=20;
        //To find Max or min value
        System.out.println(Math.max(a,b));
        System.out.println(Math.min(a,b));

        //Square root value
        System.out.println(Math.sqrt(b));
        System.out.println(Math.sqrt(89));

        //To find power
        int num1=5;
        int num2=3;
        System.out.println(Math.pow(5,5));
        System.out.println(Math.pow(num1,num2));

        //round,ceil,floor
        System.out.println(Math.round(7.2)); //rounds to the nearest integer
        System.out.println(Math.ceil(6.1));  //rounds up to the smallest integer greater than or equal to a
        System.out.println(Math.floor(6.9));//rounds down to the largest integer less than or equal to a

        //Math.random() -> returns a random number from 0-1;
        System.out.println("Random No(0-1) : "+ (double)(Math.random()));
        System.out.println("2 digit Random No : "+ (int)(Math.random()*101));
        System.out.println("3 Digit Random No : " + (int)(Math.random()*1001));
        System.out.println("Your OTP : " + (int)(Math.random() * 100001));

        //The Math.abs(x)->returns the absolute +ve value of x
        System.out.println("Absolute Value : " + Math.abs(-4.8));
        System.out.println("Absolute Value : " + Math.abs(4.8));
        System.out.println("Absolute Value : " + Math.abs(-5.3));

        //....Task....//
        int num3=125;
        System.out.println("Cube Root of " + num3 + Math.cbrt(num3));
       
        System.out.println("exponent value : "+ Math.exp(1));
        System.out.println("exponent value : "+ Math.exp(0));

        System.out.println("sin 90 :"+Math.sin(90));
        System.out.println("cos 90 :"+Math.cos(90));
        System.out.println("tan 0 :"+ Math.tan(45));

        System.out.println("log value :" + Math.log(1));
        //round of
        System.out.println(Math.round(1.6923));
      

    }

    
}
