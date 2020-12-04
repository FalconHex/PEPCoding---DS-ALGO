import java.util.*;

  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getDifference(int b, int n1, int n2){
       
       int rv = 0;
       int c = 0;
       int p = 1;
       
       while(n2 > 0)
       {
           //taking last digits of the number
           int d1 = n1%10;
           int d2 = n2%10;
           
           //removing last digits from numbers
           n1 = n1/10;
           n2 = n2/10;
           
           //initializing result var by 0
           int d = 0;
           
           //dealing d2 with carry value
           d2 = d2+c;
           
           // if d2 is greater than d1
           if(d2 >= d1)
           {
               //carry is set to 0
               c = 0;
               //subtracting d2 from d1
               d= d2 - d1;
           }
           
           // if d2 is less than d1
           else
           {
               //carry is set to -1
               c = -1;
               // adding base to d2 then subtracting
               d = (d2+b) - d1;
           }
           
           //taking value and setting their positions
           rv = rv + d*p;
           p = p*10;
           
       }
       
       return rv;
       
   }
    
  
  }
