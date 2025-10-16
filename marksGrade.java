import java.util.*;
public class marksGrade
{
    public static void main(String[] args) {

        Scanner N=new Scanner(System.in);
        float marks=N.nextFloat();
        //System.out.println("enter the value:"+ marks);
        if(marks<0)
            System.out.println("invalid");
        else if(marks>0&&marks<=25){
            if(marks%2==0){
                marks=marks*2;
                System.out.println(marks);
            }
            else{
                marks=marks/2;
                System.out.println(marks);
            }
        }

        else if(marks>25&&marks<=50){
            if(marks%2==0){
                marks=marks/2;
                System.out.println(marks);
            }
            else{
                marks=marks*2;
                System.out.println(marks);
            }
        }
        else if(marks>50&&marks<=75){
            if(marks%2==0){
                marks=marks*2;
                System.out.println(marks);
            }
            else{
                marks=marks/2;
                System.out.println(marks);
            }
        }
        else if(marks>75&&marks<=100){
            if(marks%2==0){
                marks=marks/2;
                System.out.println(marks);
            }
            else{
                marks=marks*2;
                System.out.println(marks);
            }

        }
        if(marks>100){
            float newmarks=marks+1000;
            System.out.println(newmarks);
        }

    }
}

