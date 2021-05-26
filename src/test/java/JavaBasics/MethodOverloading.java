package JavaBasics;

public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloading m =new MethodOverloading();
        m.add(12.0f,50f);

    }
    public void add(int a,int b){
        int sum= a + b;
        System.out.println(sum);
    }

    public void add(int a, int b, int c){
        int sum= a + b + c;
        System.out.println(sum);
    }

    public void add(float a, float b){
        float sum = a + b;
        System.out.println(sum);
    }
}
