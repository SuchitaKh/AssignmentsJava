package JavaBasics;

public class VariableDeclarationNInitialization {
    // Variable declaration
    public static void main(String[] args) {
        /*
        Multiline comments
        */

        /**
         * @author etc comment
     2020    */

        //Single line comment

        int a,b;
        a=10;
        b=20;

        int price;

        price = 1235;

        System.out.println(price);
        int sum = a + b;

         //byte is 1 byte
        short s = 12345; //size is 2 bytes and stores 5 digits
        int n= 1234567890;  // takes 10digits is 4 bytes size` 
        long l= 1234567890123456789l; //size is 8 bytes and takes 19 digits

        float f= 123456.0014f; // size=4 bytes
        double d= 123456879.156447878545151564545512356d; //size is 8 bytes
        char ch='a'; // only one char and has
        String name="Suchita";  // is immutable and is a class in Java
        boolean bool= true; //1 byte


        System.out.println(n);
        System.out.println(l);
        System.out.println(s);
        System.out.println(f);
        System.out.println(d);
        System.out.println(name);


    }

}
