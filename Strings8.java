//remove duplicates in the string without changing its order
import java.util.*;
public class Strings8 {
    static void main(String[] args){
        Scanner s= new Scanner(System.in);
        String str= s.nextLine();
        String res="";
        for(int i=0;i<str.length();i++){
            int f=0;
            for(int j=0;j<res.length();j++){
                if(str.charAt(i)==res.charAt(j)){
                    f=1;
                    break;
                }
            }
            if(f==0)
                res=res+str.charAt(i);
        }
        System.out.println(res);

    }
}
