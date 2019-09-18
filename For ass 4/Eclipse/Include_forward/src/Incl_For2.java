

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 * Servlet implementation class Incl_For
 */
@WebServlet("/Incl_For2")
public class Incl_For2 extends HttpServlet {
		protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
			try
			{
				res.setContentType("text/html");
				PrintWriter pw=res.getWriter();
				String s=req.getParameter("t1");
				String t=req.getParameter("t1");
				pw.println("The username is "+s);
				pw.println("The password is "+t);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
	}

}
