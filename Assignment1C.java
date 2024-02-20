/*
Class: CSE 1321L
Section: J51
Term: Spring 2023
Instructor: Dmitri Nunes Dias Fernandes
Name: Dang Tran
Assignment#: 1C
*/
import java.util.Scanner;
public class Assignment1C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Asks user for day, month(num and string), and year
        //Stores input in variables
        System.out.print("Enter the day (number): ");
        int day = sc.nextInt();
        System.out.print("Enter the month (number): ");
        int monthNum = sc.nextInt();
        System.out.print("Enter the month (String): ");
        String monthString = sc.next();
        System.out.print("Enter the year (number): ");
        int year = sc.nextInt();

        //Prints dates in different ways
        System.out.println("Here are some ways to represent the date:");
        System.out.println(day +"/"+ monthNum +"/"+ year);
        System.out.println(year +"/"+ monthNum +"/"+ day);
        System.out.println(monthNum +"/"+ day +"/"+ year);
        System.out.println(monthString +" "+ day +", "+ year);
        System.out.println(day +" "+ monthString +" "+ year);
    }
}