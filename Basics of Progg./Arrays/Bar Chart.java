import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] arr = new int[n];
    
    //taking inputs
    for(int i=0; i<n; i++)
    {
        arr[i] = sc.nextInt();
    }
    
    //finding max element
    int max =arr[0];
    for(int i=0; i<n; i++)
    {
        if(arr[i]>max)
        max=arr[i];
    }
    
    
    //running a decrement loop from max to 0
    for(int floor = max; floor > 0; floor--)
    {
        //checking each value in arr
        for(int j=0; j<n; j++)
        {
            
            //if the value is greater than or equal to that of current floor print *
            if(arr[j] >= floor)
            System.out.print("*\t");
            
            else
            System.out.print("\t");
        }
        
        System.out.println();
        
        
    }
    
    
 }

}
