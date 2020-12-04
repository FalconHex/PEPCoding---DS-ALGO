import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int l = sc.nextInt();
        int u = sc.nextInt();
        
        for (int i= l; i<=u; i++)
        {
            int flag=0;
            
            for(int j=2; j*j <=i; j++)
            {
                if(i%j==0)
                {
                    flag=1;
                    break;
                }
                
            }
            if(flag==0)
                {
                    System.out.println(i);
                }
        }
    }
}
