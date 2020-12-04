import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    public static int getDigitFrequency(int n, int d) {
        int freq =0;
        while(n>0)
        {
            int num = n%10;
            if(num==d)
            freq++;
            
            n= n/10;
        }
        return freq;
    }
}
