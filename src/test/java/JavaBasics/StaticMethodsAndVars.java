package JavaBasics;

public class StaticMethodsAndVars {

    static int a = 50;  // global variable

    public static void main(String[] args) {

        System.out.println(a);
        sum(10,20);
        //System.out.println(b); // local variable not identified

    }

    public static void sum(int x, int y){
        int b = 25;   // local variable
        int sum= x + y;
        System.out.println(sum);
    }
}
