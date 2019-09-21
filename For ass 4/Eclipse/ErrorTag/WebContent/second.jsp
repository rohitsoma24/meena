<%@page errorPage="error.jsp"%>

<%int age;%>
    <%
String a=request.getParameter("n1");
    age=Integer.parseInt(a);
    out.println("the age is"+age);
  
    %>