import java.util.*;
public class Strings1 {
    public static void main(String []args){
        Scanner s= new Scanner(System.in);
        String st=s.nextLine();
        String res="";
        int count=0;
        for(int i=0;i<st.length();i++){
            char h=st.charAt(i);
            if(h=='a'||h=='e'||h=='i'||h=='o'||h=='u'){
                count+=1;
                res+=h;
            }

        }
        System.out.println(count);
        System.out.println(res);
    }
}
