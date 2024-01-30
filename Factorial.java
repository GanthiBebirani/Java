import java.util.Scanner;
public class Factorial {
    public static void main(String args[])
    {
        Scanner myobj=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=myobj.nextInt();
          int mul=1;
        for(int i=n;i>=1;i--){
           mul=mul*i;
        }
        System.out.println(mul);



    }
    
}
