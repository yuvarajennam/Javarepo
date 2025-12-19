import java.util.Scanner;

public class Strings4 {
    public static void main(String[] args) {
        int n =4;
        String str= "";
        for(int i=0;i<n;i++){

            for(int j=0;j<n;j++){
                str=str+(j+1)+" ";
            }
            str=str+"\n";
        }
        System.out.print(str);
    }
}
