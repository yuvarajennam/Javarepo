import java.util.*;
public class strings2 {
    public static void main(String []args){
        Scanner s= new Scanner(System.in);
        String st=s.nextLine();
        int count=0;
        int Ucount=0;
        int Lcount=0;
        for(int i=0;i<st.length();i++){
            char c= st.charAt(i);
            if(c>='A'&&c<='Z'){
                Ucount=Ucount+1;
            }
            else if(c>='a'&&c<='z'){
                Lcount=Lcount+1;
            }
            else{
                count++;
            }
        }
        System.out.println(Ucount);
        System.out.println(count + "\n" + Lcount);
    }
}
