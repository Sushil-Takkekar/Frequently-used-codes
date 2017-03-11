import java.io.*;
import java.util.*;

public class Solution {
 //   public static int arr[];
  //  public static int b[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            int b[] = new int[n];
            int max=-100000,max_non=-100000,sum_non=0,sum=-100000,cnt=0;
            for(int j=0;j<n;j++)
            {
                arr[j] = sc.nextInt();
                if(arr[j]>0){   sum_non += arr[j];  }else{  cnt++;  }
            }
            for(int j=0;j<n;j++)
            {
                if(j==0){   b[j]=arr[j];    }
                else{   sum = arr[j] + b[j-1];    }
                if(arr[j]>sum){   b[j]=arr[j];   }
                else{  b[j]=sum;   }
                if(b[j]>max){   max=b[j];   }
            }
            if(cnt==n){ sum_non=max;    }
            System.out.println(max+" "+sum_non);
        }    
    }// end of main
}