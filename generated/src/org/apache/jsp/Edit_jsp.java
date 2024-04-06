package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Edit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\" crossorigin=\"anonymous\">\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("        <link href=\"css/design.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("         <style>\n");
      out.write("        \n");
      out.write("        body{\n");
      out.write("                background-image: url(\"images/div10.1.jpg\");\n");
      out.write("                  background-size: cover;\n");
      out.write("  background-repeat: no-repeat;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("     <nav class=\"navbar navbar-expand bg-dark\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <a class=\"navbar-brand \"><b>Get Set Go</b></a>\n");
      out.write("      <div class=\"collapse navbar-collapse justify-content-end \" id=\"navbarNav\" >\n");
      out.write("        <ul class=\"navbar-nav \">\n");
      out.write("          <li class=\"nav-item \">\n");
      out.write("            <li class=\"nav-item \">\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link active text-white\" href=\"admin.jsp\"><b>DashBoard</b></a>\n");
      out.write("          </li>\n");
      out.write("           \n");
      out.write("           <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link active text-danger\" href=\"Edit.jsp\"><b>Edit Flights</b></a>\n");
      out.write("          </li>\n");
      out.write("           \n");
      out.write("\n");
      out.write("        \n");
      out.write("               \n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link active text-white\" href=\"index.jsp\"><b>Logout</b></a>\n");
      out.write("          </li>\n");
      out.write("         \n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("    \n");
      out.write("        \n");
      out.write("<div class=\"container\">\n");
      out.write("\t<div class=\"row justify-content-center bg-transparent\">\n");
      out.write("            \t\t<div class=\"col-md-7 col-lg-5 col-xl-5 offset-xl-1\">\n");
      out.write("              <div class=\"panel-body  p-4  \">\n");
      out.write("                <div class=\"text-center\">\n");
      out.write("                    <h2 class=\"text-center text-dark\"><b>Edit- Your Flights</b></h2>\n");
      out.write("               \n");
      out.write("                  <div class=\"panel-body\">\n");
      out.write("                    <form id=\"register-form\" role=\"form\" autocomplete=\"off\" class=\"form\" method=\"post\" action=\"Edit1.jsp\">\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                          <div class=\"form-outline mb-4\">\n");
      out.write("                    <input type=\"text\" id=\"form3Example1cg\" class=\"form-control form-control-lg\" placeholder=\"Flight_No\" name=\"Flight_No\" required/>\n");
      out.write("                  \n");
      out.write("                </div>\n");
      out.write("                     <div class=\"form-outline mb-4\">\n");
      out.write("                    <input type=\"text\" id=\"form3Example1cg\" class=\"form-control form-control-lg\" placeholder=\"Flight_Name\" name=\"Flight_Name\" required/>\n");
      out.write("                  \n");
      out.write("                </div>\n");
      out.write("                     <div class=\"form-outline mb-4\">\n");
      out.write("                    <input type=\"text\" id=\"form3Example1cg\" class=\"form-control form-control-lg\" placeholder=\"From_City\" name=\"From_City\" required/>\n");
      out.write("                  \n");
      out.write("                </div>\n");
      out.write("                     <div class=\"form-outline mb-4\">\n");
      out.write("                    <input type=\"text\" id=\"form3Example1cg\" class=\"form-control form-control-lg\" placeholder=\"To_City\" name=\"To_City\" required/>\n");
      out.write("                  \n");
      out.write("                </div>\n");
      out.write("                     <div class=\"form-outline mb-4\">\n");
      out.write("                         <input type=\"time\" id=\"form3Example1cg\" class=\"form-control form-control-lg\" placeholder=\"Departure_Time\" name=\"Departure_Time\" required/>\n");
      out.write("                  \n");
      out.write("                </div>\n");
      out.write("                     <div class=\"form-outline mb-4\">\n");
      out.write("                         <input type=\"time\" id=\"form3Example1cg\" class=\"form-control form-control-lg\" placeholder=\"Arrival_Time\" name=\"Arrival_Time\" required/>\n");
      out.write("                  \n");
      out.write("                </div>\n");
      out.write("                     <div class=\"form-outline mb-4\">\n");
      out.write("                         <input type=\"date\" id=\"form3Example1cg\" class=\"form-control form-control-lg\" placeholder=\"Date\" name=\"Date\" required/>\n");
      out.write("                  \n");
      out.write("                </div>\n");
      out.write("                     <div class=\"form-outline mb-4\">\n");
      out.write("                         <input type=\"number\" id=\"form3Example1cg\" class=\"form-control form-control-lg\" placeholder=\"Ticket_Price\" name=\"Ticket_Price\" required/>\n");
      out.write("                  \n");
      out.write("                </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                        <input name=\"recover-submit\" class=\"btn btn-lg btn-primary btn-block\" value=\"Done\" type=\"submit\">\n");
      out.write("                      </div>\n");
      out.write("                    \n");
      out.write("                    </form>\n");
      out.write("            \n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("      <label>Edit done based on Flight_NO and Flight_Name</label>\n");
      out.write("            \n");
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
