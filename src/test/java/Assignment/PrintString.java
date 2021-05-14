package Assignment;

import java.util.Scanner;

public class PrintString {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("Suchita");

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a String you want to print");
        String input = scan.nextLine();
        System.out.println(input);

        //int randomNum= (int)(Math.random() * 10);  //predefined method
        //System.out.println(randomNum);
    }

}
