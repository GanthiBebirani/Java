import java.util.Scanner;

public class Switchcase {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Day Number:");
        int day=obj.nextInt();
        switch (day){
            case 1:
            System.out.println("Sunday");
            break;
            case 2:
            System.out.println("Monday");
            break;
            case 3:
            System.out.println("Tuesday");
            break;
             case 4:
            System.out.println("wednesday");
            break;
            case 5:
            System.out.println("Thursday");
            break;
            case 6:
            System.out.println("Friday");
            break;
             case 7:
            System.out.println("Saturday");
            break;
            default:
            System.out.println("Sorry something went wrong");

        }

    }
    
}
