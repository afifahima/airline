package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\" crossorigin=\"anonymous\">\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4\" crossorigin=\"anonymous\"></script>\n");
      out.write("<link href=\"css/design.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("<style>\n");
      out.write("    .lab{\n");
      out.write("        font-style: oblique;\n");
      out.write("        color:black;\n");
      out.write("        padding-left: 60px;\n");
      out.write("       \n");
      out.write("    }\n");
      out.write("    #datt{\n");
      out.write("       padding-left: 20px;   \n");
      out.write("    }\n");
      out.write("    .row{\n");
      out.write("  margin: auto;\n");
      out.write("  width: 700px;\n");
      out.write("  padding: 10px;\n");
      out.write("  height: 280px;\n");
      out.write("  opacity: 90%;\n");
      out.write("}\n");
      out.write(".col-md-4{\n");
      out.write("    padding-left: 60px;\n");
      out.write("}\n");
      out.write("#kavi1{\n");
      out.write("   margin-left: 20px;\n");
      out.write("}\n");
      out.write("#kavi3{\n");
      out.write("    margin-left: 200px;\n");
      out.write("}\n");
      out.write(".form-label{\n");
      out.write("    padding-left: 100px;\n");
      out.write("}\n");
      out.write(".btn-primary{\n");
      out.write("    margin-left: 280px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("          <nav class=\"navbar navbar-expand\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <a class=\"navbar-brand\"><b>Get Set Go</b></a>\n");
      out.write("      <div class=\"collapse navbar-collapse justify-content-end \" id=\"navbarNav\" >\n");
      out.write("        <ul class=\"navbar-nav \">\n");
      out.write("          <li class=\"nav-item \">\n");
      out.write("            <li class=\"nav-item \">\n");
      out.write("            <a class=\"nav-link active text-white\"><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"17\" height=\"17\" fill=\"currentColor\" class=\"bi bi-telephone\" viewBox=\"0 0 16 16\">\n");
      out.write("  <path d=\"M3.654 1.328a.678.678 0 0 0-1.015-.063L1.605 2.3c-.483.484-.661 1.169-.45 1.77a17.568 17.568 0 0 0 4.168 6.608 17.569 17.569 0 0 0 6.608 4.168c.601.211 1.286.033 1.77-.45l1.034-1.034a.678.678 0 0 0-.063-1.015l-2.307-1.794a.678.678 0 0 0-.58-.122l-2.19.547a1.745 1.745 0 0 1-1.657-.459L5.482 8.062a1.745 1.745 0 0 1-.46-1.657l.548-2.19a.678.678 0 0 0-.122-.58L3.654 1.328zM1.884.511a1.745 1.745 0 0 1 2.612.163L6.29 2.98c.329.423.445.974.315 1.494l-.547 2.19a.678.678 0 0 0 .178.643l2.457 2.457a.678.678 0 0 0 .644.178l2.189-.547a1.745 1.745 0 0 1 1.494.315l2.306 1.794c.829.645.905 1.87.163 2.611l-1.034 1.034c-.74.74-1.846 1.065-2.877.702a18.634 18.634 0 0 1-7.01-4.42 18.634 18.634 0 0 1-4.42-7.009c-.362-1.03-.037-2.137.703-2.877L1.885.511z\"/>\n");
      out.write("</svg><b> +91-11-40845858</b></a>\n");
      out.write("          </li>\n");
      out.write("            <a class=\"nav-link active text-danger\" aria-current=\"page\" href=\"index.jsp\"><b>Home</b></a>\n");
      out.write("          </li>\n");
      out.write("\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link active text-white\" href=\"Login.jsp\"><b>Login</b></a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link active text-white\" href=\"signup.jsp\"><b>Sign Up</b></a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link active text-white\" href=\"aboutus.jsp\"><b>About Us</b></a>\n");
      out.write("          </li>\n");
      out.write("      \n");
      out.write("         \n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("\n");
      out.write("  <div id=\"carouselExampleInterval\" class=\"carousel slide\" data-bs-ride=\"carousel\">\n");
      out.write("    <div class=\"carousel-indicators\">\n");
      out.write("    <button type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide-to=\"0\" class=\"active\" aria-current=\"true\" aria-label=\"Slide 1\"></button>\n");
      out.write("    <button type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide-to=\"1\" aria-label=\"Slide 2\"></button>\n");
      out.write("    <button type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide-to=\"2\" aria-label=\"Slide 3\"></button>\n");
      out.write("  </div>\n");
      out.write("    <div class=\"carousel-inner\">\n");
      out.write("      <div class=\"carousel-item active\" data-bs-interval=\"2000\">\n");
      out.write("          <img src=\"div1.1.jpg\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("      </div>\n");
      out.write("      <div class=\"carousel-item\" data-bs-interval=\"2000\">\n");
      out.write("          <img src=\"div1.2.jpg\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("      </div>\n");
      out.write("      <div class=\"carousel-item\">\n");
      out.write("          <img src=\"div1.3.jpg\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <button class=\"carousel-control-prev\" type=\"button\" data-bs-target=\"#carouselExampleInterval\" data-bs-slide=\"prev\">\n");
      out.write("      <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("    \n");
      out.write("    </button>\n");
      out.write("    <button class=\"carousel-control-next\" type=\"button\" data-bs-target=\"#carouselExampleInterval\" data-bs-slide=\"next\">\n");
      out.write("      <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("   \n");
      out.write("    </button>\n");
      out.write("  </div>\n");
      out.write(" \n");
      out.write("  <form class=\"row g-3 needs-validation shadow-lg p-3 mb-5 bg-secondary rounded\" action=\"search.jsp\" method=\"post\">\n");
      out.write("    <div class=\"col-md-12\">\n");
      out.write("        <label class=\"lab\"><h3><b> Welcome to GET SET GO Airline Services</b></h3></label>\n");
      out.write("      </div>\n");
      out.write("    <div class=\"col-md-5 position-relative\" id=\"kavi1\">\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"validationTooltip01\" placeholder=\"From\" name=\"From_City\" required>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("    <span class=\"col-md-1 btn float-right\" >\n");
      out.write("      <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-arrow-left-right\" viewBox=\"0 0 16 16\">\n");
      out.write("        <path fill-rule=\"evenodd\" d=\"M1 11.5a.5.5 0 0 0 .5.5h11.793l-3.147 3.146a.5.5 0 0 0 .708.708l4-4a.5.5 0 0 0 0-.708l-4-4a.5.5 0 0 0-.708.708L13.293 11H1.5a.5.5 0 0 0-.5.5zm14-7a.5.5 0 0 1-.5.5H2.707l3.147 3.146a.5.5 0 1 1-.708.708l-4-4a.5.5 0 0 1 0-.708l4-4a.5.5 0 1 1 .708.708L2.707 4H14.5a.5.5 0 0 1 .5.5z\"/>\n");
      out.write("      </svg>\n");
      out.write("  </span>\n");
      out.write("    <div class=\"col-md-5 position-relative\" id=\"kavi2\">\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"validationTooltip02\" placeholder=\"To\" name=\"To_City\" required>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-md-5 position-relative\" id=\"kavi3\">\n");
      out.write("      <label for=\"validationTooltip05\" class=\"form-label\"><b>Date</b></label>\n");
      out.write("      <input type=\"date\" class=\"form-control\" id=\"validationTooltip03\" name=\"Date\" required>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write(" \n");
      out.write("   \n");
      out.write("    <div class=\"col-6 \">\n");
      out.write("      <button class=\"btn btn-primary \" type=\"submit\">Search</button>\n");
      out.write("    </div>\n");
      out.write("  </form>\n");
      out.write("<div class=\"card-group\">\n");
      out.write("  <div class=\"card\">\n");
      out.write("      <img src=\"images/div2.1.jpg\" class=\"card-img-top\" alt=\"...\">\n");
      out.write("    <div class=\"card-body\">\n");
      out.write("        <h5 class=\"card-title\"><b>New Schedule. More Flights for You</b></h5>\n");
      out.write("        -----------------------------------------------------------\n");
      out.write("      <p class=\"card-text\">Get ready for more comfort, choice<br> and convenience as <b>GETSETGO</b> introduces the new flights </p>\n");
      out.write("    \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"card\">\n");
      out.write("      <img src=\"div2.2.jpg\" class=\"card-img-top\" alt=\"...\">\n");
      out.write("    <div class=\"card-body\">\n");
      out.write("        <h5 class=\"card-title\"><b>COVID-19 Updates</b></h5>\n");
      out.write("        -----------------------------------------------------------\n");
      out.write("      <p class=\"card-text\">Helpline for COVID-19 : Phone Number (24X7)  011-24300666<br><br>\n");
      out.write("          Email id : support.covid19-boi[at]gov.in</p>\n");
      out.write(" \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"card\">\n");
      out.write("      <img src=\"div2.3.jpg\" class=\"card-img-top\" alt=\"...\">\n");
      out.write("    <div class=\"card-body\">\n");
      out.write("        <h5 class=\"card-title\"><b>Bid.Fly.Enjoy!</b></h5>\n");
      out.write("      -----------------------------------------------------------\n");
      out.write("      <p class=\"card-text \">You are now just one bid away from travelling in Air India's Business or First class</p>\n");
      out.write("   \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("        <img src=\"images/div3.1.jpg\" class=\"img-fluid\" alt=\"...\">\n");
      out.write("        \n");
      out.write("   \n");
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
