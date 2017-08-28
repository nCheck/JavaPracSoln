
import java.util.Scanner;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nehal Kalnad
 */
class Organizer
{
    Vector ev;
    Organizer()
    {
        ev = new Vector();
    }
    void addEvent(Event e)
    {
        ev.addElement(e);
    }
    void dispBudget()
    {
        Event temp;
        double total = 0;
        for(int i = 0 ; i < ev.size() ; i++)
        {
            temp = (Event)ev.get(i);
            total+=temp.cost;
        }
        System.out.println("Total Cost is " + total);
    }
    void remEvent(String name)
    {
        Event temp;
        boolean flag = true;
        for(int i = 0 ; i < ev.size() ; i++)
        {
            temp = (Event)ev.get(i);
            if(temp.eventName.equals(name))
            {
                System.out.println(temp.eventName + " is Succesfully removed");
                ev.remove(i);
            }
            else
                flag = false;
        }
        if(!flag)
        System.out.println("Wrong name");
    }
}
class Event
{
    String eventName;
    double cost;
    Event(String eventName , double cost)
    {
        this.cost = cost;
        this.eventName = eventName;
    }
}
public class Exp21 
{
    public static void main(String[] args)
    {
        Organizer o = new Organizer();
        Event[] e = new Event[10]; //Max Ten Events
        Scanner sc =  new Scanner(System.in);
        int eNo = 0;
        while(true)
        {
            System.out.println("Enter\n 1: to Add Event\n 2: to Remove Event\n 3: Display Total Budget\n 4: EXIT ");
            int ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Enter Event Name");
                    String eName = sc.next();
                    System.out.println("Enter Budget");
                    double budget = sc.nextDouble();
                    e[eNo] = new Event(eName , budget);
                    o.addEvent(e[eNo]);
                    eNo++;
                    break;
                case 2:
                    System.out.println("Enter Event Name to remove");
                    String rName = sc.next();
                    o.remEvent(rName);
                    break;
                case 3:
                    o.dispBudget();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
