package Assignment;

import java.util.Scanner;

public class ScannerInputMultiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num1, Num2");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int output= num1 * num2;

        System.out.println("Output is "+output);
    }
}
