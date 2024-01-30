class Stringss{
    public static void main(String args[]){
        System.out.println("Hello world");
        String name="Ganthi Bebirani";
        System.out.println("length of the String "+name.length());
        System.out.println("Changing to upper case:"+name.toUpperCase());
        System.out.println("Changing to lower case:"+name.toLowerCase());
        System.out.println("Writing Index:"+name.indexOf("Bebirani"));
        /*Concatenation*/
        String first="Ganthi";
        String last="Bebirani";
        System.out.println(first+""+last);
        System.out.println(first.concat(last));
        int a=10;
        int b=20;
        System.out.println(a+b);
        String c="10";
        String d="20";
        System.out.println(c+d);
        System.out.println(a+d);
        System.out.println(d+a);
    //Special Characters
    c="Hello my name is \"Bebirani\"";
    System.out.println(c);

    }
}