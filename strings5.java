//password checking
import java.util.*;
public class strings5 {
    public static void main (String []args){
        Scanner s= new Scanner(System.in);
        String st=s.nextLine();
        for(int i=0;i<st.length();i++){
            char c= st.charAt(i);
//            if ((c>=65&&c<=90)||(c>=97&&c<=122)||(c>=48&&c<=57){
//                System.out.println("valid");
//            }
            if(c<=32&&c>=126){
                System.out.println("valid");
            }
            else{
                System.out.println("invalid");
            }
        }
    }
}
