import java.util.*;
public class matrixevenSum
{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int [][]arr=new int[n][n];
        int count=0;
        int sum=0;
        for(int i =0; i<n; i++) {
            for(int j=0; j<n; j++) {
                arr[i][j]=s.nextInt();
            }
        }
        for(int i =0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for(int i =0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(arr[i][i]%2==0) {
                    sum+=arr[i][i];
                }
            }
        }
        System.out.println(sum);
        sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][n-1-i]%2==0){
                    sum+=arr[i][n-1-i];
                }
            }
        }
        System.out.println(sum);
    }

}