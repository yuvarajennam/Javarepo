public class alphabetPattern
{
    public static void main(String[] args) {
        int n=5;

        for(int i=0; i<n; i++) {
            for(int j=0; j<n-i; j++) {
                System.out.print(" ");
            }
            char ch='a';
            for(int k=0; k<=i; k++) {

                System.out.print(ch);
                ch++;
            }
            ch--;

            for(int k=0; k<i; k++) {
                ch--;
                System.out.print(ch);
            }

            for(int j=0; j<n-i; j++) {
                System.out.print(" ");
            }
            System.out.println();

        }


    }
}
