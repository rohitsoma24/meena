import java.util.*;
import java.lang.*;

public class Great
{
	public static void main(String args[])
	{
		Scanner S=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter a :");
		a=S.nextInt();
	
		System.out.println("Enter b :");
		b=S.nextInt();
		
		System.out.println("Enter c :");
		c=S.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("A is greater");
		}
		else if(b>a && b>c)
		{
			System.out.println("B is greater");
		}	
		else
		{
			System.out.println("C is greater");
		}
	}
}