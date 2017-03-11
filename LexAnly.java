/* Lexical analysis -sk */

import java.util.*;
import java.io.*;

class LexAnly{
public static void main(String args[]) {
int i,strlen,j=0,k=0;
Scanner sc=new Scanner(System.in);
char operator[]=new char[100];
String identify1[]=new String[100];
char a,b,c;
String ipstring,tmp="";
int flag=1;
System.out.println("\n Enter the statement:");
ipstring=sc.next();
strlen=ipstring.length();
for(i=0;iif(( ipstring.charAt(i)=='+')||( ipstring.charAt(i)=='/')||( ipstring.charAt(i)=='*')||( ipstring.charAt(i)=='-' )|| ( ipstring.charAt(i)=='=') ||( ipstring.charAt(i)=='%')) {
operator[j]= ipstring.charAt(i);
j++;
flag=0;
identify1[k]= tmp;
k++;
tmp="";
}
else {
if(flag==1)
{
tmp=tmp+ipstring.charAt(i);

}
else { tmp=""+ipstring.charAt(i);flag=1;
//identify1[k]= tmp;
//k++;
}
}
}
if(tmp!="")
{
identify1[k]= tmp;
}
System.out.println("\n The identifiers in the expression are:");
for(i=0;iSystem.out.println(identify1[i]);
}
System.out.println("\n The operators in the expression are:");
for(i=0;iSystem.out.println(operator[i]);
}
}
}