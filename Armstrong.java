import java.util.Scanner;
import java.lang.Math;
public class Armstrong {
    public static void main(String args[])
    {
        Scanner myobj=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=myobj.nextInt();
        int temp=n,num=0,sum=0,r,i;
        for(i=n;i!=0;num++){
           i=i/10;
        }
        while(n>0){
            r=n%10;
            n=n/10;
        }
        if(sum==temp){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not Armstrong number");
        }
    }
    
}
