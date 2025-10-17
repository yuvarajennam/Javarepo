public class dollarPattern
{
    public static void main(String[] args) {
        int n=5;
        //char c = '$';
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(i==0||i==n-1) {
                    System.out.print("* ");
                }
                else if(j==0||j==n-1) {
                    System.out.print("* ");
                }
                else if(i==1||j==1||i==n-2||j==n-2) {
                    System.out.print("$ ");
                }
                else {
                    System.out.print("  ");
                    //c++;



                }
            }

            System.out.println();
        }
    }
}
