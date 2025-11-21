class ConsOL {

    String name;
    int marks;
    String std;

    ConsOL(){
        name="unknown";
        marks=450;
        std="NA";
    }

    ConsOL(String a){
        name=a;
        marks=490;
        std="Class 10";
    }

    ConsOL(String n,int a,String c){
        name=n;
        marks=a;
        std=c;
    }

    void display(){
        System.out.println("Name : " + name + " Mark: " + marks + " Class : " + std);
    }

    public static void main(String[] args) {
        ConsOL col =new ConsOL();
        ConsOL col1=new ConsOL("Radhi");
        ConsOL col2=new ConsOL("Gokul",480,"Class 12");

        col.display();
        col1.display();
        col2.display();
    }
    
}
