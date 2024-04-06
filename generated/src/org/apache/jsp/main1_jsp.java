package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n");
      out.write("<title>Order</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" />\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("function cancelCart() {\n");
      out.write("\tvar r = confirm(\"Are you sure you want to empty the cart!\");\n");
      out.write("\tif (r == true)\n");
      out.write("\t\twindow.location.href='cart?action=cancel'; \n");
      out.write("\t//<a href=\"shop?action=checkout\"><span>Checkout</span></a> <!-- Checkout cart -->\n");
      out.write("}\n");
      out.write("\n");
      out.write("function checkoutCart() {\n");
      out.write("\twindow.location.href='shop?action=checkout';\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body class=\"order\">\n");
      out.write("\t<div id=\"wrap\">\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write(" <!-- End of #header -->\n");
      out.write("\n");
      out.write("\t\t<div class=\"clear\"></div>\n");
      out.write("\n");
      out.write("\t\t<div id=\"container\">\n");
      out.write("\t\t<form method=\"post\" action=\"cart?action=update\">\n");
      out.write("\t\t\t<table id=\"cart\">\n");
      out.write("\t\t\t\t<caption>\n");
      out.write("\t\t\t\t\t<span><img width=\"31px\" height=\"23px\" src=\"images/icon-cart.png\" alt=\"Icon cart\" /></span> \n");
      out.write("\t\t\t\t\tYour Cart\n");
      out.write("\t\t\t\t</caption>\n");
      out.write("\t\t\t\t<thead>\n");
      out.write("\t\t\t\t\t<tr id=\"header\">\n");
      out.write("\t\t\t\t\t\t<th>Category</th>\n");
      out.write("\t\t\t\t\t\t<th>Code</th>\n");
      out.write("\t\t\t\t\t\t<th>Description</th>\n");
      out.write("\t\t\t\t\t\t<th>Quantity</th>\n");
      out.write("\t\t\t\t\t\t<th>Total</th>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t</thead>\n");
      out.write("\t\t\t\t<tbody>\n");
      out.write("\t\t\t\t\t<!-- Init the sub total cart -->\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t<!--  start looping the cart to iterate the each product -->\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t<tr id=\"subtotal\">\n");
      out.write("\t\t\t\t\t\t<td colspan=\"5\">Subtotal: <span id=\"sum\">$");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subTotal}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span></td>\n");
      out.write("\t\t\t\t\t</tr> <!-- End of #subtotal -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t<tr id=\"process_cart\">\n");
      out.write("\t\t\t\t\t\t<td colspan=\"5\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" value=\"Update\" class=\"update\"/>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"button\" value=\"Cancel\" id=\"cancel\" class=\"cancel\" onclick=\"cancelCart()\"/> <!-- Cancel cart -->\n");
      out.write("\t\t\t\t\t\t\t<input type=\"button\" value=\"Checkout\" class=\"checkout\" onclick=\"checkoutCart()\"/> <!-- Checkout cart -->\n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t</tr> <!-- End of #process_cart -->\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<tr id=\"continue_shopping\">\n");
      out.write("\t\t\t\t\t\t<td colspan=\"5\"><a href=\"shop?action=new-products\">&lt;&lt;&lt; Continue to shopping</a></td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t</tbody>\n");
      out.write("\t\t\t</table> <!-- End of cart table -->\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- End of #container -->\n");
      out.write("\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write(" <!-- End of #footer -->\n");
      out.write("\t</div>\n");
      out.write("\t<!-- End of #wrap -->\n");
      out.write("</body>\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("subTotal");
    _jspx_th_c_set_0.setValue(new String("0"));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("product");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${products}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t<!-- total price the each product -->\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_c_set_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t<!-- sub total for whole cart -->\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_c_set_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t<tr class=\"content_cart\">\n");
          out.write("\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.category.categoryName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.productID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t<td class=\"quantity\">\n");
          out.write("\t\t\t\t\t\t\t\t<p>\n");
          out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.productID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" /> <!-- READ THIS LINE and UpdateCart function -->\n");
          out.write("\t\t\t\t\t\t\t\t\t<a title=\"Remove this item\" class=\"remove_lnk\" \n");
          out.write("\t\t\t\t\t\t\t\t\t\thref=\"cart?action=delete&productId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.productID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"> \n");
          out.write("\t\t\t\t\t\t\t\t\t\t<span></span>\n");
          out.write("\t\t\t\t\t\t\t\t\t</a>\n");
          out.write("\t\t\t\t\t\t\t\t</p>\n");
          out.write("\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t<td class=\"price\">\n");
          out.write("\t\t\t\t\t\t\t\t<span>$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\n");
          out.write("\t\t\t\t\t\t\t\t<p>$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" each</p>\n");
          out.write("\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t</tr> <!-- End of .content_cart -->\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_set_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_set_1.setVar("total");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.quantity * product.price}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_set_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_2.setPageContext(_jspx_page_context);
    _jspx_th_c_set_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_set_2.setVar("subTotal");
    _jspx_th_c_set_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subTotal + total}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_2 = _jspx_th_c_set_2.doStartTag();
    if (_jspx_th_c_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
    return false;
  }
}
