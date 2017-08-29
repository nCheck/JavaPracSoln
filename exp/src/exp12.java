import java.util.*;

class calAmstrong
{
    int num;
    calAmstrong(int num)
    {
        this.num=num;
    }
    
    void checkNumber()
    {
        int temp=num;
        int ans=0;
        while(num>0)
        {
            int n=num%10;
            ans=ans+(n*n*n);
            num=num/10;
        }
        if(ans==temp)
            System.out.println("The Entered number is Armstrong Number");
        else
            System.out.println("The Entered number is NOT a Armstrong Number");
    }
}

class exp12
{
    public static void main(String[] args)
    {
        System.out.println("enter the number:");
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        calAmstrong c=new calAmstrong(num);
        c.checkNumber();
    }
} 
