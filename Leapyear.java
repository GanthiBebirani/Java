import java.util.Scanner;
public class Leapyear {
    public static void main(String args[]){
        Scanner myobj=new Scanner(System.in);
        System.out.println("Enter the year");
        int year=myobj.nextInt();
        //Checking whether the given year is Leap year or not
        //conditions-
        //yaer is multiple of 400,4,but not multiple of 100
        if((year%400==0)||(year%4==0)&&(year%100!=0)){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not leap year");
        }

    }
    
}
