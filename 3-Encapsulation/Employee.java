public class Employee {
  private int id;
  private String DOJ;
  private String name;
  private int salary;

  public void setDetails(int i,String d ,String n,int s){
    id=i;
    DOJ=d;
    name=n;
    salary=s;
  }
  
  public void getDetails(){
    System.out.println("ID :" + id + "  Name :" + name + "  DOJ :" + DOJ + "    Salary : "+ salary);
  }
  public static void main(String[] args) {
      Employee E1 = new Employee();
      E1.setDetails(1001,"16.9.2019","Renu",50000);
      
      // Encapsulation: accessing data through methods
      E1.getDetails();

    }
  }
