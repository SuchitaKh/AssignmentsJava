package JavaBasics;

public class Operators {

    public static void main(String[] args) {

        int a = 100;
        float b = 20.0f;

        float sum = a + b;
        int mul = (int) (a * b);  // casting float value to int
        int div = (int) (a / b);
        float remainder = a % b;
        float sub = a - b;

        System.out.println("sum : "+sum);
        System.out.println("mul : "+mul);
        System.out.println("div :" +div);
        System.out.println("remainder : "+remainder);
        System.out.println("sub : "+sub);

    }

}
