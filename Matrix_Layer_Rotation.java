import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Matrix_Layer_Rotation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int r = sc.nextInt();
        int a[][] = new int[m][n];
        int tmp1=0,tmp2=0,p,q,e;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        int z = ((m-1)*2)+((n-1)*2);
        int x = r%z;
        p = m;q = n;e=0;
        int inner_loops = Math.min(m, n) / 2;
        //System.out.println(inner_loops);
        for(int y=0;y<inner_loops;y++)    //move to inner loop
        {
            for(int R=0;R<x;R++)
            {    
                tmp1 = a[p-1][q-1];
                for(int k=p-1;k>=y+1;k--)
                {
                    //tmp2 = a[k][n-1];
                    tmp2 = tmp1;
                    tmp1 = a[k-1][q-1];
                    a[k-1][q-1] = tmp2;
                }
                for(int k=q-1;k>=y+1;k--)
                {
                    tmp2 = tmp1;
                    tmp1 = a[y][k-1];
                    a[y][k-1] = tmp2;
                }

                for(int k=y;k<=p-2;k++)
                {
                    tmp2 = tmp1;
                    tmp1 = a[k+1][y];
                    a[k+1][y] = tmp2;
                }
                for(int k=y;k<=q-2;k++)
                {
                    tmp2 = tmp1;
                    tmp1 = a[p-1][k+1];
                    a[p-1][k+1] = tmp2;
                }
            }
            e++;
            
            p = p-1;
            q = q-1;
            if((p-e)==1 || (q-e)==1)
            {   x=0;    }
            else
            {   z = ((p-1-e)*2)+((q-1-e)*2);
                //System.out.println("\t"+x+"\t"+z);
                if(z!=0){   x = r%z; }
                else{   x=0;    }
            }
        }
/*************** Print matrix ****************/
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
    }// end of main
}