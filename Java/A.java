import java.util.*;
public class A
{
int rollno;
String name;
void input()
{
Scanner S=new Scanner(System.in);
System.out.println("Enter Roll no");
rollno=S.nextInt();
System.out.println("Enter Name");
name=S.next();
}
void output()
{
System.out.println("The roll no is "+rollno);
System.out.println("The roll no is "+name);
}
public static void main(String args[])

{
A b=new A();
b.input();
b.output();
}




}





