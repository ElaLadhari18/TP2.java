package TP2;
import java.util.*;

public class Exercice6 {
    public static void main(String[] args) {

        // first number
        Scanner ch= new Scanner(System.in);

        System.out.print("Enter a first number : ");  
        String str= ch.nextLine();

        System.out.print("Enter a second number : ");  
        String str2= ch.nextLine();

        ch.close();

        String str3;

        System.out.println("Avant l'échange : a =" + str + " b= " + str2);

        str3 = str2 ;
        str2 = str ;
        str = str3 ;

        System.out.println("Après l'échange : a =" + str + " b= " + str2);

    }
}
