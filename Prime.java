import java.util.*;

class Prime {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isPrime(n));
        System.out.println(countPrime(n));
    }
    public static int countPrime(int n){
        int arr[] = new int[n+1];
        int count = 0;
        for(int i=2;i<=n;i++)
        {
            if(arr[i]==0)
            {
                count++;
                int x = 1, pos = 1;
                pos = i * x;
                while(pos <= n)
                {
                    arr[pos] = 1;
                    x++;
                    pos = i * x;
                }   
            } 
        }
        return count;
    }
    public static boolean isPrime(int n){
        if(n < 2) return false;
        if(n == 2 || n == 3) return true;
        if(n%2 == 0 || n%3 == 0) return false;
        long sqrtN = (long)Math.sqrt(n)+1;
        for(long i = 6L; i <= sqrtN; i += 6) {
            if(n%(i-1) == 0 || n%(i+1) == 0) return false;
        }
        return true;   
    }
}
