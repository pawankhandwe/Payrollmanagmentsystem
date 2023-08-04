<%-- 
    Document   : home1.jsp
    Created on : 17 Oct, 2022, 11:27:35 AM
    Author     : HP
--%>

<%@page import="login.loginpojo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
  
  <!DOCTYPE html>
<html>
  <head>
    <title>Welcome <%
   loginpojo lp=new loginpojo();
   String name=lp.getUsername();
   out.println(name);     
   %> </title>
   
  <style>
        h1 {
  --s: 0.1em;   /* the thickness of the line */
  --c:#9ACD32; /* the color */
  
  color: #0000;
  padding-bottom: var(--s);
  background: 
    linear-gradient(90deg,var(--c) 50%,#000 0) calc(100% - var(--_p,0%))/200% 100%,
    linear-gradient(var(--c) 0 0) 0% 100%/var(--_p,0%) var(--s) no-repeat;
  -webkit-background-clip: text,padding-box;
          background-clip: text,padding-box;
  transition: 0.5s;
}
h1:hover {--_p: 100%}



h1 {
  font-family:cursive;
  color:white;
  background-clip:inherit;
  font-size: 3rem;
  cursor: pointer;
}
      * {
        margin-right:5px;
        padding: 0;
        list-style-type: none;
        box-sizing: border-box;
      }
      body {
        /*background: url('https://images.unsplash.com/photo-1532210317995-cc56d90177d9?ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80') center;*/
     background: url('https://thumbs.dreamstime.com/z/payroll-business-finance-concept-virtual-screen-payroll-business-finance-concept-virtual-screen-159813801.jpg?w=992');
     
     background-size: cover;
        min-height: 600px;
        font-family: 'Helvetica Neue', sans-serif;
      }
      nav {
        text-align: center;
      }
      .menu {
        display: inline-block;
      }
      .menu>li {
        float: left;
        color: #e298e1;
        width: 200px;
        height: 40px;
        line-height: 40px;
        background: rgba(0, 0, 0, 0.7);
        cursor: pointer;
        font-size: 17px;
      }
      .sub-menu {
        transform: scale(0);
        transform-origin: top center;
        transition: all 300ms ease-in-out;
      }
      .sub-menu li {
        font-size: 10px;
        font-weight:bold;
        background: rgba(0, 0, 0, 0.8);
        padding: 3x 2px;
        color: white;
        border-bottom: 1px solid rgba(255, 255, 255, 0.2);
        transform: scale(0);
        transform-origin: top center;
        transition: all 300ms ease-in-out;
      }
      .sub-menu li:last-child {
        border-bottom: 0;
      }
      .sub-menu li:hover {
        background: black;
      }
      .menu>li:hover .sub-menu li {
        transform: scale(1);
      }
      .menu>li:hover .sub-menu {
        transform: scale(1);
      }
    </style>
  </head>
  <body>
    <nav>
      <ul class="menu">
        <li>
            <a href="home1.jsp" style="color:lightpink" class="active">HOME</a>
        </li>
        
        <li>
           <a  style="color: pink" >ADMINISTRATION</a>
          <ul class="sub-menu">        
         <li>   <a href="admin.html" style="color: pink">ADD NEW ADMIN USER</a></li>
        <li><a href="employee.html" style="color: pink">ADD NEW EMPLOYEE</a></li>
       <li> <a href="addemployeesalary.html" style="color: pink">ADD EMPLOYEE SALARY</a></li>
       <li> <a href="adddesignation.html" style="color: pink">ADD DESIGNATION REPORT</a></li>
       <li> <a href="addemployedpt.html"style="color: pink">ADD DEPARTMENT REPORT</a></li>
          </ul>
        </li>
        <li>
           <a  style="color: pink">REPORTS</a>
          <ul class="sub-menu">
            <li><a href="AdminUserReports.jsp" style="color: pink">ADMIN USERS</a></li>
            <li><a href="EmployeeUserReports.jsp" style="color: pink">EMPLOYEES DETAILS</a></li>
            <li><a href="SalaryReports.jsp" style="color: pink">EMPLOYEE SALARY</a></li>
            <li><a href="DesignationReports.jsp" style="color: pink">DESIGNATION REPORT</a></li>
            <li><a href="DepartmentReports.jsp" style="color: pink">DEPARTMENT REPORT</a></li>
     
                
          </ul>
        </li>
        
        <li>
          <a href="MyAccount.html" style="color: pink">MY ACCOUNT</a>
        </li>
        <li>
           <a href="changepassword.html" style="color: pink">CHANGEPASSWORD</a>
   
        </li>
        <li>
           <a href="login.html" style="color: pink">LOGOUT</a>
   
        </li>
        
      </ul>
    </nav>
      <center>
    <br><br>

 <%
//   loginpojo lp=new loginpojo();
//   String username=lp.getUsername();
   out.println("<h1>"+"welcome "+request.getAttribute("username")+"</h1>");     
   %>
  </center>
  </body>
</html>