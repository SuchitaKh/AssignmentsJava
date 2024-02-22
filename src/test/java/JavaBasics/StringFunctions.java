package JavaBasics;

public class StringFunctions {
    public static void main(String[] args) {

        String name = "suchita";
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.substring(0, 1).toUpperCase() + name.substring(1, 7));
        System.out.println(name.toUpperCase().charAt(0) + name.substring(1));
        System.out.println("*********");
        System.out.println(name.toCharArray());
        System.out.println(name.indexOf('u'));
        System.out.println(name.replace("uc", "en"));
        System.out.println(name.isEmpty());
        System.out.println(name.concat(" Ankam"));
        System.out.println(name.contains("s"));

        String name1 = "Suchita 2020 1950";
        String[] name2 = name1.split(" ");
        System.out.println(name1.split(" ")[0]);

        for (int i = 0; i < name2.length; i++) {
            System.out.println(name2[i]);
        }
      String fn= "Rayaansh";
        String ln="Rayaansh";

        System.out.println(fn.equals(ln));
        System.out.println(fn.hashCode());
        System.out.println(ln.hashCode());


        for(int i=0;i<fn.length();i++){
            System.out.println(fn.charAt(i));

        }
        char[] c=fn.toCharArray();

        for(char ch:c){
            System.out.println(ch);
        }



    }
}
