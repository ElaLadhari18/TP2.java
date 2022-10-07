package TP2;
import java.util.*;

public class Exercice7 {
    public static void main(String[] args) {

        Scanner ch= new Scanner(System.in);

        System.out.print("Enter a number : ");  
        String str= ch.nextLine();
        double num = Integer.parseInt(str); 

        ch.close();

        double racine = Math.sqrt(num);

        System.out.println("Racine carrée de " + num + " = " + racine);
    }
}
