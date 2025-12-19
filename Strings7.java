//to check the highest sequence of alphabets in a wholesum of alphabet string
import java.util.*;
public class Strings7 {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int count = 1;
        int max = 0;
        int j;
        for (int i = 0; i < str.length() - 1; i++) {
            j = i + 1;
            char ch = str.charAt(i);
            char ch2 = str.charAt(j);
            if (ch == ch2 - 1) {
                count = count + 1;
            } else {
                if (count > max) {
                    max = count;
                }
                count = 1;
            }
        }
        if (max < count) {
            max = count;
        }
        System.out.println(max);


    }
}
