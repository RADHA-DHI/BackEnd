//Scenario: E-commerce Product Hierarchy
//Q:You have a base class Product. Derived classes include Electronics and Clothing.
//How can you reuse code for displaying common attributes but still show product-specific details?
class Products{
    String name;
    double price;
    int productcode;

    Products(String name,int productcode,double price){
        this.name=name;
        this.productcode=productcode;
        this.price=price;
    }

    //using common display method 
    void displayproduct(){
        System.out.println("Name :" + name);
        System.out.println("Product Code :"+productcode);
        System.out.println("Price:"+price);
    }
}

class Clothing extends Products{
    String size;
    String type;

    Clothing(String name,int productcode,double price,String size,String type){
        super(name, productcode, price);
        this.size=size;
        this.type=type;
    }
   //over riding to show specific product
    void displayproduct(){
        super.displayproduct();//reusing parent display code
        System.out.println("Size:"+ size);
        System.out.println("Mateiral Type :"+type);
    }
}

class Appliance extends Products{
    String brand;
    String rating;

    Appliance(String name,int productcode,double price,String brand,String rating){
        super(name, productcode, price);
        this.brand=brand;
        this.rating=rating;
    }
        void displayproduct(){
            super.displayproduct();
            System.out.println("Product Brand :" + brand);
            System.out.println("Rating :"+rating);
        }
    }
public class hierEcom {
    public static void main(String[] args) {
        Clothing cl=new Clothing("kurta",43261 ,999,"XL", "Cotton");
        Appliance ap=new Appliance("Washing Machine",34297,25870,"LG","****");
        System.out.println("Category - Clothing");
        System.out.println("------------------------");
        cl.displayproduct();
        System.out.println("Category - Home Appliance");
        System.out.println("------------------------");
        ap.displayproduct();
    }    
}
