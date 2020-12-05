import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] arr = new int[n];
    int temp =-1;
    
    
    for(int i=0; i<n; i++)
    {
        arr[i] = sc.nextInt();
    }
    
    int d = sc.nextInt();
    
     for(int i=0; i<n; i++)
    {
        if(arr[i] == d)
        temp = i;
    }
    
    System.out.println(temp);
    
    
 }

}
