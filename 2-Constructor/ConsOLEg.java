//constructor overloading
class ConsOLEg{
    int id;
    String name;
    int fees;

    //Default Constructor - initializing the values with multiple variables
    ConsOLEg(){
        id=101;
        name="FSD";
        fees=50000;
    }

    //Parameterized Constructor(2Parameter)
    ConsOLEg(int i,String n){
        id=i;
        name=n;
        fees=30000;
    }

    //Parameterized Constructor(3parameter)
    ConsOLEg(int i,String n,int f){
        id=i;
        name=n;
        fees=f;
    }

    void display(){
        System.out.println("ID :"+ id+ "    Name :"+name + "    Fees :" + fees );

    }

    public static void main(String[] args) {
        ConsOLEg S1=new ConsOLEg(); //Constructor is called automatically(default constructor)
        S1.display();

        ConsOLEg S2=new ConsOLEg(103,"Phyton");//2 PC
        S2.display();

        ConsOLEg S3=new ConsOLEg(102,"DA",35000);//3 PC
        S3.display();
        
    }
}    
