package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/2.2.4/jquery.min.js\"></script>\n");
      out.write("<!------ Include the above in your HEAD tag ---------->\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("\n");
      out.write("  <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("<!------ Include the above in your HEAD tag ---------->\n");
      out.write("  </head>\n");
      out.write("<body id=\"LoginForm\">\n");
      out.write("<div class=\"container\">\n");
      out.write("<h1 class=\"form-heading\">login Form</h1>\n");
      out.write("<div class=\"login-form\">\n");
      out.write("<div class=\"main-div\">\n");
      out.write("    <div class=\"panel\">\n");
      out.write("   <h2>Admin Login</h2>\n");
      out.write("   <p>Please enter your email and password</p>\n");
      out.write("   </div>\n");
      out.write("    <form id=\"Login\">\n");
      out.write("\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <input type=\"email\" class=\"form-control\" id=\"inputEmail\" placeholder=\"Email Address\">\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("\n");
      out.write("            <input type=\"password\" class=\"form-control\" id=\"inputPassword\" placeholder=\"Password\">\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"forgot\">\n");
      out.write("        <a href=\"reset.html\">Forgot password?</a>\n");
      out.write("</div>\n");
      out.write("        <button type=\"submit\" class=\"btn btn-primary\">Login</button>\n");
      out.write("\n");
      out.write("    </form>\n");
      out.write("    </div>\n");
      out.write("<p class=\"botto-text\"> Designed by Sunil Rajput</p>\n");
      out.write("</div></div></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
