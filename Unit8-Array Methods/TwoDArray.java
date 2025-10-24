    //...2D Array...//

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {

        //----Basic Declaration and Display----//
        //arr[1][2]=> indicates 1 row,2 col Array
        int [][] numbers={{1,2,3},{4,5,6}};
        System.out.println("length of 2D Array(no.of Rows):"+numbers.length);  //number of rows

        System.out.println("No.of column in 1st Row:"+numbers[0].length);
        
        for(int row=0;row<numbers.length;row++){
            for(int col=0;col<numbers[row].length;col++){
                System.out.print("number["+row+"]["+col+"]="+numbers[row][col]+" ");              
            }
            System.out.println();
       }
    
       //-----Sum of All elements in 2D Array----//
       int [][]arraySum={{6,8,10},{18,5,9}};
       int sum=0;
       for(int i=0;i<arraySum.length;i++){
        for(int j=0;j<arraySum[i].length;j++){
            sum+=arraySum[i][j];
        }
       }
       System.out.println("Sum of all Elements:"+ sum);

       
       //---Finding Largest element in 2D Array----//
       int [][]largeArray={{8,10,15},{12,6,9}};
       int largest=0;
       for(int i=0;i<largeArray.length;i++){
        for(int j=0;j<largeArray[i].length;j++){
            if(largeArray[i][j]>largest){
                largest=largeArray[i][j];
            }
        }
       }
       System.out.println("Largest Element:"+largest);


       //----Transpose of a MAtrix----//
       int [][]TransArray ={{4,5,6},{8,4,3}};
       System.out.println("Orginal Matrix :");
       for(int i=0;i<TransArray.length;i++){
        for(int j=0;j<TransArray[i].length;j++){
            System.out.print(TransArray[i][j] + "  ");
        }
        System.out.println();
       }
       System.out.println("\nTranpose Matrix");
       for(int j=0;j<TransArray[0].length;j++){
        for(int i=0;i<TransArray.length;i++){
            System.out.print(TransArray[i][j] + "  ");
        }
        System.out.println();
       }
     
       
       //---Sum of 2 Array---//
       Scanner sc=new Scanner(System.in);

       int rows,cols;
       System.out.println("Enter No.of.Rows:");
       rows=sc.nextInt();
       System.out.println("Enter No.of Column:");
       cols=sc.nextInt();

       int [][] a=new int[rows][cols];
       int [][] b=new int[rows][cols];
       int [][] sum1=new int[rows][cols];

       System.out.println("Enter 1st Matrix Elements:");
       for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            a[i][j]=sc.nextInt();
        }
       }

       System.out.println("Enter 2nd Matrix Elements:");
       for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            b[i][j]=sc.nextInt();
        }
       }
                //To Calculate
       System.out.println("Sum of Two Matrix:");
       for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            sum1[i][j]=a[i][j]+b[i][j];
        }
       }
                //To display sum
       for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            System.out.print(sum1[i][j]+ " ");
        }
        System.out.println();
       }




    
    }
}
