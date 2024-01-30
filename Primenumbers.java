public class Primenumbers{
    public static void main(String args[]){
      int count=20,i,n,j;
      for(i=2;i<=count;i++){
        n=0;
        for(j=1;j<=i;j++){
            if(i%j==0)
             n++; 
        }
          if(n==2){
                System.out.print(i+" ");
            }
      }  
    }
}