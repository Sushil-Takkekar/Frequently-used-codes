
import java.util.*;
class LCM_GCD {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int max = 0;
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
            if(a[i]>max)
            {
                max = a[i];
            }
        }
        boolean flag = false;
        int x = max;
        while(true)
        {
            for(int i=0;i<n;i++)
            {
                if(max % a[i] == 0)
                {
                    flag = true;
                }else{  flag = false;break;    }
            }
            if(flag == false)
            {
                max += x;
            }else{  
                break;  }
        }
        System.out.println("LCM -> "+max);
        
        int n1 = a[0];
        for(int i=1;i<n;i++)
        {
            n1 = gcd(n1,a[i]);
        }
        System.out.println("GCD -> "+n1);
        // String s1 = "sushil";
        // String s2 = "sushil";
        // if(s1 == s2){   System.out.println("Yes"); }
    }
    public static int gcd(int n1, int n2)
    {
        if(n2==0){  return n1;  }
        return gcd(n2, n1%n2);
    }
}
