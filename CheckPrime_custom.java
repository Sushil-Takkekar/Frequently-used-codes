import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CheckPrime_custom {

    public static boolean isPrime(int n) {
        //if no is single digit
        if(n>=1 && n<10) {
            if(n==2 || n==3 || n==5 || n==7)
                return true;
            else
                return false;
        }
        //if no has more than one digit, take last digit
        int lastDigit = n%10;
        //if last digit is 2,4,5,6,8,0 then its not a prime no
        if(lastDigit==2 || lastDigit==4 || lastDigit==5 || lastDigit==6 || lastDigit==8 || lastDigit==0) {
            return false;   
        }else {
            int root = (int)Math.sqrt(n);
            for(int i=3; i<=root; i=i+2) 
            {
              if(n%i==0)
                  return false;
            } 
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPrime(n))
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}
