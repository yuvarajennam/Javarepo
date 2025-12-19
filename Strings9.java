import java.util.*;
public class Strings9 {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int i=0,j=str.length()-1,f=0;
        while(i<j){
            if(str.charAt(i)==str.charAt(j)){
                i++;
                j--;
            }
            else{
                f=1;
                break;
            }
        }
        System.out.println("palindrome");

    }
}

