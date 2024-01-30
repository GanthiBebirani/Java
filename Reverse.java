import java.util.Scanner;

public class Reverse {
    public static void main(String args[])
    {
     Scanner myobj=new Scanner(System.in);
     System.out.println("Enter the Number");
     int n=myobj.nextInt();
     //Reverse of the number
     int i,r,sum=0;
     i=n;
     while(n>0)
     {
       r=n%10;
       sum=(sum*10)+r;
       n=n/10;

     }
     System.out.println("reverse of the number is "+sum);
    }
    
}
