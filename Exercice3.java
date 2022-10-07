package TP2;
import java.util.*;

public class Exercice3 {
    public static void main(String[] args) {

        // first number
        Scanner ch= new Scanner(System.in);
        System.out.print("Enter a first number : ");  
        String str= ch.nextLine();
        int num1 = Integer.parseInt(str);  

        System.out.print("Enter a second number : ");  
        String str2= ch.nextLine();
        ch.close();
        int num2 = Integer.parseInt(str2); 

        int somme = num1 + num2;

        System.out.print("sommme de "+ str + " + " + str2 + " = " + somme);

    }
}
