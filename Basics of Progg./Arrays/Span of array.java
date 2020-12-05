import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {

     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     
    //initializing an array named arr of size n 
     int [] arr = new int[n];
     
     //taking inputs in array
     for(int i=0; i < arr.length; i++ )
     {
         
         arr[i] = sc.nextInt();
         
     }
     
     //assuming biggest num to be the first value of arr
     int big = arr[0];
     
     //assuming smallest num to be the first value of arr
     int small = arr[0];
     
     
     //traversing array to find biggest and smallest num
     for(int j=0; j < arr.length; j++ )
     {
         
         if (arr[j] < small)
         small = arr[j];
         
         if(arr[j] > big)
         big = arr[j];
         
     }
     
     
      
     
     System.out.println(big-small);
 }

}
