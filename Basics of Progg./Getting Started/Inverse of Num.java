import java.util.*;

public class Main{

public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int num = sc.nextInt();
  int op =1;
  int inv =0;
  while(num != 0)
  {
      int od = num%10;
      int np = od;
      int nd = op;
      inv = inv + nd * (int)Math.pow(10,np-1);
      num = num/10;
      op++;
  }
  System.out.println(inv);
 }
}
