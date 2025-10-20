import java.util.*;
public class matrixCount
{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int [][]arr=new int[n][n];
        int count=0;
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=s.nextInt();
                if(arr[i][j]%2==0){
                    count=count+1;
                }
            }
        }
        System.out.println("count is:"+count);

    }
}
