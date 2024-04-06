package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addflight_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("       <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\" crossorigin=\"anonymous\">\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4\" crossorigin=\"anonymous\"></script>\n");
      out.write("<link href=\"css/design.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("<style>\n");
      out.write("             .row{\n");
      out.write("  margin: auto;\n");
      out.write("  width: 900px;\n");
      out.write("  padding: 10px;\n");
      out.write("  height: 280px;\n");
      out.write("  opacity: 90%;\n");
      out.write("}\n");
      out.write("body{\n");
      out.write("                background-image: url(\"images/div10.1.jpg\");\n");
      out.write("                  background-size: cover;\n");
      out.write("  background-repeat: no-repeat;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand bg-dark\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <a class=\"navbar-brand \"><b>Get Set Go</b></a>\n");
      out.write("      <div class=\"collapse navbar-collapse justify-content-end \" id=\"navbarNav\" >\n");
      out.write("        <ul class=\"navbar-nav \">\n");
      out.write("          <li class=\"nav-item \">\n");
      out.write("            <li class=\"nav-item \">\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link active text-white\" href=\"admin.jsp\"><b>DashBoard</b></a>\n");
      out.write("          </li>\n");
      out.write("           <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link active text-danger\" href=\"addflight.jsp\"><b>Add Flights</b></a>\n");
      out.write("          </li>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("                    \n");
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
      out.write("       \n");
      out.write("        <section class=\"vh-100\">\n");
      out.write("  <div class=\"mask d-flex align-items-center h-100 \">\n");
      out.write("    <div class=\"container h-100\">\n");
      out.write("      <div class=\"row d-flex justify-content-center align-items-center h-100 bg-transparent  \">\n");
      out.write("        <div class=\"col-12 col-md-9 col-lg-7 col-xl-6 \">\n");
      out.write("          \n");
      out.write("            <div class=\"card-body p-4 bg-dark rounded-5\">\n");
      out.write("                <h2 class=\"text-uppercase text-center mb-5 text-white\"><b>Add New Flight</b></h2>\n");
      out.write("\n");
      out.write("                <form action=\"addflight1.jsp\" method=\"post\">\n");
      out.write("\n");
      out.write("                <div class=\"form-outline mb-4\">\n");
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
      out.write("                 \n");
      out.write("                <div class=\"d-flex justify-content-center\">\n");
      out.write("                  <button type=\"submit\"\n");
      out.write("                          class=\"btn btn-success btn-block btn-lg text-white\">Add</button>\n");
      out.write("                </div>\n");
      out.write("              </form>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("\n");
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
