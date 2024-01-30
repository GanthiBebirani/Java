public class Nameclash {
    public static float r=3.5f;
    public static float l=4f;
    public static void main (String args[]){
        System.out.println(circle.area(r));
        System.out.println(rectangle.area(r));

    }
  //Here we are define the same method in different classes ,that is the use of the class-we are differniating  
}
class circle{
    public static float area(float r)
    {
        return 2f*3.142f*r;
    }
}
class rectangle{
    public static float area(float l)
    {
        return l*l;
    }
}
