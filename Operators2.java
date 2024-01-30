public class Operators2 {
    public static void main(String args[])
    {
        //Unary operators
        int c=5;
        int d=5;
        int e=5;
        int f=5;
        int a=5;
        int b=10;
        a=-2;
         System.out.println(a);//Unary minus
        System.out.println(++c);//pre increment
        System.out.println(d++);//post increment
        System.out.println(--e);//pre decrement
        System.out.println(f--);//post decrement
        //Not operator
         System.out.println(!(a<b));
          System.out.println(!(a>b));
        //bitwise compliment   ~
        a=5;
        System.out.println(~a);


        //Comparision Operators
        a=10;
        b=20;
        c=20;
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        System.out.println(a<b);
        System.out.println(a>b);

        //Logical Operators
        System.out.println((a<b)&&(b>a));
        System.out.println((a<b)||(b>a));
        System.out.println(!(b>a));

    //Terinary operators

      int z=(a<b)?a:b;
       System.out.println(z);
    
    //Bitwise operators
    a=5;
    b=7;
     System.out.println(a&b);//and
      System.out.println(a|b);//or
       System.out.println(a^b);//xor

    //Shift Operators
    a=-10;
    b=1;c
    System.out.println(a<<b);//signed left shift
    System.out.println(a>>b);//signed right shift
    //System.out.println(a<<<b);//unsigned left shift
    System.out.println(a>>>b);//unsigned right shift
        






        
        
    }
    
}
