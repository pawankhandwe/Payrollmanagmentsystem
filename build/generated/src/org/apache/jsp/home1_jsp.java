package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import login.loginpojo;

public final class home1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  \n");
      out.write("  <!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <title>Welcome ");


   out.println(request.getAttribute("username"));     
   
      out.write(" </title>\n");
      out.write("   \n");
      out.write("  <style>\n");
      out.write("        h1 {\n");
      out.write("  --s: 0.1em;   /* the thickness of the line */\n");
      out.write("  --c:#9ACD32; /* the color */\n");
      out.write("  \n");
      out.write("  color: #0000;\n");
      out.write("  padding-bottom: var(--s);\n");
      out.write("  background: \n");
      out.write("    linear-gradient(90deg,var(--c) 50%,#000 0) calc(100% - var(--_p,0%))/200% 100%,\n");
      out.write("    linear-gradient(var(--c) 0 0) 0% 100%/var(--_p,0%) var(--s) no-repeat;\n");
      out.write("  -webkit-background-clip: text,padding-box;\n");
      out.write("          background-clip: text,padding-box;\n");
      out.write("  transition: 0.5s;\n");
      out.write("}\n");
      out.write("h1:hover {--_p: 100%}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("h1 {\n");
      out.write("  font-family:cursive;\n");
      out.write("  color:white;\n");
      out.write("  background-clip:inherit;\n");
      out.write("  font-size: 3rem;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("      * {\n");
      out.write("        margin: 10px;\n");
      out.write("        padding: 0;\n");
      out.write("        list-style-type: none;\n");
      out.write("        box-sizing: border-box;\n");
      out.write("      }\n");
      out.write("      body {\n");
      out.write("        /*background: url('https://images.unsplash.com/photo-1532210317995-cc56d90177d9?ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80') center;*/\n");
      out.write("     background: url('https://thumbs.dreamstime.com/z/payroll-business-finance-concept-virtual-screen-payroll-business-finance-concept-virtual-screen-159813801.jpg?w=992');\n");
      out.write("     \n");
      out.write("     background-size: cover;\n");
      out.write("        min-height: 600px;\n");
      out.write("        font-family: 'Helvetica Neue', sans-serif;\n");
      out.write("      }\n");
      out.write("      nav {\n");
      out.write("        text-align: center;\n");
      out.write("      }\n");
      out.write("      .menu {\n");
      out.write("        display: inline-block;\n");
      out.write("      }\n");
      out.write("      .menu>li {\n");
      out.write("        float: left;\n");
      out.write("        color: #e298e1;\n");
      out.write("        width: 200px;\n");
      out.write("        height: 40px;\n");
      out.write("        line-height: 40px;\n");
      out.write("        background: rgba(0, 0, 0, 0.7);\n");
      out.write("        cursor: pointer;\n");
      out.write("        font-size: 17px;\n");
      out.write("      }\n");
      out.write("      .sub-menu {\n");
      out.write("        transform: scale(0);\n");
      out.write("        transform-origin: top center;\n");
      out.write("        transition: all 300ms ease-in-out;\n");
      out.write("      }\n");
      out.write("      .sub-menu li {\n");
      out.write("        font-size: 10px;\n");
      out.write("        font-weight:bold;\n");
      out.write("        background: rgba(0, 0, 0, 0.8);\n");
      out.write("        padding: 3x 2x;\n");
      out.write("        color: white;\n");
      out.write("        border-bottom: 1px solid rgba(255, 255, 255, 0.2);\n");
      out.write("        transform: scale(0);\n");
      out.write("        transform-origin: top center;\n");
      out.write("        transition: all 300ms ease-in-out;\n");
      out.write("      }\n");
      out.write("      .sub-menu li:last-child {\n");
      out.write("        border-bottom: 0;\n");
      out.write("      }\n");
      out.write("      .sub-menu li:hover {\n");
      out.write("        background: black;\n");
      out.write("      }\n");
      out.write("      .menu>li:hover .sub-menu li {\n");
      out.write("        transform: scale(1);\n");
      out.write("      }\n");
      out.write("      .menu>li:hover .sub-menu {\n");
      out.write("        transform: scale(1);\n");
      out.write("      }\n");
      out.write("    </style>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <nav>\n");
      out.write("      <ul class=\"menu\">\n");
      out.write("        <li>\n");
      out.write("            <a href=\"home1.jsp\" style=\"color:lightpink\" class=\"active\">HOME</a>\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("         <a href=\"about.html\" style=\"color: pink\" >ABOUT</a>\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("           <a  style=\"color: pink\" >ADMINISTRATION</a>\n");
      out.write("          <ul class=\"sub-menu\">        \n");
      out.write("         <li>   <a href=\"admin.html\" style=\"color: pink\">ADD NEW ADMIN USER</a></li>\n");
      out.write("        <li><a href=\"employee.html\" style=\"color: pink\">ADD NEW EMPLOYEE</a></li>\n");
      out.write("       <li> <a href=\"addemployeesalary.html\" style=\"color: pink\">ADD EMPLOYEE SALARY</a></li>\n");
      out.write("       <li> <a href=\"adddesignation.html\" style=\"color: pink\">ADD DESIGNATION REPORT</a></li>\n");
      out.write("       <li> <a href=\"addemployedpt.html\"style=\"color: pink\">ADD DEPARTMENT REPORT</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("           <a  style=\"color: pink\">REPORTS</a>\n");
      out.write("          <ul class=\"sub-menu\">\n");
      out.write("            <li><a href=\"AdminUserReports.jsp\" style=\"color: pink\">ADMIN USERS</a></li>\n");
      out.write("            <li><a href=\"EmployeeUserReports.jsp\" style=\"color: pink\">EMPLOYEES DETAILS</a></li>\n");
      out.write("            <li><a href=\"SalaryReports.jsp\" style=\"color: pink\">EMPLOYEE SALARY</a></li>\n");
      out.write("            <li><a href=\"DesignationReports.jsp\" style=\"color: pink\">DESIGNATION REPORT</a></li>\n");
      out.write("            <li><a href=\"DepartmentReports.jsp\" style=\"color: pink\">DEPARTMENT REPORT</a></li>\n");
      out.write("     \n");
      out.write("                \n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("        <li>\n");
      out.write("          <a href=\"about.html\" style=\"color: pink\">MY ACCOUNT</a>\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("           <a href=\"changepassword.html\" style=\"color: pink\">CHANGEPASSWORD</a>\n");
      out.write("   \n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("           <a href=\"login.html\" style=\"color: pink\">LOGOUT</a>\n");
      out.write("   \n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("      </ul>\n");
      out.write("    </nav>\n");
      out.write("      <center>\n");
      out.write("    <br><br>\n");
      out.write("\n");
      out.write(" ");

//   loginpojo lp=new loginpojo();
//   String username=lp.getUsername();
   out.println("<h1>"+"welcome "+request.getAttribute("username")+"</h1>");     
   
      out.write("\n");
      out.write("  </center>\n");
      out.write("  </body>\n");
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
}
