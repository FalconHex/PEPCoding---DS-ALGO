import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    
    //creating 1st array and taking numbers
    int n1 = sc.nextInt();
    int [] a1 = new int[n1];
    for(int i=0; i< a1.length; i++)
    {
        a1[i] = sc.nextInt();
    }
    
    //creating 2nd array and taking numbers
    int n2 = sc.nextInt();
    int [] a2 = new int[n2];
    for(int i=0; i< a2.length; i++)
    {
        a2[i] = sc.nextInt();
    }
    
    
    //initializing result array which would be of size: which ever is bigger
    //used ternary operator: condition ? (true then) : (false then)
    int [] sum = new int[n1>n2? n1:n2];
    
   
    
    
    //carry variable
    int c=0;
    
    //varaiable for array n1
    int i = a1.length - 1;
    
    //variable of array n2
    int j = a2.length - 1;
    
    //variable for array sum
    int k = sum.length - 1;
    
    
    //till array sum's index is not -1
    while(k >=0)
    {
        //variable d to store result
        int d=c;
        
        //till array n1's index is not -1
        if(i >=0)
        {
            d= d+a1[i];
        }
        
        //till array n2's index is not -1
        if(j >=0)
        {
            d= d+a2[j];
        }
        
        
        //finding carry value
        c = d/10;
        
        //finding result value 
        d = d%10;
        
        //storing in result array at correct position
        sum[k] = d;
        
        
        //changinng all the array to next position
        i--;
        j--;
        k--;
    }
    
    
    //removing all the left hand 0s 
    if(c != 0)
    {
        System.out.println(c);
    }
    
    //this is how we can directly print value stored at an index of array
    for(int val: sum)
    {
        System.out.println(val);
    }
 }

}
