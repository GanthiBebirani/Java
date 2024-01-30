public class Circle1 {
    public static float r=1.7f;
    public static void main(String args[]){
      System.out.println(Circle2.circumference(r));
      System.out.println(Circle2.area(r));
       
    }
    
}
class Circle2{
    public static float circumference(float r){
        return 2f*3.14f*r;
    }
    public static float area(float r){
        return 3.14f*r*r;
    }
}
