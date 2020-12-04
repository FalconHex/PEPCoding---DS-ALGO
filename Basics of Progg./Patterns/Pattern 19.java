import java.util.*;



public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     int n =scn.nextInt();
     
     for(int i=1; i<=n; i++)
     {
         for(int j=1; j<=n; j++)
         {
             
             //1st line 
             if(i==1)
             {
                if(j <= n/2 + 1 || j==n)
                System.out.print("*\t");
                else
                System.out.print("\t");
             }
             
             
             //upper half except 1st
             else if( i <= n/2)
             {
                 if(j == n/2 +1 || j==n)
                 System.out.print("*\t");
                 else
                 System.out.print("\t");
             }
             
             
             //middle row
             else if(i== n/2 + 1)
             {
                 System.out.print("*\t");
                 
             }
             
             
             
             //lower half
             else if( i < n)
             {
                 if(j == 1 || j==n/2 +1)
                 System.out.print("*\t");
                 else
                 System.out.print("\t");
             }
             
             
             //last row
             else
             {
                 if(j==1 || j > n/2)
                 System.out.print("*\t");
                 else
                 System.out.print("\t");
             }
         }
         System.out.println();
     }

 }
    
    
}
