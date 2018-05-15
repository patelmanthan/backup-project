package org.apache.jsp.Guest;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Guest/DHeader.jsp");
    _jspx_dependants.add("/Guest/Footer.jsp");
  }

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
      out.write("        <title>Sign in Sharing Smile</title>\n");
      out.write("        <link href=\"boocss/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"boocss/bootstrap-theme.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"boocss/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\n");
      out.write("<!--web-fonts-->\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>\n");
      out.write("<!--js-->\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\n");
      out.write("<!-- start-smoth-scrolling -->\n");
      out.write("<script type=\"text/javascript\" src=\"js/move-top.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/easing.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\t\tjQuery(document).ready(function($) {\n");
      out.write("\t\t\t\t$(\".scroll\").click(function(event){\t\t\n");
      out.write("\t\t\t\t\tevent.preventDefault();\n");
      out.write("\t\t\t\t\t$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t});\n");
      out.write("\t</script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"mother-grid\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"header\">\n");
      out.write("\t\t\t<div class=\"header-left\">\n");
      out.write("                            <a href=\"index.jsp\"> <img src=\"images/logo.png\"> </a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<span class=\"menu\"> <img src=\"images/icon-1.png\"></span>\n");
      out.write("\t\t\t<div class=\"clear\"> </div>\n");
      out.write("\t\t\t<div class=\"header-right\">\n");
      out.write("\t\t\t\t  <ul class=\"res\"> \n");
      out.write("\t\t\t\t  \t   <li><a href=\"about.html\">ABOUT US</a></li>\n");
      out.write("\t\t\t\t  \t   <li><a href=\"whatwedo.html\">WHAT WE DO</a></li>\n");
      out.write("\t\t\t\t  \t   <li><a href=\"getinvoled.html\">GET INVOLED</a></li>\n");
      out.write("                                           <li><a href=\"Login.jsp\">LOGIN</a></li>\n");
      out.write("\t\t\t\t  \t   <li><a href=\"contact.html\">CONTACT</a></li>\n");
      out.write("\t\t\t\t  </ul>\n");
      out.write("\t\t\t\t   <script>\n");
      out.write("\t\t\t                                                      $( \"span.menu\").click(function() {\n");
      out.write("\t\t\t                                                                                        $(  \"ul.res\" ).slideToggle(\"slow\", function() {\n");
      out.write("\t\t\t                                                                                         // Animation complete.\n");
      out.write("\t\t\t                                                                                         });\n");
      out.write("\t\t\t                                                                                         });\n");
      out.write("\t\t                                                     </script>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("    </div>\n");
      out.write("   \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <div class=\"text-center\">\n");
      out.write("                                <h2>Login in Sharing Smile</h2>\n");
      out.write("                              </div>\n");
      out.write("                            <form action=\"../logServ\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"uname\">Username</label>\n");
      out.write("                                    <div class=\"input-group\">\n");
      out.write("                                        <span class=\"input-group-addon\" id=\"basic-addon1\"><i class=\"glyphicon glyphicon-user\"></i></span>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"email\" placeholder=\"Username\" aria-describedby=\"basic-addon1\" required>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                 <div class=\"form-group\">\n");
      out.write("                                    <label for=\"pwd\">Password</label>\n");
      out.write("                                    <div class=\"input-group\">\n");
      out.write("                                        <span class=\"input-group-addon\" id=\"basic-addon1\"><i class=\"glyphicon glyphicon-star\"></i></span>\n");
      out.write("                                        <input type=\"password\" class=\"form-control\" placeholder=\"Password\" name=\"pswrd\" aria-describedby=\"basic-addon1\" required>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary btn-block\"><i class=\"glyphicon glyphicon-log-in\">&nbsp;</i>Login</button>\n");
      out.write("                            </form>\n");
      out.write("                            <div class=\"col-md-12\" style=\"margin-left:105px;margin-top:10px;\">\n");
      out.write("                                <a href=\"Registration.jsp\"><i class=\"glyphicon glyphicon-user\"></i>Sign Up</a> |\n");
      out.write("                                <a href=\"forgotpass.jsp\">Forgot Password\n");
      out.write("                            </div>\n");
      out.write("                          \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Footer Page</title>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"footer\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"footer-main\">\n");
      out.write("\t\t\t<div class=\"col-md-4 footer-top\">\n");
      out.write("\t\t\t\t<h3>ABOUT US </h3>\n");
      out.write("\t\t\t\t<p>Sharing Smile is based on NGO Web Application where customer can donate online.  </p><br>\n");
      out.write("\t\t\t\t<p>NGO Manager can manage events,volunteer can actively participate in events and support NGO.</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-2 footer-top\">\n");
      out.write("\t\t\t\t<h3>SITEMAP </h3>\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("                                    <li><a href=\"index.jsp\"> HOME</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"about.html\"> ABOUT</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"give.html\"> DONATE</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"whatwedo.html\"> WHAT WE DO</a></li>\n");
      out.write("                                        <li><a href=\"Login.jsp\">Login</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"contact.html\"> CONTACT US</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t<div class=\"clear fix\"> </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-4 footer-top\">\n");
      out.write("\t\t\t\t <h3>RECENT-NEWS</h3>\n");
      out.write("\t\t       <div class=\"news\">\n");
      out.write("\t\t       \t   <h4>VIVAMUS VITAE VEHICULA LACUS</h4>\n");
      out.write("\t\t       \t   <p>sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>\n");
      out.write("\t\t         <div class=\"col\"> \n");
      out.write("\t\t           <p>POSTED ON NOV 30</p>\n");
      out.write("\t\t         </div>\n");
      out.write("\t\t       </div>\n");
      out.write("\t\t       <div class=\"news\">\n");
      out.write("\t\t       \t  <h4>VIVAMUS VITAE VEHICULA LACUS</h4>\n");
      out.write("\t\t       \t  <p>sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>\n");
      out.write("\t\t        <div class=\"col\"> \n");
      out.write("\t\t          <p>POSTED ON NOV 30</p>\n");
      out.write("\t\t        </div>  \n");
      out.write("\t\t       </div>\n");
      out.write("\t\t      <div class=\"clear fix\"> </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-2 footer-top\">\n");
      out.write("\t\t\t\t<h3> OUR ADDRESS</h3>\n");
      out.write("\t\t\t\t<P>Ahmedabad.</p>\n");
      out.write("\t\t\t\t<p>MASS VARIUS VITAE.</p>\n");
      out.write("\t\t\t\t<p>\tVIVAMUS VITAE.</p> \n");
      out.write("\t\t\t\t<p>\tVECHICULA.</p>\n");
      out.write("\t\t\t\t<p> PH:123456789,</p>\n");
      out.write("\t\t\t\t<p> EMAIL:<a href=\"mailto:example@email.com\">npankaj096@gmail.com</a></P>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"clear fix\"> </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<!--/footer end here-->\n");
      out.write("<!--copyrights start here-->\n");
      out.write("<div class=\"copyright\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"copy-right-main\">\n");
      out.write("\t\t\t<div class=\"col-md-6 copy-left\">\n");
      out.write("                            <p>Project by <a href=\"index.jsp\">Sharing Smile</a></p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t\t\t\t\t\t\t$(document).ready(function() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t/*\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvar defaults = {\n");
      out.write("\t\t\t\t\t\t\t\t  \t\t\tcontainerID: 'toTop', // fading element id\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tcontainerHoverID: 'toTopHover', // fading element hover id\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tscrollSpeed: 1200,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\teasingType: 'linear' \n");
      out.write("\t\t\t\t\t\t\t\t \t\t};\n");
      out.write("\t\t\t\t\t\t\t\t\t\t*/\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$().UItoTop({ easingType: 'easeOutQuart' });\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t\t</script>\n");
      out.write("\t\t\t\t\t<a href=\"#\" id=\"toTop\" style=\"display: block;\"> <span id=\"toTopHover\" style=\"opacity: 1;\"> </span></a>\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
