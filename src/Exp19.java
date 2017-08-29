
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nehal Kalnad
 */
class Customer
{
    String name;
    String[] items;
    int[] itemPrice;
    int i;
    Customer(String name , int n)
    {
        this.name = name;
        items = new String[n];
        itemPrice = new int[n];
        i =  0;
    }
    void addProduct(String product , int price)
    {
        items[i] = product;
        itemPrice[i] = price;
        i++;
    }
}
public class Exp19 {
    public static void main(String[] args)
        {
            Customer[] c = new Customer[10];
            int count = 0;
            Scanner sc = new Scanner(System.in);
            while(true)
            {
                System.out.println("Enter name");
                String name = sc.next();
                System.out.println("Enter number items you are buying");
                int n = sc.nextInt();
                System.out.println("Welcome to our store " + name);
                c[count] = new Customer(name , n );
                while(n > 0)
                {
                    n--;
                    System.out.println("Enter product name");
                    String proName = sc.next();
                    System.out.println("Enter Price");
                    int price = sc.nextInt();
                    c[count].addProduct(proName, price);
                }
                count++;
                System.out.println("enter 0 to end");
                if(sc.nextInt() == 0)
                    break;
            }
            System.out.println("No. of Customer who brought Samsung");
            int samCus = 0;
            for(int k = 0 ; k < count ; k++)
            {
                for(int st = 0 ; st < c[k].items.length ; st++ )
                {
                    if(c[k].items[st].endsWith("Samsung"))
                        samCus++;
                }
            }
            System.out.println(samCus);
            System.out.println("Details of all the Customers");
            for(int k = 0 ; k < count ; k++)
            {
                System.out.println(c[k].name + " has purchasd " );
                for(int st = 0 ; st < c[k].items.length ; st++ )
                {
                    System.out.println(c[k].items[st] + " for rs " + c[k].itemPrice[st]);
                }
            }
        }
}
