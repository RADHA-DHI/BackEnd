class Stringconcat {
    String first,last;

    Stringconcat(String f,String l){
        first=f;
        last=l;
    }

    void show(){
        System.out.println("Fullname :" + first +last );
    }

    public static void main(String[] args) {
        Stringconcat str=new Stringconcat("Radha","Krishan");
        str.show();    

    }
}
