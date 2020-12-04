import java.util.*;

  
  public class Main{
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    if(a==b && b==c)
    System.out.println("false");
    
    else if(a==c && b==c)
    System.out.println("false");
    
    else if(a>b && a>c)
    {
        
        if(a*a==(b*b)+(c*c))
        System.out.println("true");
        else
        System.out.println("false");
    }
    
    else if(b>a && b>c)
    {
        if(b*b==(a*a)+(c*c))
        System.out.println("true");
        else
        System.out.println("false");
    }
    
    else if(c>b && c>a)
    {
        if(c*c==(b*b)+(a*a))
        System.out.println("true");
        else
        System.out.println("false");
    }
    
    else
    System.out.println("false");
   }
  }
