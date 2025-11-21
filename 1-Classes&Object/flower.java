public class flower {
    String Fname="Rose";
    String FColor="Red";
    static String place="Ooty"; //static attribute can be shared by all
    static int price=200;
    final int id=1001;


    static void myMethod(){
    System.out.println("It's Blooming");
    }

    public static void main(String[] args) {
        
        flower fc=new flower();
        myMethod(); //accessing a method
        System.out.println(fc.Fname);
        System.out.println(fc.FColor);

        //static attributes can be accessed directly w/o object
        System.out.println(place);
        


    }
}
