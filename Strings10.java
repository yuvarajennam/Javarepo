import java.util.*;

public class Strings10 {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int i=0,max=0;
        int l=i,r=i,len=0;
        while(l>=0&&r<=str.length()-1 && str.charAt(l)==str.charAt(r)){

            len=(r-l)+1;
            max=Math.max(max,len);
            l--;
            r++;

        }
        r=i+1;
        while(l>=0 && r<=str.length()-1 && str.charAt(l)==str.charAt(r)){

            len=(r-l)+1;
            max=Math.max(max,len);
        }
        System.out.println(max);
    }
}
