/* IMPORTANT: Multiple classes and nested static classes are supported */
 
/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
Problem Statement: The problem initially has N strings numbered 1 to N. The program has to answer Q queries. Each query is of the form l r S. For each query, the program has to print the number of times the string S appears in the range [l,r].Help me by solving the problem!!

*/
import java.util.*;
 
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashMap m = new HashMap();
        ArrayList list[] = new ArrayList[N];
        String tmp;
        int k = -1,val=0;
        for (int i = 0; i < N; i++) {
            tmp = sc.next();
            if(!m.containsKey(tmp))
            {
                m.put(tmp,++k);
                list[k] = new ArrayList();
                list[k].add(i);
            }
            else
            {
                val = (int)m.get(tmp);
                list[val].add(i);
            }
        }
        int Q = sc.nextInt();
        for (int i = 0; i < Q; i++)
        {
            int L = sc.nextInt()-1;
            int R = sc.nextInt()-1;
            String str = sc.next();
            if(!m.containsKey(str))
            {
                System.out.println("0");
            }
            else
            {
                val = (int)m.get(str);
                int len = list[val].size();
                int count = 0;
                for(int j=0;j<len;j++)
                {
                    if((int)list[val].get(j)>=L && (int)list[val].get(j)<=R)
                    {
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
        //System.out.println("Hello World!");
    }
}