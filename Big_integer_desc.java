import java.util.*;
import java.math.*;

public class Big_integer_desc {

    public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int list_pos[]=new int[n];
		String s[]=new String[n];
		BigDecimal b1[]=new BigDecimal[n];	
		List<BigDecimal> list = new ArrayList<BigDecimal>();
		for(int i=0;i<n;i++)
		{
			s[i]=sc.next();
			list.add(new BigDecimal(s[i]));
			b1[i]=new BigDecimal(s[i]);
		}		
		Collections.sort(list,Collections.reverseOrder());
		for(int i=0;i<n;i++)
		{
			
			for(int j=0;j<n;j++)
			{
				if(b1[j].toString().equals(list.get(i).toString()) && list_pos[i-1]!=j)
				{
					list_pos[i]=j;
					break;
				}
			}
		}
		String s1[]=new String[n];
		for(int i=0;i<n;i++)
		{
			int pos=list_pos[i];
			s1[i]=s[pos];
			System.out.println(s1[i]);
		}
    }//end of main
}  