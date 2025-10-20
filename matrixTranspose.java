import java.util.*;
class matrixTranspose
{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int [][]arr=new int[n][n];
        int count=0;
        for(int i =0; i<n; i++) {
            for(int j=0; j<n; j++) {
                arr[i][j]=s.nextInt();
            }
        }
        for(int i =0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
        for(int i =0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int t=arr[j][j];
                arr[i][j]=arr[j][i];
                arr[i][j]=t;
            }
        }
    }
}
