import java.util.*;
public class arrayEvenReversing
{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int []y = new int[n];
        int []x = new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            x[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            if(x[i]%2==0){
                y[count]=x[i];
                count++;
            }
        }
        for(int i=count-1;i>=0;i--){
            System.out.print(y[i]+" ");

        }
    }

}

