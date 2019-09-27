import org.springframework.beans.factory.*;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;  

public class Stud {
public static void main(String Args[])
{
	Resource resource=new ClassPathResource("stu.xml");
	BeanFactory factory=new XmlBeanFactory(resource);
	Student_1 stu= (Student_1) factory.getBean("obj");
	/*stu.display();
	stu.total();
	stu.average();*/
	System.out.println(stu);
}
}
