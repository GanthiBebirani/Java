import java.lang.Math;
import java.util.Scanner;
public class Randommethod {
    public static void main(String args[]){
        System.out.println("num1"+Math.random());
         System.out.println("num2"+Math.random());
          System.out.println("num3"+Math.random());

    //Within the Specified range
    Scanner myobj=new Scanner(System.in);
    System.out.println("Enter the minimum Value");
    int min=myobj.nextInt();
      System.out.println("Enter the maximum Value");
    int max=myobj.nextInt();

      System.out.println("num1"+Math.random()*(max-min+1)+min);
       System.out.println("num2"+Math.random()*(max-min+1)+min);
        System.out.println("num2"+Math.random()*(max-min+1)+min);
          }

          //Specifically int and double values generation
    
}
