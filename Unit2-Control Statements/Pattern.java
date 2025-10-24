public class Pattern {
    public static void main(String[] args){

        //....printing  ***** this pattern.....
        
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print("*"); //This Prints in a Same Line
                }
                System.out.println("");
            }
        
        //.... 11111 22222 33333 44444 55555....
        System.out.println("");
        for(int n=1;n<=5;n++){
            for(int m=1;m<=5;m++){
                System.out.print(n);
            }
            System.out.println("");
        }

        //....12345 12345 12345 12345 12345.....//
        System.out.println("");
        for(int n=1;n<=5;n++){
            for(int m=1;m<=5;m++){
                System.out.print(m);
            }
            System.out.println("");
        }


        //....55555    44444   33333   22222   1111...//
        System.out.println("");
        for(int k=5;k>=1;k--){
            for(int l=1;l<=5;l++){
                System.out.print(k);
            }
        System.out.println("");       
        }

        //*..........TASK........... */

        //--- AAAAA BBBBB  CCCCC DDDDD EEEEE---//
        System.out.println("");
        for(char i1='A';i1<='E';i1++){
            for(char j1='A';j1<='E';j1++){
                System.out.print(i1);
            }
            System.out.println("");
        }

          
        //---1 22 333 4444 55555---//
        System.out.println("");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println("");
        }

        //---1 12 123 1234 12345---//
        System.out.println("");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
     

    //-- * ** *** **** *****---//
        System.out.println("");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        

    //---***** **** *** ** *--//
        System.out.println("");
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print("*");
            }
            System.out.println("");
        }

    //---ABCDE ABCDE ABCDE ABCDE ABCDE---//
        System.out.println("");
        for(char a='A';a<='E';a++){
            for(char b='A';b<='E';b++){
                System.out.print(b);
            }
            System.out.println("");
        }

    //-- EDCBA  EDCBA   EDCBA   EDCBA   EDCBA---//
        
        System.out.println("");
        for(char s='A';s<='E';s++){
            for(char p='E';p>='A';p--){
                System.out.print(p);
            }
            System.out.println("");
        }

    //.... ABCDE FGHIJ KLMNO PQRST UVWXY    Z...//
        System.out.println("");
        for(char a='A';a<='Z';a++){
            for(char b=a;b<=a+4;b++){
                System.out.print(b+" ");
            }
            a+=4;
            System.out.println("");
        }


    //...   13579   1113151719  2123252729  3133353739  4143454749....//

    System.out.println("");
    int number=1;    
    for(int n=1;n<=5;n++){
            for(int n1=1;n1<=5;n1++){
                System.out.print(number + " ");
                number+=2;
            }
            System.out.println("");
        }



}
}
