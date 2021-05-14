package JavaBasics;

public class Calculator {

    public static void main(String[] args) {
        Calculator cal= new Calculator();
        cal.sum(10,20);
        int s= cal.subtraction(100,20);
        System.out.println("Subtraction is: "+s);
        System.out.println("Subtraction is: "+cal.subtraction(20,10));
        cal.division(20,10);
        System.out.println("Multiplication of number is: " + cal.multiplication(10,20));
        System.out.println("Remainder of the number is" + cal.remainder(100,20));
    }

    //Access modifier return type methodName(Parameters)
    public void sum(int x,int y){
    int sum= x + y;
    System.out.println(" Addition of number is: " + sum);
    }

    public int subtraction(int x,int y){
        int sub= x - y;
        return(sub);
    }

    public void division(int x,int y){
       int div= x / y;
       System.out.println("Division of numbers is: "+div);
    }

    public int multiplication(int x, int y){
        int mul=x*y;
        return mul;
    }

    public int remainder(int x,int y){
        int rem= x%y;
        return rem;
    }
}
