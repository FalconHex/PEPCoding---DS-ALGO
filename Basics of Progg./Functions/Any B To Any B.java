import java.util.*;
  
  public class Main{
  
  public static void main(String[] args)
  {
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     
     
     int r = anytodec(n,sourceBase);
     int a = dectoany(r,destBase);
     System.out.println(a);
   }
   
   
   public static int anytodec(int n, int sb)
   {
       int rem;
       int rv=0;
       int mul=1;
       while(n > 0)
       {
           rem = n%10;
           n = n/10;
           rv = rv + (rem * mul);
           mul = mul*sb;
       }
       return rv;
   }
   
   
   public static int dectoany (int n, int db)
   {
       int rem;
       int rv=0;
       int mul=1;
       while(n > 0)
       {
           rem = n%db;
           n = n/db;
           rv = rv + (rem * mul);
           mul = mul*10;
       }
       return rv;
       
   }
   
 
  }
  
