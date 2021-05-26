package JavaBasics;

import java.io.*;

public class forloopex {
    public static void main(String[] args) throws IOException {

        //1. Single for loop example
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }

        //2. Inner loop example. pattern print
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("reverse pattern print example");

        //3. Inner loop example. reverse pattern print
        for (int i = 5; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("While loop example");
        //4. Example of while loop
        int i = 10;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }

        System.out.println("Do While loop example");
        //5. Example of do while loop
        do {
            System.out.println(i);  // will execute at least once
            i++;
        } while (i <= 5);

        //6.Read a text file using while loop
        System.out.println("Read a text file using while loop");
        String path = System.getProperty("user.dir") + File.separator + "Test.txt";

        FileInputStream fis = new FileInputStream(path);

        BufferedReader bf = new BufferedReader(new InputStreamReader(fis));
        String l1 = bf.readLine();
        String l2 = bf.readLine();
        System.out.println(l1);
        System.out.println(l2);

        System.out.println("*************");
        //using while loop to read filr
        String x;
        while ((x = bf.readLine()) != null) {
            System.out.println(x);
        }
    }
}
