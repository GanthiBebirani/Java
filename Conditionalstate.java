class Conditionalstate{
    public static void main(String args[]){
        System.out.println("Hello");

    //(if) (else) (else if)
    //printing the given number is prime number or not
    int a=5,n=0;
    for(int i=1;i<=a;i++){
        if((a%i)==0){
           n++;
        }
    }
    if(n==2){
        System.out.println("Given Number is Prime number");

    }
    else{
        System.out.println("The given number is not prime");
    }


    }
}