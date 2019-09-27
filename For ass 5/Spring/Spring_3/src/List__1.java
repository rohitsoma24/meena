import java.util.*;

public class List__1 {
String name;
List <String> Hello;
public List__1(String name, List<String> hello) {
	this.name = name;
	Hello = hello;
}

public void display()
{
	System.out.println("The name is "+name);
	Iterator<String> it=Hello.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
}
}
