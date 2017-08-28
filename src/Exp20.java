
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
public class Exp20
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in).useDelimiter("\\n");
        System.out.println("Enter String");
        String input;
        input = sc.next();
        System.out.println("enter Char of which frequency is to be found");
        char c = sc.next().charAt(0);
        int rep = 0;
        int n = input.length();
        for(int i = 0 ; i < n ; i++)
        {
            if(input.charAt(i) == c)
                rep++;
        }
        System.out.println("Frequency of char " + c + " is " + (float)rep/n + " or " + rep +"/"+n);
    }
}
