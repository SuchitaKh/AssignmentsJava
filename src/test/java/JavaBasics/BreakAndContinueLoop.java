package JavaBasics;

public class BreakAndContinueLoop {

    public static void main(String[] args) {

        for(int i=0; i<12; i++){
            //System.out.println(i);  //o/p in this case will be 0----10
            if(i==7){
                continue;
            }
            //System.out.println(i); //o/p in this case will be 0-6,8-10
            if(i==10){
                break;
            }
            System.out.println(i); // o/p in this case will be 0-9
        }

    }
}
