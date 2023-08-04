package org.apache.jsp.payroll;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminUserReports_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<style>\n");
      out.write("   \n");
      out.write("body {\n");
      out.write("  font-family: Arial, Helvetica, sans-serif;\n");
      out.write("  background-color:white ;\n");
      out.write("  background-size: 100%\n");
      out.write(" \n");
      out.write("}\n");
      out.write("\n");
      out.write(".topnav {\n");
      out.write("    overflow: hidden;\n");
      out.write("    background-color: #333;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .topnav a {\n");
      out.write("    float: left;\n");
      out.write("    display: block;\n");
      out.write("    color: #f2f2f2;\n");
      out.write("    text-align: center;\n");
      out.write("    padding: 14px 16px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    font-size: 17px;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .active {\n");
      out.write("    background-color: orange;\n");
      out.write("    color: white;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .topnav .icon {\n");
      out.write("    display: none;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .dropdown {\n");
      out.write("    float: left;\n");
      out.write("    overflow: hidden;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .dropdown .dropbtn {\n");
      out.write("    font-size: 17px;    \n");
      out.write("    border: none;\n");
      out.write("    outline: none;\n");
      out.write("    color: white;\n");
      out.write("    padding: 14px 16px;\n");
      out.write("    background-color: inherit;\n");
      out.write("    font-family: inherit;\n");
      out.write("    margin: 0;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .dropdown-content {\n");
      out.write("    display: none;\n");
      out.write("    position: absolute;\n");
      out.write("    background-color: orange;\n");
      out.write("    min-width: 160px;\n");
      out.write("    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\n");
      out.write("    z-index: 1;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .dropdown-content a {\n");
      out.write("    float: none;\n");
      out.write("    \n");
      out.write("    color: black;\n");
      out.write("    padding: 12px 16px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: block;\n");
      out.write("    text-align: left;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .topnav a:hover, .dropdown:hover .dropbtn {\n");
      out.write("    background-color:orange;\n");
      out.write("    color: white;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .dropdown-content a:hover {\n");
      out.write("    background-color: #ddd;\n");
      out.write("    color: black;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .dropdown:hover .dropdown-content {\n");
      out.write("    display: block;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  @media screen and (max-width: 600px) {\n");
      out.write("    .topnav a:not(:first-child), .dropdown .dropbtn {\n");
      out.write("      display: none;\n");
      out.write("    }\n");
      out.write("    .topnav a.icon {\n");
      out.write("      float: right;\n");
      out.write("      display: block;\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  @media screen and (max-width: 600px) {\n");
      out.write("    .topnav.responsive {position: relative;}\n");
      out.write("    .topnav.responsive .icon {\n");
      out.write("      position: absolute;\n");
      out.write("      right: 0;\n");
      out.write("      top: 0;\n");
      out.write("    }\n");
      out.write("    .topnav.responsive a {\n");
      out.write("      float: none;\n");
      out.write("      display: block;\n");
      out.write("      text-align: left;\n");
      out.write("    }\n");
      out.write("    .topnav.responsive .dropdown {float: none;}\n");
      out.write("    .topnav.responsive .dropdown-content {position: relative;}\n");
      out.write("    .topnav.responsive .dropdown .dropbtn {\n");
      out.write("      display: block;\n");
      out.write("      width: 100%;\n");
      out.write("      text-align: left;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("  }\n");
      out.write("  table, th, td {\n");
      out.write("    border: 1px solid black;\n");
      out.write("    border-collapse: collapse;\n");
      out.write("  }\n");
      out.write("  th{\n");
      out.write("    padding:5px;\n");
      out.write("    text-align: center;\n");
      out.write("  }\n");
      out.write("  td{\n");
      out.write("    padding:50px;\n");
      out.write("    text-align: center;\n");
      out.write("  }\n");
      out.write("  </style>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("  <div class=\"topnav\" id=\"myTopnav\">\n");
      out.write("    <a href=\"home1.html\" class=\"active\">HOME</a>\n");
      out.write("    <a href=\"about.html\">ABOUT US</a>\n");
      out.write("    <div class=\"dropdown\">\n");
      out.write("      <button class=\"dropbtn\">ADMINISTRATION<i class=\"fa fa-caret-down\"></i>\n");
      out.write("      </button>\n");
      out.write("      <div class=\"dropdown-content\">\n");
      out.write("        <a href=\"admin.html\">ADD NEW ADMIN USER</a>\n");
      out.write("        <a href=\"employee.html\">ADD NEW EMPLOYEE</a>\n");
      out.write("        <a href=\"addemployeesalary.html\">ADD EMPLOYEE SALARY</a>\n");
      out.write("        <a href=\"adddesignation.html\">DESIGNATION REPORT</a>\n");
      out.write("        <a href=\"addemployedpt.html\">DEPARTMENT REPORT</a>\n");
      out.write("      </div>\n");
      out.write("    </div> \n");
      out.write("    <div class=\"dropdown\">\n");
      out.write("        <button class=\"dropbtn\">REPORTS<i class=\"fa fa-caret-down\"></i>\n");
      out.write("        </button>\n");
      out.write("        <div class=\"dropdown-content\">\n");
      out.write("            <a href=\"adminuserreports.html\">ADD NEW ADMIN USER</a>\n");
      out.write("            <a href=\"employeereports.html\">ADD NEW EMPLOYEE</a>\n");
      out.write("            <a href=\"salaryreports.html\">ADD EMPLOYEE SALARY</a>\n");
      out.write("          <a href=\"designationreports.html\">DESIGNATION REPORT</a>\n");
      out.write("          <a href=\"departmentreports.html\">DEPARTMENT REPORT</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write(" <a href=\"about.html\">MY ACCOUNT</a>\n");
      out.write("    <a href=\"changepassword.html\">CHANGE PASSWORD</a>\n");
      out.write("    <a href=\"login.html\">LOGOUT</a>\n");
      out.write("    <a href=\"javascript:void(0);\" style=\"font-size:15px;\" class=\"icon\" onclick=\"myFunction()\">&#9776;</a>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("  <center>\n");
      out.write("    <br><br>\n");
      out.write("    <h1>ADMIN USER REPORTS</h1>\n");
      out.write("\n");
      out.write("<table style=\"width:100%\">\n");
      out.write("  <tr>\n");
      out.write("    <th width=\"2%\">USER ID</th>\n");
      out.write("    <th width=\"10%\">IMAGE</th>\n");
      out.write("    <th width=\"13%\">NAME</th>\n");
      out.write("    <th width=\"10%\">MOBILE</th>\n");
      out.write("    <th width=\"30%\"> E-MAIL </th>\n");
      out.write("    <th width=\"10%\">DATE OF BIRTH</th>\n");
      out.write("    <th width=\"25%\">ACTION</th>\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("</center>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  </body>\n");
      out.write("  </html>\n");
      out.write("\n");
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
