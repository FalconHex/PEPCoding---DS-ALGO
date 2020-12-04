import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();
      
      int o1=n1;
      int o2=n2;
      
      while(n1%n2 != 0)
      {
          int rem = n1%n2;
          n1=n2;
          n2=rem;
      }
      System.out.println(n2);
      
      int lcm = (o1*o2)/n2;
      System.out.println(lcm);
      
     }
    }
