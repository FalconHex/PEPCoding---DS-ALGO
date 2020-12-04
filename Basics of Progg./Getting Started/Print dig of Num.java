import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      int num = sc.nextInt();
      int temp=num;
      int nod=0;
      while (temp != 0)
      {
        temp = temp/10;
        nod++;
      }
      
      int div = (int)Math.pow(10,nod-1);
      
      while(div != 0)
      {
          System.out.println(num/div);
          num = num%div;
          div = div/10;
      }
      
     }
    }
