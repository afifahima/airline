package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class account_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\" crossorigin=\"anonymous\">\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("        <link href=\"css/design.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("                <style>\n");
      out.write("                    body{\n");
      out.write("                        background-image: url(\"images/div7.1.jpg\");\n");
      out.write("                        background: cover;\n");
      out.write("                    }\n");
      out.write("            .login-container{\n");
      out.write("   margin:auto;\n");
      out.write("   padding-right: 50px;\n");
      out.write("}\n");
      out.write(".login-logo{\n");
      out.write("    position: relative;\n");
      out.write("    margin-left: -41.5%;\n");
      out.write("}\n");
      out.write(".login-logo img{\n");
      out.write("    position: absolute;\n");
      out.write("    width: 20%;\n");
      out.write("    margin-top: 19%;\n");
      out.write("    background: #282726;\n");
      out.write("    border-radius: 4.5rem;\n");
      out.write("    padding: 5%;\n");
      out.write("}\n");
      out.write(".login-form-1{\n");
      out.write("    \n");
      out.write("    padding: 9%;\n");
      out.write("    background:#282726;\n");
      out.write("    box-shadow: 0 5px 8px 0 rgba(0, 0, 0, 0.2), 0 9px 26px 0 rgba(0, 0, 0, 0.19);\n");
      out.write("}\n");
      out.write(".login-form-1 h3{\n");
      out.write("    text-align: center;\n");
      out.write("    margin-bottom:12%;\n");
      out.write("    color:#fff;\n");
      out.write("}\n");
      out.write(".login-form-2{\n");
      out.write(" \n");
      out.write("    padding: 9%;\n");
      out.write("    background: #f05837;\n");
      out.write("    box-shadow: 0 5px 8px 0 rgba(0, 0, 0, 0.2), 0 9px 26px 0 rgba(0, 0, 0, 0.19);\n");
      out.write("}\n");
      out.write(".login-form-2 h3{\n");
      out.write("    text-align: center;\n");
      out.write("    margin-bottom:12%;\n");
      out.write("    color: #fff;\n");
      out.write("}\n");
      out.write(".btnSubmit{\n");
      out.write("    font-weight: 600;\n");
      out.write("    width: 50%;\n");
      out.write("    color: #282726;\n");
      out.write("    background-color: #fff;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 1.5rem;\n");
      out.write("    padding:2%;\n");
      out.write("}\n");
      out.write(".btnForgetPwd{\n");
      out.write("    color: #fff;\n");
      out.write("    font-weight: 600;\n");
      out.write("    text-decoration: none;\n");
      out.write("}\n");
      out.write(".btnForgetPwd:hover{\n");
      out.write("    text-decoration:none;\n");
      out.write("    color:#fff;\n");
      out.write("}\n");
      out.write("            </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <nav class=\"navbar navbar-expand bg-dark\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <a class=\"navbar-brand \"><b>Get Set Go</b></a>\n");
      out.write("      <div class=\"collapse navbar-collapse justify-content-end \" id=\"navbarNav\" >\n");
      out.write("        <ul class=\"navbar-nav \">\n");
      out.write("          <li class=\"nav-item \">\n");
      out.write("            <li class=\"nav-item \">\n");
      out.write("            <a class=\"nav-link active text-white\"><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"17\" height=\"17\" fill=\"currentColor\" class=\"bi bi-telephone\" viewBox=\"0 0 16 16\">\n");
      out.write("  <path d=\"M3.654 1.328a.678.678 0 0 0-1.015-.063L1.605 2.3c-.483.484-.661 1.169-.45 1.77a17.568 17.568 0 0 0 4.168 6.608 17.569 17.569 0 0 0 6.608 4.168c.601.211 1.286.033 1.77-.45l1.034-1.034a.678.678 0 0 0-.063-1.015l-2.307-1.794a.678.678 0 0 0-.58-.122l-2.19.547a1.745 1.745 0 0 1-1.657-.459L5.482 8.062a1.745 1.745 0 0 1-.46-1.657l.548-2.19a.678.678 0 0 0-.122-.58L3.654 1.328zM1.884.511a1.745 1.745 0 0 1 2.612.163L6.29 2.98c.329.423.445.974.315 1.494l-.547 2.19a.678.678 0 0 0 .178.643l2.457 2.457a.678.678 0 0 0 .644.178l2.189-.547a1.745 1.745 0 0 1 1.494.315l2.306 1.794c.829.645.905 1.87.163 2.611l-1.034 1.034c-.74.74-1.846 1.065-2.877.702a18.634 18.634 0 0 1-7.01-4.42 18.634 18.634 0 0 1-4.42-7.009c-.362-1.03-.037-2.137.703-2.877L1.885.511z\"/>\n");
      out.write("</svg><b> +91-11-40845858</b></a>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link active text-white\" href=\"main.jsp\"><b>DashBoard</b></a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link active text-white\" href=\"Allflights.jsp\"><b>All Flights</b></a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link active text-danger\" href=\"account.jsp\"><b>My Account</b></a>\n");
      out.write("          </li>\n");
      out.write("          \n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link active text-white\" href=\"bookticket.jsp\"><b>Book Ticket</b></a>\n");
      out.write("          </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link active text-white\" href=\"index.jsp\"><b>Logout</b></a>\n");
      out.write("          </li>\n");
      out.write("         \n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("        <form action=\"account1.jsp\">\n");
      out.write("<div class=\"container login-container mt-3\">\n");
      out.write("            <div class=\"row bg-transparent\" >\n");
      out.write("                <div class=\"col-md-6 login-form-1 \">\n");
      out.write("                    <h3>Address</h3>\n");
      out.write("                    \n");
      out.write("                        <div class=\"form-group mt-2\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Address line 1\" name=\"Address\" required />\n");
      out.write("                        </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"form-group mt-2\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"City\" name=\"City\" required />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group mt-2\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"State/Province\" name=\"State\" required />\n");
      out.write("                        </div>\n");
      out.write("                    <div class=\"form-group mt-2\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Zip/Postal code\" name=\"Zip\"  required/>\n");
      out.write("                        </div>\n");
      out.write("                    <div class=\"form-group mt-2\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Country\" name=\"Country\"  required/>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                    \n");
      out.write("                        \n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6 login-form-2 \">\n");
      out.write("                    <div class=\"login-logo\">\n");
      out.write("                        <img src=\"https://image.ibb.co/n7oTvU/logo_white.png\" alt=\"\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <h3>Details</h3>\n");
      out.write("                        <div class=\"form-group mt-2\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Name\" name=\"Name\"  required/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group mt-2\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Email\" name=\"Email\" required />\n");
      out.write("                        </div>\n");
      out.write("                    <div class=\"form-group mt-2\">\n");
      out.write("                            <input type=\"date\" class=\"form-control\" placeholder=\"DOB\" name=\"DOB\" required />\n");
      out.write("                        </div>\n");
      out.write("                    <div class=\"form-group mt-2\">\n");
      out.write("                        <input type=\"tel\" class=\"form-control\" placeholder=\"Contact No\" name=\"Contact\" required/>\n");
      out.write("                        </div>\n");
      out.write("                    <div class=\"form-check form-check-inline mt-2 \" >\n");
      out.write("                        <input class=\"form-check-input\" type=\"radio\" id=\"inlineRadio1\" value=\"Male\" name=\"Gender\"><b>Male</b>\n");
      out.write(" \n");
      out.write("</div>\n");
      out.write("<div class=\"form-check form-check-inline\">\n");
      out.write("    <input class=\"form-check-input\" type=\"radio\" id=\"inlineRadio2\" value=\"Female\" name=\"Gender\"><b>Female</b>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("                        <div class=\"form-group mt-3\">\n");
      out.write("                            <input type=\"submit\" class=\"btnSubmit\" value=\"Save\" />\n");
      out.write("                        </div>\n");
      out.write("                    \n");
      out.write("                        \n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
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
