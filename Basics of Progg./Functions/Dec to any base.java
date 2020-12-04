import java.util.*;

  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
       int rem;
       int rv=0;
       int mul=1;
       while(n > 0)
       {
           rem = n%b;
           n = n/b;
           rv = rv + (rem * mul);
           mul = mul*10;
       }
       return rv;
       
    
    
   }
  }
