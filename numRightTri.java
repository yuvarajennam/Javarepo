import java.util.*;
public class numRightTri
{
    public static void main(String[] args) {
        int n=5;
        double k=0;
        for(int i=1;i<=n;i++){
            //  k=k*10+1;
            //  k=k+(Math.pow(10,i)); => for this i=0 and sop(k*(i+1))
            //  System.out.print(k*(i+1));
            System.out.print((int)(Math.pow(10,(i))/9)*i);

            System.out.println();
        }
    }
}