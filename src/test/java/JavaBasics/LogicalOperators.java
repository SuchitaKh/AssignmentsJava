package JavaBasics;

public class LogicalOperators {

    public static void main(String[] args) {

        int a=10;
        int b=20;

        System.out.println(a>b && a==10);  //false
        System.out.println(a>b || a==10);   //true
        System.out.println(a!=b);           //true
        System.out.println(a==b);           //false; Conditional operators results are always boolean

        //Increment/Decrement operator

        int i=10;
        int y= ++i;

        System.out.println("The value of y is: "+y+ ", and i is : "+i);  /* i is incremented first and then the value is assigned to y,
                                     y value will be 11 in this case and i is 11*/
        int x=--i;
        System.out.println("The value of y is: "+x+ ", and i is : "+i); /* in this case i is decremented first and assigned to x value is 10 for both*/

        int z= i++;
        System.out.println("The value of y is: "+z+ ", and i is : "+i); //assigned first and incremented later.So here z=10, i is 11

        int c= i--;
        System.out.println("The value of c is: "+c+ ", and i is : "+i);    // assigned first and decremented later. b = 11, i =10

    }
}
