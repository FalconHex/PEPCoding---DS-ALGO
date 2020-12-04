import java.util.*;

  
  public class Main{
  
  public static void main(String[] args) 
  {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getSum(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getSum(int b, int n1, int n2)
   {
       
       int rv = 0;
       int c=0;
       int p=1;
       
       while(n1 > 0 || n2 > 0 || c > 0)
       {
           // getting last digit of each number 
           int d1 = n1%10;
           int d2 = n2%10;
           
           //removing those last digits from number
           n1= n1/10;
           n2= n2/10;
           
           //adding those removed number along with carry
           int d= d1+d2+c;
           
           //determining the carry number after adding
           c = d/b;
           
           //determing the remaing number after carry is taken 
           d = d % b;
           
           //multiplying the remaining number with power of 10 to get correct place and adding together
           rv = rv + d*p;
           
           //increasing power of 10 for next place
           p =p*10;
           
       }
       
       return rv;
       
       
   }
   
    
  }
