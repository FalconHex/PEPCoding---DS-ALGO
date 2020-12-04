import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getProduct(b, n1, n2);
    System.out.println(d);
 }

 public static int getProduct(int b, int n1, int n2){
     int rev = 0;
     int p = 1;
     
     // running till digits are remaining in n2
     while(n2 > 0)
     {
         //getting last digit of n2
         int d2 = n2%10;
         
         //removing the taken last digit from n2
         n2 = n2/10;
         
         //calling func. for single digit mul. and passing base, whole n1 & last digit of n2
         int sdp = oneDigitProd(b,n1,d2);
         
         //adding the result we get after one digit mul
         // multiplying it with p to maintain positioning
         rev = getSum(b,rev,(sdp*p));
         
         //creating one X before adding
         p =p*10;
         
     }
     
     //final answer is returned
     return rev;
 }
 
 
 
 
 
 public static int oneDigitProd(int b, int n1, int d2)
 {
     //value to be returned
     int rev = 0;
     //carry value
     int c = 0;
     
     //power value to fix position
     int p = 1;
     
     
     //running till n1 is not over or carry has some value
     while(n1 > 0 || c > 0)
     {
       
       //storing last digit of n1 in d1 
       int d1 = n1%10;
       
       //removing the number taken from n1
       n1 = n1/10;
       
       //multiplying the number taken from n1 and that passed by func. + carry
       int d = d1 * d2 + c;
       
       //getting value of carry
       c = d/b;
       
       //getting remainder -> part of ans
       d = d%b;
       
       //adding to final value and fixing position
       rev = rev + d*p;
       p = p*10;
     }
     
     //returning value after only one digit of n2 is multiplied by n1
     return rev;
     
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
