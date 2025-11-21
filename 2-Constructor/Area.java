class Area {
    int length,breath;

    //Parameterized constructor
    Area(int l,int b){
        length=l;
        breath=b;
    }
        //Method for area calculation
    void AreaCalculation(){
        System.out.println("Area of a Rectangle:" + (length*breath));
    }

    public static void main(String[] args) {
        Area ar=new Area(20,8);
        ar.AreaCalculation();
    }
 
}
