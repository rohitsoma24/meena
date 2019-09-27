import org.springframework.beans.factory.*;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;  

public class List_main {
	public static void main(String Args[])
	{
		Resource resource=new ClassPathResource("lists.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		List__1 li= (List__1) factory.getBean("obj");
		li.display();
	}

}
