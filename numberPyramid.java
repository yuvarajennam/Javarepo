public class numberPyramid
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("_");
            }
            for(int k=0;k<(2*i)-1;k++){
                System.out.print(i);
            }
            for(int m=0;m<n-i;m++){
                System.out.print("_");
            }

            System.out.println();
        }
    }
}