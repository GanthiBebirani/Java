public class Maha {
    //Break and continue Statement
    public static void main(String args[]){

    for(int i=0;i<10;i++){
      if(i==6){
        break;
      } 
       System.out.println(i);   
    }
    for(int i=0;i<10;i++){
        if(i==4){
            continue;//Here whenver the i==4 then that iteration
        }
         System.out.println(i);
    }



    //Break and Continue using while loop
    int i=1;
    while(i<=10){
       if(i==5){
        break;

       }
       System.out.println(i);
       i++;
    }
     i=1;
    while(i<=10){
       if(i==5){
        i++;
        continue;

       }
       System.out.println(i);
       i++;
    }
      }
    
}
