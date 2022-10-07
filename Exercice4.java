package TP2;
import java.util.*;

public class Exercice4 {

    public static void main(String[] args) {

        // first number
        Scanner ch= new Scanner(System.in);
        System.out.print("Enter a number : ");  
        String str = ch.nextLine();
        ch.close();
        int num = Integer.parseInt(str);

        for (int i = 1; i <= 10; i++) {
            int multi = i*num;            
            System.out.println(str + " x " + i + " = " + multi);
        }

    }

}
