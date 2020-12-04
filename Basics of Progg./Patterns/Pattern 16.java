import java.util.*;


public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     int n =scn.nextInt();
     
     int sp = (n*2)-3;
     int st = 1;
     int val =1;
     for(int i=1; i<=n; i++)
     {
         for(int j=1; j<=st; j++)
         {
             System.out.print(val+"\t");
             val++;
         }
         
         for(int k=1; k<=sp; k++)
         {
             System.out.print("\t");
         }
        
        
         if (i==n)
         {
             st--;
             val--;
         }
         for(int l=1; l<=st; l++)
         {
             val--;
             System.out.print(val+"\t");
         }
         System.out.println();
         
         
         st++; 
         sp = sp-2;
     }

 }
}
