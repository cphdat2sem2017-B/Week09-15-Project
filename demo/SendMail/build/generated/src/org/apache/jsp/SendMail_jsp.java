package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SendMail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                font-family: Verdana;\n");
      out.write("            }\n");
      out.write("            .bluebox{\n");
      out.write("                border: 2px solid blue;\n");
      out.write("                padding: 5px;\n");
      out.write("                margin-left: 10px;\n");
      out.write("                width: 300px;\n");
      out.write("                height: 500px;\n");
      out.write("                float: left;\n");
      out.write("            }\n");
      out.write("            textarea {\n");
      out.write("                width: 290px;\n");
      out.write("                height: 400px;\n");
      out.write("            }\n");
      out.write("            input{\n");
      out.write("                width: 290px;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>        \n");
      out.write("            Send an email\n");
      out.write("        </h1> \n");
      out.write("        <div class=\"bluebox\"><p>In order to send an email from a java program it is necessary to have an SMTP mail \n");
      out.write("                server running. It is possible to install an smtp server locally, \n");
      out.write("                but it is a lot easier to use an online mail server from companies like \n");
      out.write("                google or yahoo. In this example I have created a google account \n");
      out.write("                just for sending mails.<br><br>The account is: \n");
      out.write("                datamatikermail@gmail.com<br>with password: \n");
      out.write("                datamatikermail123<br><br>In this form we can enter a recipient a \n");
      out.write("                title and a message to send an email from this google account. \n");
      out.write("                The sender is hardcoded into the service.SendMail.java file</p>\n");
      out.write("            <p>The project contains a folder called: dependencies that contains the 2 necessary jar files\n");
      out.write("                <br>These are also added to the project properties library jars.</p></div>\n");
      out.write("        <div class=\"bluebox\"><form action=\"SendMail\" method=\"POST\">\n");
      out.write("                <!--<input type=\"text\" name=\"from\" value=\"\" placeholder=\"from\"/>-->\n");
      out.write("                <input type=\"text\" name=\"to\" value=\"\" placeholder=\"send to\"/>\n");
      out.write("                <input type=\"text\" name=\"title\" value=\"\" placeholder=\"title\"/>\n");
      out.write("                <textarea type=\"text\" name=\"body\" value=\"\" placeholder=\"message body\"></textarea>\n");
      out.write("                <input type=\"submit\" value=\"Send email\" name=\"submit\" />\n");
      out.write("            </form></div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
