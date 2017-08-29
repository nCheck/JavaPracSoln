
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
public class Ex13 {
    static int getDecimalFromBinary(int binary){
         
        int decimal = 0;
        int power = 0;
        while(true){
            if(binary == 0){
                break;
            } else {
                int tmp = binary%10;
                decimal += tmp*Math.pow(2, power);
                binary = binary/10;
                power++;
            }
        }
        return decimal;
    }
    static void getOctalFromBinary(int binnum)
    {
        int rem, quot, i=1, j;
        int octnum[] = new int[100];
		
        quot = binnum;
		
        while(quot != 0)
        {
            octnum[i++] = quot%8;
            quot = quot/8;
        }
		
        System.out.print("Equivalent Octal Value of " +binnum+ " is : ");
        for(j=i-1; j>0; j--)
        {
            System.out.print(octnum[j]);
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter \n1: for Bin to Dec \n2: for Bin to Oct");
        int ch =  sc.nextInt();
        System.out.println("Enter your binary number");
        int bin =  sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("Decimal Value of" +bin +" is " + getDecimalFromBinary(bin));
                break;
            case 2:
                getOctalFromBinary(bin);
                break;
            default:
                System.out.println("Wrong Choice");
        }
    }
}
