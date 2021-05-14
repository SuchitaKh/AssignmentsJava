package Assignment;

public class SwapWOThirdVar {

    public static void main(String[] args) {

        int a= 10;
        int b = 20;

        System.out.println("Before Swapping value of a is "+ a + " and value of b is "+b);
        a= a + b;
        b= a - b;
        a= a - b;
        System.out.println("After Swapping value of a is " + a + " and value of b is "+b);
    }
}
