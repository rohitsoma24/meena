//create table producttable(productid number,proName varchar2(30),price number(9,2));
import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
public class Logic 
{
	public static void main(String[] args)
	{
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Criteria crit=ss.createCriteria(Product.class);
		Criterion cn=Restrictions.gt("price",new Double(15000.00));
			crit.add(cn);
		List li=crit.list();//this list() is in the criteria 
		System.out.println("the total no of elements are "+li.size());

		Iterator it=li.iterator();
		while(it.hasNext())
		{
		Product p=(Product)it.next();
		System.out.println(p.getProductid());
		System.out.println(p.getProName());
		System.out.println(p.getPrice());
		}

		ss.close();
		sf.close();
		}}	
	

