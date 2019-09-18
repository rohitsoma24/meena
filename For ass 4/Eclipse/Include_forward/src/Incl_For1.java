
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Incl_For1")
public class Incl_For1 extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	try {
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		pw.println("This is example of include");
		RequestDispatcher rd=req.getRequestDispatcher("Incl_For2");
		//rd.forward(req, res);
		rd.include(req, res);
		pw.close();
		
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
			}

}
