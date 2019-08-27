import java.util.*;
import java.io.*;
public class B
{
int rollno,m1,m2,m3,tot,avg;
String name,address;
void input() throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
Scanner S=new Scanner(System.in);
System.out.println("Enter Roll no,name,address and 3 subject marks");
rollno=S.nextInt();
name=br.readLine();
address=br.readLine();
m1=S.nextInt();
m2=S.nextInt();
m3=S.nextInt();
tot=m1+m2+m3;
avg=tot/3;
}
void output()
{
System.out.println("The total is "+tot);
System.out.println("The average is "+avg);
}
public static void main(String args[]) throws IOException

{
B b=new B();
b.input();
b.output();
}




}





