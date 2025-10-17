import java.util.*;
class evenDigitmultiply
{
    public static void main(String[] args) {

        Scanner S=new Scanner(System.in);
        int num=S.nextInt();
        int n;
        int a=1;
        while(num!=0){
            n=num%10;
            if(n%2==0){
                //System.out.print("even");
                a=a*n;
            }
            num/=10;

        }
        System.out.print(a);

    }
}