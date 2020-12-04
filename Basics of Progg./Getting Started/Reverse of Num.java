import java.util.*;

   
   public class Main{
   
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int num = sc.nextInt();
     while(num>0)
     {
         System.out.println(num%10);
         num=num/10;
     }
    }
   }
