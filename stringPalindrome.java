import java.util.*;
public class stringPalindrome
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a=s.next();
        int count=0;
        int len=a.length();
        for(int i=0; i<len/2; i++) {

            if(a.charAt(i)!=a.charAt(len-1-i)) {
                count++;
                break;
            }
        }
        if(count==0)
            System.out.print("palindrome");
        else
            System.out.print("not palindrome");
    }
}
