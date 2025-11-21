public class sub {
    public static void main(String[] args) {
        //creating object for main.java &accessing that file data members
        Main fr=new Main();
        System.out.println("Fruit Name:" + fr.fruit + " Color :"+fr.color +" Count :" + fr.count);

        //accesing multiple class Methods from different class file
        //accesing the Main & its data variables
        Main fr1=new Main();
        fr1.fruit="Banana";
        fr1.count=100;
        fr1.color="Yellow";
        System.out.println("Fruit Name:" + fr1.fruit + " Color :"+fr1.color +" Count :" + fr1.count);
        
        //accesing the class flower & its method
        flower fc1=new flower();
        fc1.myMethod();

    
    }
    
}
