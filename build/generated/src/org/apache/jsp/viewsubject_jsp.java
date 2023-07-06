package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import Controllers.subject;

public final class viewsubject_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title>Bootstrap demo</title>\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ\" crossorigin=\"anonymous\">\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <h1>Hello, world!</h1>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe\" crossorigin=\"anonymous\"></script>\n");
      out.write("  \n");
      out.write("  <table class=\"table\">\n");
      out.write("  \n");
      out.write("     \n");
      out.write("      <thead>\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"col\">dfgd</th>\n");
      out.write("      <th scope=\"col\">First</th>\n");
      out.write("      <th scope=\"col\">Last</th>\n");
      out.write("      <th scope=\"col\">Handle</th>\n");
      out.write("    </tr>\n");
      out.write("  </thead>\n");
      out.write("    \n");
      out.write("            \n");
      out.write("      <tbody>    \n");
      out.write("          \n");
      out.write("           ");
 
                // Retrieve the studentList from the request attribute
                List<subject> studentList = (List<subject>) request.getAttribute("studentList");
                
                // Iterate over the studentList and display the records in the table
                for (subject newstudent : studentList) {
            
      out.write("\n");
      out.write("            \n");
      out.write("    <tr>\n");
      out.write("       <td class=\"px-6 py-4\">\n");
      out.write("                    ");
      out.print( newstudent.getId() );
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td class=\"px-6 py-4\">\n");
      out.write("                   ");
      out.print( newstudent.getName() );
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td class=\"px-6 py-4\">\n");
      out.write("                    ");
      out.print( newstudent.getCredit() );
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td class=\"px-6 py-4\">\n");
      out.write("                    ");
      out.print( newstudent.getLec() );
      out.write("\n");
      out.write("                </td>\n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("    ");
 
                }
            
      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("    \n");
      out.write("  </tbody>\n");
      out.write("</table>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  </body>\n");
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
