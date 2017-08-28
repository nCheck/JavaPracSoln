
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
            int m = 0 , d = 1 , e = 2 , o = 3 , c = 4;  
            while(i<5)
            {
                System.out.println("Student " +(i+1) + " Please select Subjects you got KT");
                int ch = 0;
                while(ch != 6)
                {
                        System.out.println("1:Maths 2:DLDA 3: ECCF 4: OOPM 5: CO 6: EXIT");
                        ch = sc.nextInt();
                        if(ch == 6)
                            break;
                        System.out.println("Enter marks for " + sub(ch));
                        int marks = sc.nextInt();
                        switch(ch)
                        {
                            case 1:
                                kt[m][i] = marks;
                                break;
                            case 2:
                                kt[d][i] = marks;
                                break;
                            case 3:
                                kt[e][i] = marks;
                                break;
                            case 4:
                                kt[o][i] = marks;
                                break;
                            case 5:
                                kt[c][i] = marks;
                                break;
                        }                            
                }
                i++;
            }
            
            System.out.println("Total number of students appeared in Maths is " + kt[m].length );
            for(int j = 0 ;j < kt[m].length ; j++ )
            {
                System.out.println("Mark "+ j+1 + " is " + kt[m][j]);
            }
        }
}
