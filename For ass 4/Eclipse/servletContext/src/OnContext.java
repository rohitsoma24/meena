import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class OnContext extends HttpServlet
{
public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
PrintWriter pw=res.getWriter();
res.setContentType("text/html");
ServletContext context=getServletContext();
String s1=context.getInitParameter("n1");
String s2=context.getInitParameter("n2");
pw.println("n1 value is " +s1+ " and n2 is " +s2);
}
} 