import java.util.*;

class StuDetails
{
    int rn;
    String name;
    int att;
    StuDetails(int rn , String name , int att)
    {
        this.rn=rn;
        this.name=name;
        this.att=att;
    }
    void check(int c)
    {
        if(att>=c)
            System.out.println("NAME:"+name+"\n"+"ROLL NOS:"+rn+"STATUS:NO DEFAULTER("+att+")");
        else
            System.out.println("NAME:"+name+"\n"+"ROLL NOS:"+rn+"STATUS:HAS DEFAULTER("+att+")");
    }
    
}

public class exp16 
{
    public static void main(String[] args)
    {
        System.out.println("Enter the number of Students in the class:");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        StuDetails[] s=new StuDetails[n];
        for(int i=0 ; i<n ; i++)
        {
            System.out.println("Enter roll number:");
            int rn=in.nextInt();
            System.out.println("Enter the name of student:");
            String name=in.next();
            System.out.println("Enter the attendence of student in %:");
            int att=in.nextInt();
            s[i]=new StuDetails( rn , name , att);   
        }
        System.out.println("Enter the minimum attendence required:");
        int req=in.nextInt();
        for(int i=0 ; i<n ; i++)
        {
            s[i].check(req);
        }
    }
}
