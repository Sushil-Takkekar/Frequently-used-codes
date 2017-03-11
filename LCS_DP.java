import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LCS_DP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int LCS[][] ;
        int l1,l2;
        Stack stk = new Stack();
        
        int A[] = new int[100];
        int B[] = new int[100];
        if(n<m)
        {    
            l1=n+1;l2=m+1;  
            for(int i=0;i<l1-1;i++)
            {
                A[i] = sc.nextInt();
            }    
            for(int i=0;i<l2-1;i++)
            {
                B[i] = sc.nextInt();
            }
        }
        else
        {   
            l1=m+1;l2=n+1;  
            for(int i=0;i<l2-1;i++)
            {
                B[i] = sc.nextInt();
            }
            for(int i=0;i<l1-1;i++)
            {
                A[i] = sc.nextInt();
            }    
        }
        LCS = new int[l1][l2];

        //show(LCS,l1,l2);
        /*****************************/
        int pre=0;
        for(int i=1;i<l1;i++)
        {
            //curr = A[i-1];
            for(int j=1;j<l2;j++)
            {
                if(A[i-1]==B[j-1])
                {
                   LCS[i][j] =  LCS[i-1][j-1]+1;
                   //System.out.println(i+"->"+A[i-1]+" "+j+"->"+B[j-1]);
                }    
                else
                {
                   LCS[i][j] = Math.max(LCS[i-1][j],LCS[i][j-1]);
                }    
            }
        }
        //show(LCS,l1,l2);
        //System.out.println(LCS[l1-1][l2-1]);
        int x=l1-1,y=l2-1;
        int curr = LCS[x][y];
        while(curr!=0)
        {
            while(curr == LCS[x][y-1])        
            {
                y--;
            }    
            stk.push(B[y-1]);
            x--;y--;
            curr = LCS[x][y]; 
        }
        //Iterator it = list.iterator();
        while(!stk.empty())
        {
            System.out.print(stk.pop()+" ");   
        }
    }
    public static void show(int[][] LCS,int l1,int l2)
    {
        for(int i=0;i<l1;i++)
        {
            for(int j=0;j<l2;j++)
            {
                System.out.print(LCS[i][j]+" ");   
            }
            System.out.println();
        }
        System.out.println();
    }
}