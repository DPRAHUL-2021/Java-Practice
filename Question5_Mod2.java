/*  Program to implement a Book class that stores the details of a book such as its code, title
and price (Use constructors to initialize the objects).*/

// import java.util.Scanner;
class Book{
    String bookCode , Title;
    int price;
    Book(String Name,String Code,int cost)
    {
        bookCode = Code;
        Title = Name;
        price = cost;
    }
    void display()
    {
        System.out.println("The Name Of The Book Is "+Title+" With Code "+bookCode+" And Bearing a Cost "+price+" Rupees");
    }
}

public class Question5_Mod2 {
    public static void main(String args[])
    {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Name Of The Book ");
        // String str1 = sc.next();
        // System.out.println("Enter The Code Of The Book ");
        // String str2 = sc.next();
        // System.out.println("Enter Price Of The Book ");
        // int MRP = sc.nextInt();
        // Book b1 = new Book(str1,str2,MRP);
        Book b1 = new Book("Adventures Of Toto","123AF",1999);
        b1.display();
    }
}
