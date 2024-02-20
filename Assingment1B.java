/*
Class: CSE 1321L
Section: J51
Term: Spring 2023
Instructor: Dmitri Nunes Dias Fernandes
Name: Dang Tran
Assignment#: 1B
*/
import java.util.Scanner;
public class Assingment1B {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        //Asks what, how many, how much
        //Stores input into variables
        System.out.print("What're you buying?");
        String item1 = sc.nextLine();
        System.out.print("How many?");
        int amount1 = sc.nextInt();
        System.out.print("What do they cost?");
        float price1 = sc.nextFloat();
        //Calculates cost for all items
        float total1 = amount1 * price1;

        Scanner sv = new Scanner(System.in);
        //Asks what, how many, how much
        //Stores input into variables
        System.out.print("What're you buying?");
        String item2 = sv.nextLine();
        System.out.print("How many?");
        int amount2 = sv.nextInt();
        System.out.print("What do they cost?");
        float price2 = sv.nextFloat();
        //Calculates cost for all items
        float total2 = amount2 * price2;

        //Calculates total cost
        float totalCost = total1 + total2;

        //Prints grocery list
        System.out.println("Your list:");
        System.out.println("----");
        System.out.println(item1 + " (" +amount1+ ")");
        System.out.println("$" +price1+ " ($" +total1+ " total)\n");
        System.out.println(item2 + " (" +amount2+ ")");
        System.out.println("$" +price2+ " ($" +total2+ " total)\n");
        System.out.println("Total Cost: $" +totalCost);
        System.out.println("----");
    }
}