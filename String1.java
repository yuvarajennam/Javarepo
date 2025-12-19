import java.util.*;
public class String1 {
    public static void main(String[] args){
        String s1="HELLO";
        String s2="hello";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        String s3= "      Hello          ";
        System.out.println(s3);
        System.out.println(s3.trim());
        String s4= "hey all how are you";
        System.out.println(s4.split(" "));
        System.out.println(Arrays.toString(s4.split(" ")));
    }
}
