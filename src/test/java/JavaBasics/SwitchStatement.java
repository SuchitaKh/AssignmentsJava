package JavaBasics;

import java.util.Scanner;

public class SwitchStatement {
    /* Switch statement is like a if else statement but with a single path. So if we have to write multiple if else
    then we can replace it by using Switch statement
    It works with char,byte,short,int and string
     */

    public static void main(String[] args) {

        System.out.println("There are 12 months in a year");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number from 1 to 12");
        int n = sc.nextInt();

        // int month= \n;

        switch (n) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Enter correct number");
                break;


        }

    }
}
