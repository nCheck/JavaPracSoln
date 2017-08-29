
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
public class Exp22 
{
        static String sub(int ch)
        {
            switch(ch)
            {
                case 1:
                    return "Maths";
                case 2:
                    return "DLDA";
                case 3:
                    return "ECCF";
                case 4:
                    return "OOPM";
                case 5:
                    return "CO";
                default:
                        return null;
            }
        }
        public static void main(String[] args)
        {
            Scanner sc =  new Scanner(System.in);
            int[][] kt = new int[5][];
            int i = 0;
            int m  , d , e , o , c ;
            System.out.println("Enter Number of Students Appearing in");
            System.out.println("Maths");
            m = sc.nextInt();
            System.out.println("DLDA");
            d = sc.nextInt();
            System.out.println("ECCF");
            e = sc.nextInt();
            System.out.println("OOPM");
            o = sc.nextInt();
            System.out.println("CO");
            c = sc.nextInt();
            kt[0] = new int[m];
            kt[1] = new int[d];
            kt[2] = new int[e];
            kt[3] = new int[o];
            kt[4] = new int[c];
                    System.out.println("Enter Marks of Maths");
                    for(int k = 0 ; k < kt[0].length ; k++)
                        kt[0][k] = sc.nextInt();
                    System.out.println("Enter Marks of DLDA");
                    for(int k = 0 ; k < kt[1].length ; k++)
                        kt[1][k] = sc.nextInt();
                    System.out.println("Enter Marks of ECCF");
                    for(int k = 0 ; k < kt[2].length ; k++)
                        kt[2][k] = sc.nextInt();
                    System.out.println("Enter Marks of OOPM");
                    for(int k = 0 ; k < kt[3].length ; k++)
                        kt[3][k] = sc.nextInt();
                    System.out.println("Enter Marks of CO");
                    for(int k = 0 ; k < kt[4].length ; k++)
                        kt[4][k] = sc.nextInt();
            
            System.out.println("Total number of students appeared in Maths is " + kt[0].length );
            for(int j = 0 ;j < kt[0].length ; j++ )
            {
                System.out.println("Mark " +(j+1) +" is " + kt[0][j]);
            }
        }
}
