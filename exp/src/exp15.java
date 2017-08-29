import java.util.*;

class Books
{
    String book;
    String author;
    String pub;
    int cost;
    int stock;
    Books(String book , String author , int cost , String pub , int stock )
    {
        this.book=book;
        this.author=author;
        this.cost=cost;
        this.pub=pub;
        this.stock=stock;
    }
    int checkbook(String bk , String au)
    {
        if(bk.equals(book) && au.equals(author))
        {
            return 1;
        }
        else
            return 0;
    }
    
    void dispDetails(int copies)
    {
        if(copies>stock)
        {
            System.out.println("Required copies not in the stock!");
        }
        else
        {
            int amt=copies*cost;
            System.out.println("Book Deatils"+"\n"+"Name:"+book+"\n"+"Author:"+author+"\n"+"publisher:"+pub+"\n"+"copies"+copies+"\n"+"Total Cost:"+amt);
        }
    }
}

public class exp15 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of type of books in Store:");
        int n=in.nextInt();
        Books[] b=new Books[n]; 
        
        for(int i=0 ; i<n ; i++)
        {
            System.out.println("Enter the name of book:");
            String book=in.next();
            System.out.println("Enter the name of author:");
            String author=in.next();          
            System.out.println("Enter the cost of book:");
            int cost=in.nextInt();
            System.out.println("Enter the publisher of book:");
            String pub=in.next();
            System.out.println("Enter number of books in stock:");
            int stock=in.nextInt();
            b[i]=new Books( book , author , cost , pub , stock );
        }
        System.out.println("Enter the name of the book you want:");
            String book=in.next();
        System.out.println("Enter the name of the author of your book:");
            String author=in.next(); 
        
        int flag=0;
        for(int i=0 ; i<n ; i++)
        {
            int check=b[i].checkbook(book,author);
                if(check==1)
                {
                    System.out.println("Enter the number of copies required");
                    int copies=in.nextInt();
                    b[i].dispDetails(copies);         
                    flag=1;
                    break;
                }
        }
        if(flag==0)
            System.out.println("Book not found");
        
    }
}
