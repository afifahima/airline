package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class bookticket1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\" crossorigin=\"anonymous\">\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4\" crossorigin=\"anonymous\"></script>\n");
      out.write("<link href=\"css/design.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("     #tab{\n");
      out.write("         margin: auto;\n");
      out.write("         padding-left: 100px;\n");
      out.write("         \n");
      out.write("     }\n");
      out.write("          #tab1{\n");
      out.write("         margin: auto;\n");
      out.write("         padding-left: 100px;\n");
      out.write("         padding-top: 20px;\n");
      out.write("         \n");
      out.write("     }\n");
      out.write("     .hea{\n");
      out.write("         font-style: oblique;\n");
      out.write("     }\n");
      out.write("     .table{\n");
      out.write("         \n");
      out.write("         padding-top: 20px;\n");
      out.write("     }\n");
      out.write("     #sear{\n");
      out.write("         padding-left: 230px;\n");
      out.write("     }\n");
      out.write("     .lab{\n");
      out.write("         color: white;\n");
      out.write("        margin-left: 200px;\n");
      out.write("     }\n");
      out.write("     .pricetag{\n");
      out.write("         background-color: black;\n");
      out.write("         opacity: 90%;\n");
      out.write("         margin-left: 550px;\n");
      out.write("         margin-right: 400px;\n");
      out.write("         padding-left: 50px;\n");
      out.write("         padding-bottom: 20px;\n");
      out.write("         padding-top: 20px;\n");
      out.write("         color:white;\n");
      out.write("         font-size: larger;\n");
      out.write("         \n");
      out.write("     }\n");
      out.write("     body{\n");
      out.write("                background-image: url(\"images/div9.1.jpg\");\n");
      out.write("                  background-size: cover;\n");
      out.write("  background-repeat: no-repeat;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("   \n");
      out.write("    <body>\n");
      out.write("                                     <nav class=\"navbar navbar-expand bg-dark\">\n");
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
      out.write("             <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link active text-white\" href=\"Allflights.jsp\"><b>All Flights</b></a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link active text-white\" href=\"account.jsp\"><b>My Account</b></a>\n");
      out.write("          </li>\n");
      out.write("           <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link active text-danger\" href=\"bookticket.jsp\"><b>Book Ticket</b></a>\n");
      out.write("          </li>\n");
      out.write("          \n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link active text-white\" href=\"index.jsp\"><b>Logout</b></a>\n");
      out.write("          </li>\n");
      out.write("         \n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
    
            String Email=request.getParameter("Email");
              String username = (String)session.getAttribute("SessionUser"); 
              if(Email.equals(username)){
            String h="select * from details where Email='"+Email+"'";
            Class.forName("com.mysql.jdbc.Driver");
            Connection obj=DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","");
            Statement str=obj.createStatement();
            ResultSet j=str.executeQuery(h);
            if (j.next()){   
                
      out.write("\n");
      out.write("  <div class=\"container\" id=\"tab1\" >\n");
      out.write("<table class=\"table table-bordered  table-dark table-striped  rounded-5\">\n");
      out.write("     \n");
      out.write("    <thead class=\"hea\">\n");
      out.write("    <tr >\n");
      out.write("         <th scope=\"col\"><h5><b> Address</b></h5></th>\n");
      out.write("     \n");
      out.write("             <th scope=\"col\"><h5><b> City</b></h5></th>\n");
      out.write("               <th scope=\"col\"><h5><b> State</b></h5></th>\n");
      out.write("                <th scope=\"col\"><h5><b> Zip</b></h5></th>\n");
      out.write("                <th scope=\"col\"> <h5><b>Country</b></h5></th>\n");
      out.write("    </tr>\n");
      out.write("    </thead>\n");
      out.write("     <tbody>\n");
      out.write("     \n");
      out.write("            \n");
      out.write("       <tr>\n");
      out.write("  \n");
      out.write("    <td><h5>");
      out.print(j.getString("Address"));
      out.write("</h5></td>\n");
      out.write("             \n");
      out.write("                    <td><h5>");
      out.print(j.getString("City"));
      out.write("</h5></td>\n");
      out.write("                    <td><h5>");
      out.print(j.getString("State"));
      out.write("</h5></td>\n");
      out.write("                     \n");
      out.write("  <td><h5>");
      out.print(j.getString("Zip"));
      out.write("</h5></td>\n");
      out.write("                    <td><h5>");
      out.print(j.getString("Country"));
      out.write("</h5></td>\n");
      out.write("    </tr>\n");
      out.write("     </tbody>\n");
      out.write("  <thead class=\"hea\">\n");
      out.write("      <tr>\n");
      out.write("         \n");
      out.write("                 <th scope=\"col\"> <h5><b>Gender</b></h5></th>\n");
      out.write("                  <th scope=\"col\"><h5><b> Name</b></h5></th>\n");
      out.write("                    <th scope=\"col\"><h5><b> Email</b></h5></th>\n");
      out.write("                     <th scope=\"col\"><h5><b> DOB</b></h5></th>\n");
      out.write("                       <th scope=\"col\"><h5><b> Contact</b></h5></th>\n");
      out.write("                    \n");
      out.write("    </tr>\n");
      out.write("  </thead>\n");
      out.write("  <tbody>\n");
      out.write("        <tr>\n");
      out.write("\n");
      out.write("            <td><h5>");
      out.print(j.getString("Gender"));
      out.write("</h5></td>\n");
      out.write("                    <td><h5>");
      out.print(j.getString("Name"));
      out.write("</h5></td>\n");
      out.write("                    <td><h5>");
      out.print(j.getString("Email"));
      out.write("</h5></td>\n");
      out.write("                    <td><h5>");
      out.print(j.getDate("DOB"));
      out.write("</h5></td>\n");
      out.write("                    <td><h5>");
      out.print(j.getInt("Contact"));
      out.write("</h5></td>\n");
      out.write("    </tr>\n");
      out.write("                   \n");
      out.write("                ");

}
else{

      out.write("\n");
      out.write("<script>\n");
      out.write("alert(\"Profile not Updated,Go to Account\");\n");
      out.write("window.location=\"account.jsp\";\n");
      out.write("  </script>\n");
      out.write("  ");

}       
}
else{

      out.write("\n");
      out.write("  <script>\n");
      out.write("alert(\"Email doesn't not match\");\n");
      out.write("window.location=\"bookticket.jsp\";\n");
      out.write("  </script>\n");

}

      out.write("\n");
      out.write("    \n");
      out.write("  </tbody>\n");
      out.write("</table>\n");
      out.write("  </div>\n");
      out.write("   ");

               
            String Flight_No=request.getParameter("Flight_No");
             session.setAttribute("Flino", Flight_No);
            String d="select * from allfight where Flight_No='"+Flight_No+"'";
            Class.forName("com.mysql.jdbc.Driver");
            Connection ob=DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","");
            Statement st=ob.createStatement();
            ResultSet i=st.executeQuery(d);
            if (i.next()){   
                
      out.write("\n");
      out.write("  <div class=\"container \" id=\"tab\" >\n");
      out.write("   \n");
      out.write("<table class=\"table table-bordered  table-dark table-striped  rounded-5\">\n");
      out.write("     \n");
      out.write("    <thead class=\"hea\">\n");
      out.write("    <tr >\n");
      out.write("        <th scope=\"col\"><h5><b>Flight_No</b></h5></th>\n");
      out.write("             <th scope=\"col\"><h5><b> Flight_Name</b></h5></th>\n");
      out.write("             <th scope=\"col\"><h5><b> From_City</b></h5></th>\n");
      out.write("               <th scope=\"col\"><h5><b> To_City</b></h5></th>\n");
      out.write("    </tr>\n");
      out.write("    </thead>\n");
      out.write("     <tbody>\n");
      out.write("     \n");
      out.write("            \n");
      out.write("       <tr>\n");
      out.write("  \n");
      out.write("    <td><h5>");
      out.print(i.getString("Flight_No"));
      out.write("</h5></td>\n");
      out.write("    <td><h5>");
      out.print(i.getString("Flight_Name"));
      out.write("</h5></td>\n");
      out.write("                    <td><h5>");
      out.print(i.getString("From_City"));
      out.write("</h5></td>\n");
      out.write("                    <td><h5>");
      out.print(i.getString("To_City"));
      out.write("</h5></td>\n");
      out.write("    </tr>\n");
      out.write("     </tbody>\n");
      out.write("  <thead class=\"hea\">\n");
      out.write("      <tr>\n");
      out.write("          <th scope=\"col\"><h5><b> Departure_Time</b></h5></th>\n");
      out.write("                <th scope=\"col\"> <h5><b>Arrival_Time</b></h5></th>\n");
      out.write("                 <th scope=\"col\"> <h5><b>Date</b></h5></th>\n");
      out.write("                  <th scope=\"col\"> <h5><b>Ticket_Price</b></h5></th>\n");
      out.write("    </tr>\n");
      out.write("  </thead>\n");
      out.write("  <tbody>\n");
      out.write("        <tr>\n");
      out.write(" \n");
      out.write("  <td><h5>");
      out.print(i.getTime("Departure_Time"));
      out.write("</h5></td>\n");
      out.write("                    <td><h5>");
      out.print(i.getTime("Arrival_Time"));
      out.write("</h5></td>\n");
      out.write("                    <td><h5>");
      out.print(i.getDate("Date"));
      out.write("</h5></td>\n");
      out.write("                    <td><h5>");
      out.print(i.getInt("Ticket_Price"));
      out.write("</h5></td>\n");
      out.write("    </tr>\n");
      out.write("           \n");
      out.write("                ");

           
}
else{


}            
      out.write("\n");
      out.write("    \n");
      out.write("  </tbody>\n");
      out.write("</table>\n");
      out.write("  </div>\n");
      out.write("             <script>\n");
      out.write("                  function calc(n) {\n");
      out.write("  var price = document.getElementsByClassName(\"ticket_price\")[n].innerHTML;\n");
      out.write("  var noTickets = document.getElementsByClassName(\"num\")[n].value;\n");
      out.write("  var total = parseFloat(price) * noTickets;\n");
      out.write("  if (!isNaN(total))\n");
      out.write("    document.getElementsByClassName(\"total\")[n].innerHTML = total;\n");
      out.write(" document.getElementsByClassName(\"total\")[n].value= total;\n");
      out.write("  alert(\"The Total price is \" + total);\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("                  </script>\n");
      out.write("                \n");
      out.write("<div class=\"pricetag\">  \n");
      out.write("      <table>\n");
      out.write("    <thead class=\"hea\">\n");
      out.write("        <tr>\n");
      out.write("     <th scope=\"col\"> <h5><b>Ticket_Price</b></h5></th>\n");
      out.write("    </tr>\n");
      out.write("  </thead>\n");
      out.write("    </table>\n");
      out.write("    <div class=\"quantity\">\n");
      out.write("        <span><b>No of Passengers: </span>\n");
      out.write("    <input type=\"number\" class=\"num\" oninput=\"calc(0)\" min=\"1\" max=\"1000\" value=\"1\" />\n");
      out.write("</div>\n");
      out.write("   \n");
      out.write("<div class=\"price\" >\n");
      out.write("    \n");
      out.write("    <p><h3><b>Price Per ticket : Rs.</b><span class=\"ticket_price\">");
      out.print(i.getInt("Ticket_Price"));
      out.write("</span></h3></p>\n");
      out.write("    <p><h2><b>Total :</b> <b>Rs.<span class=\"total\" id=\"total\">0</span></b></h2></p>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write(" \n");
      out.write("  \n");
      out.write("    <div class=\"d-grid gap-2 d-md-flex justify-content-md-end\">   \n");
      out.write("<a href=\"bookticket.jsp\" class=\"btn btn-primary me-md-2 \" tabindex=\"-1\" role=\"button\" aria=\"true\">Back</a>\n");
      out.write("\n");
      out.write("<a href=\"payment.jsp\" class=\"btn btn-primary me-md-2 \" tabindex=\"-1\" role=\"button\"  aria=\"true\"/>Confirm</a>\n");
      out.write("</div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
