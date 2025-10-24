import java.util.Scanner;

class ArrayPgms {
    public static void main(String[] args){

        // ...Read array elements from user...//
        Scanner sc=new Scanner(System.in);
        int []arr=new int[5];
        System.out.println("Enter 5 integers:");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("You entered:");
        for(int num:arr){
            System.out.print(num + " ");
        }

        //...Finding Sum of user input values...//
        int arr1[]=new int[5];
        int sum=0;
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter values to find sum:");
        for(int i=1;i<arr1.length;i++){
            arr1[i]=sc1.nextInt();
            sum+=arr[i];
        }
        System.out.println("Sum : " + sum );

        //..Finding Largest & Smallest element of user input values..//
        int arr2[]=new int[5];
        int max=0;
        int min=arr2[0];
        Scanner sc2=new Scanner(System.in);
        System.out.println("Enter numbers:");
        for(int i=0;i<arr2.length;i++){
            arr2[i]=sc2.nextInt();
            if(arr2[i]>max){
                max=arr2[i];
            }
            
        }
        System.out.println("Largest Number :" + max);

        
        //...Reverse an array...//
        int []rev={6,3,8,10,30};
        System.out.print("Reversed Array:");
        for(int i=rev.length-1;i>=0;i--){
            System.out.println(rev[i]+"");
        }
        

        //...Finding even or odd number in array..//
        Scanner sc3=new Scanner(System.in);
        int [] num=new int[10];
        int [] even=new int[10];
        int []odd=new int[10];
        int ecount=0,ocount=0;
        System.out.println("Enter numbers to find even or odd:");
        for(int i=0;i<10;i++){
            num[i]=sc3.nextInt();
            if((num[i])%2==0){
                even[ecount]=num[i];
                ecount++;
            }
            else{
                odd[ocount]=num[i];
                ocount++;
            }
        }
        System.out.print("Even Numbers: ");
        for (int i = 0; i < ecount; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println();

        System.out.print("Odd Numbers: ");
        for (int i = 0; i < ocount; i++) {
            System.out.print(odd[i] + " ");
        }


        





          
    }
    
}
