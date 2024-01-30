import java.util.Scanner;
class Palindrome{
    public static void main(String args[]){
        //Checking whether the number is palindrome or not
    Scanner myobj=new Scanner(System.in);
    System.out.println("Enter the number");
    int num1=myobj.nextInt();
    System.out.println("num1 "+num1);
    int sum=0,r,num2=num1;
   while(num1>0){
    r=num1 % 10;
    sum=(sum*10)+r;
    num1=num1 / 10;

   }
   if(num2==sum){
    System.out.println("Palindrome number");
   }
   else{
    System.out.println("Not palindrome number");
   }

    }

}