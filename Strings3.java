import java.util.Scanner;

public class Strings3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();
        System.out.print(st.charAt(0) - 96);
        for (int i = 1; i < st.length(); i++) {
            char val = st.charAt(i);
            System.out.print(", " + (val-96));
        }
    }
}
