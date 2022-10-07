package TP2;
import java.util.*;

public class Exercice2 {
    public static void main(String[] args) {

        Scanner ch= new Scanner(System.in);
        System.out.print("Enter a char : ");  
        String str= ch.nextLine();
        ch.close();
        char charac = str.charAt(0);//returns h  
        int ascii = charac ;
        System.out.println("The ASCII value of " + str + " is: " + ascii);
    }

}
