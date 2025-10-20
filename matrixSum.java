import java.util.*;
public class matrixSum
{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int [][]arr=new int[n][n];
        int count=0;
        int csum=0;
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=s.nextInt();
            }
        }
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                csum+=arr[j][i];
            }
            System.out.println("column sum:"+csum);
            csum=0;
        }
    }
}