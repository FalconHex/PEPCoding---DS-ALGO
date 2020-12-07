import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    
    //creating and taking elem in array 1
    int n1 = sc.nextInt();
    int [] a1 = new int[n1];
    for(int i=0; i < a1.length; i++)
    {
      a1[i] = sc.nextInt(); 
    }
    
    
    //creating and takiing elem in array 2
    int n2 = sc.nextInt();
    int [] a2 = new int[n2];
    for(int i=0; i < a2.length; i++)
    {
      a2[i] = sc.nextInt(); 
    }
    
    //creating an array to store answer of size that of 2nd array
    int [] diff = new int[n2];
    
    //variable for carry
    int c=0;
    
    //variable for array a1
    int i = a1.length -1;
    
    //variable for array a2 
    int j = a2.length -1;
    
    //variable for array diff 
    int k = diff.length -1;
    
    //till index of array diff is not -1
    while(k >= 0)
    {
        //variable to store result
        int d =0;
        
        //cheking if array a1 is finished if yes then considering it to be 0
        int a1v = i>=0? a1[i] : 0;
        
        //if elem of array a2 after dealing with carry is still bigger than that of a2's
        //normal subtraction takes place => carry is 0
        if(a2[j]+c >= a1v)
        {
            d = a2[j]+c - a1v;
            c=0;
        }
        
        //ootherwise carry is made -1 and 10 is added to current elem of a1
        else
        {
            d = a2[j]+c+10 - a1v;
            c= -1;
        }
        
        //reult stored in array diff
        diff[k] = d;
        
        //positions set to text elem of each array
        i--;
        j--;
        k--;
        
    }
    
    //settinf a new var for index as 0
    int idx = 0;
    
    //removing all the left hand 0s
    while(idx < diff.length)
    {
        if(diff[idx] == 0)
        {
            idx++;
        }
        else
        {
            break;
        }
    }
    // by this all left hand 0s are removed
    
    //printing resut
    while(idx < diff.length)
    {
        System.out.println(diff[idx]);
        idx++;
        
    }
    
 }

}
