/*
Class: CSE 1321L
Section: J51
Term: Spring 2023
Instructor: Dmitri Nunes Dias Fernandes
Name: Dang Tran
Assignment#: 1A
*/
import java.util.Scanner;
public class Assignment1A {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        //Asks user to enter 3 values for RGB
        //Stores values in variables and does inverted conversions
        System.out.print("Enter a red value (0-255): ");
        int redInv = 255 - sc.nextInt();
        System.out.print("Enter a green value (0-255): ");
        int greenInv = 255 - sc.nextInt();
        System.out.print("Enter a blue value (0-255): ");
        int blueInv = 255 - sc.nextInt();

        //Does float conversions
        float redF = (float) redInv / 255;
        float greenF = (float) greenInv / 255;
        float blueF = (float) blueInv / 255;
        System.out.println("The inverted color is red=" +redInv+ ", green= " +greenInv+ ", blue=" +blueInv);
        System.out.printf("With floating points, that would be red=%.4f, green=%.4f, blue=%.4f", redF, greenF, blueF);
    }
}