package TP2;
import java.util.*;

public class Exercice5 {
    public static void main(String[] args) {

        Scanner ch= new Scanner(System.in);
        System.out.print("Enter a first number : ");  
        String str= ch.nextLine();
        float num1 = Integer.parseInt(str);  

        System.out.print("Enter a second number : ");  
        String str2= ch.nextLine();
        float num2 = Integer.parseInt(str2); 

        System.out.print("Enter a second number : ");  
        String str3= ch.nextLine();
        float num3 = Integer.parseInt(str3); 

        ch.close();

        float moy = (num1 + num2 + num3)/3;

        System.out.print("la moyenne est = "+ moy);

    }
}
