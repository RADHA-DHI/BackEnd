//-------Encapsulation-------//

class Encap{
//private data members
private String name;
private int id;

//---Setter---//
public void setName(String n){
    name=n;
}
public void setId(int i){
    id=i;
}

//----getter----//
public String getName(){
    return name;
}

public int getId(){
    return id;
}

public static void main(String args[]){
    Encap S1=new Encap();
    S1.setName("Sruthi");
    System.out.println("Student Name :"+ S1.getName());

    S1.setId(10001);
    System.out.println("Student ID :" + S1.getId());
    
}

}


