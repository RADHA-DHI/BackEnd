//Scenario: Library Management System
//Question:A base class LibraryItem has title and itemId.
//Subclasses Book and Magazine have additional fields.
//How can you call the base constructor from the subclass?

class Library{
    String title;
    String itemId;

    Library(String title,String itemId){
        this.title=title;
        this.itemId=itemId;
    }

    void bookDetails(){
        System.out.println("Book Title :" + title);
        System.out.println("Book Id Number:"+itemId);
    }
}

class Book extends Library{
    String subject;
    String author;
    String publication;

    Book(String title,String itemId,String subject,String author,String publication){
        super(title,itemId);    //calls constructor of the base class
        this.subject=subject;
        this.author=author;
        this.publication=publication;
    }

        void bookDetails(){
            super.bookDetails();
            System.out.println("Author :" + author);
            System.out.println("Sub:" + subject);
            System.out.println("Publication :" + publication);
        }
    }

    class Magazine extends Library{
        String edition;
        String pubmon;
        String sub;

        Magazine(String title,String itemId,String edition,String pubmon,String sub){
            super(title,itemId);
            this.edition=edition;
            this.pubmon=pubmon;
            this.sub=sub;
        }

        void bookDetails(){
           System.out.println("MAgazine NAme:"+title +" Edition:"+edition+"  Publication :"+pubmon+"  Stream :"+sub);
    }
}

public class hierLibraryMang {
    public static void main(String[] args) {
        
    Book bk=new Book("Circuit Theory","CZ135","Electrical","S.P.Ghosh","McGraw Hill Education,2018");
    Magazine mg=new Magazine("EFY","","Vol.5,No.1","Sep 2025","Tech");
    bk.bookDetails();
    System.out.println("---------------------------------------------------------");
    mg.bookDetails();
    System.out.println("---------------------------------------------------------");
    }
}
