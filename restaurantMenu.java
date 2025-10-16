import java.util.*;
public class restaurantMenu
{
    public static void main(String[] args) {

        Scanner N=new Scanner(System.in);
        System.out.println("Hi, Please Enter your name:");
        String name=N.nextLine();
        System.out.println("Hey "+name+",");
        System.out.println("1.Dal Fry=40rs");
        System.out.println("2.Paneer butter masala=120rs");
        System.out.println("3.Chicken Fry=200rs");
        System.out.println("4.Fish Fry=220rs");
        System.out.println("5.Potato Fry=50rs");
        System.out.println("Select from the menu above:");
        int val=N.nextInt();
        System.out.print("Enter quantity:");
        int quantity=N.nextInt();
        switch(val)
        {
            case 1:
                System.out.println("you've selected option "+val+" pay for "+quantity+" quantities");
                System.out.println("price is:"+quantity*40);
                int pay=N.nextInt();
                if(pay==quantity*40)
                    System.out.println("Order placed, kindly wait");
                else
                    System.out.println("Insufficient money");
                int remaining=(quantity*40)-pay;
                System.out.println("money to be paid more is:"+remaining);
                break;
            case 2:
                System.out.println("you've selected option "+val+" pay for "+quantity+" quantities");
                System.out.println("price is:"+quantity*120);
                pay=N.nextInt();
                if(pay==quantity*120)
                    System.out.println("Order placed, kindly wait");
                else
                    System.out.println("Insufficient money");
                remaining=(quantity*120)-pay;
                System.out.println("money to be paid more is:"+remaining);
                break;
            case 3:
                System.out.println("you've selected option "+val+" pay for "+quantity+" quantities");
                System.out.println("price is:"+quantity*200);
                pay=N.nextInt();
                if(pay==quantity*200)
                    System.out.println("Order placed, kindly wait");
                else
                    System.out.println("Insufficient money");
                remaining=quantity*200-pay;
                System.out.println("money to be paid more is:"+remaining);
                break;
            case 4:
                System.out.println("you've selected option "+val+" pay for "+quantity +" quantities");
                System.out.println("price is:"+quantity*220);
                pay=N.nextInt();
                if(pay==quantity*220)
                    System.out.println("Order placed, kindly wait");
                else
                    System.out.println("Insufficient money");
                remaining=quantity*220-pay;
                System.out.println("money to be paid more is:"+remaining);
                break;
            case 5:
                System.out.println("you've selected option "+val+" pay for "+quantity+" quantities");
                System.out.println("price is:"+quantity*50);
                pay=N.nextInt();
                if(pay==quantity*50)
                    System.out.println("Order placed, kindly wait");
                else
                    System.out.println("Insufficient money");
                remaining=quantity*50-pay;
                System.out.println("money to be paid more is:"+remaining);
                break;
        }
    }
}
