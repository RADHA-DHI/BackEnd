//Array are used to store multiple values in a single variable, instead of declaring separate variables for each value.
class ArrayBasics{
    public static void main(String[] args){
        //....declaring and initializing an array...//
        int arr[]={10,20,30,40,50};
        //printing array }
        for(int i=0;i<arr.length;i++){
            System.out.println("Element at index"+i+":"+arr[i]);
        }

       //...Finding length of an array...//
        String topics[]={"HTML","CSS","JS","BS","ReactJS","Redux","Java","SpringBoot"};
        System.out.println("Length of this array:"+ topics.length);
        //Changing an array element
        topics[0]="XML&HTML";
        System.out.println("After changing the element:"+topics[0]);

        //....new keyword....//
        String topics1[]=new String[4]; //declaring and creating an array of type string length 4
        topics1[0]="HTML,CSS,BS";
        topics1[1]="JS,ReactJS,Redux";
        topics1[2]="Java";
        topics1[3]="SpringBoot";
        System.out.println(topics1[0]);
        System.out.println(topics1[3]);
        
        //...Display Array using for-loop...//
        String topics2[]={"HTML","CSS","JS","BS","ReactJS","Redux","Java","SpringBoot"};
        for(int i=1;i<topics2.length;i++){
            System.out.println("Element at index"+i+":"+topics2[i]);
         
        }

        
            //...Display Array using for-each loop...//
                // for(datatype variable:arrayName){ 
                //     //use variable to access array elements
                // }          
        int[] arr1 = {10, 20, 30, 40, 50};
        System.out.println("Using for-each loop:");
        for (int num : arr1) {   //num is temporary variable that holds each element of the array
            System.out.println(num);
        }

            //...CAlculate sum of Elements...//
        int marks[]={50,60,70,80,90};
        int sum=0;
        float Avg;
        for(int i=0;i<marks.length;i++){
            sum+=marks[i];
        
        }
        System.out.println("Sum =" +sum);
        Avg=sum/marks.length;
        System.out.println("Average= "+ Avg);
        

            //...2D Array...//
            //...Basic Declaration and Display...//
        int [][] numbers={{1,2,3},{4,5,6}};
        System.out.println("length of 2D Array(no.of Rows):"+numbers.length); //number of rows
        System.out.println("No.of column in 1st Row:"+numbers[0].length);
        
        for(int row=0;row<numbers.length;row++){
            for(int col=0;col<numbers[row].length;col++){
                System.out.print("number["+row+"]["+col+"]="+numbers[row][col]+" ");
            }
            System.out.println();
        }



    }  
}