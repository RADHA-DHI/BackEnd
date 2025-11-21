public class Student {
    String Name= "Ram";
    int Rollno=123456;
    String Email="ram@gmail.com";

    public static void main(String[] args) {
        Student data=new Student(); //Object creation for the class Student
        System.out.println("Name :"+ data.Name + "  Rollno :"+ data.Rollno + " Email :"+ data.Email);
        
        Student data1=new Student();//Mulitple object for ame class
        data1.Name="kavi";
        data1.Rollno=789351;
        data1.Email="kavi@gmail.com";
        System.out.println("Name :"+ data1.Name + "  Rollno :"+ data1.Rollno + " Email :"+ data1.Email);

    }
    
}
