<%-- 
    Document   : DesignationReports
    Created on : 15 Oct, 2022, 1:06:19 AM
    Author     : HP
--%>

<%@page import="designation.designationpojo"%>
<%@page import="java.util.List"%>
<%@page import="designation.designationdao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome <%

   out.println(request.getAttribute("username"));     
   %> </title>
<!--      <style>
   
body {
  font-family: Arial, Helvetica, sans-serif;
  background-color:white ;
  background-size: 100%
 
}

.topnav {
    overflow: hidden;
    background-color: #333;
  }
  
  .topnav a {
    float: left;
    display: block;
    color: #f2f2f2;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
    font-size: 17px;
  }
  
  .active {
    background-color: orange;
    color: white;
  }
  
  .topnav .icon {
    display: none;
  }
  
  .dropdown {
    float: left;
    overflow: hidden;
  }
  
  .dropdown .dropbtn {
    font-size: 17px;    
    border: none;
    outline: none;
    color: white;
    padding: 14px 16px;
    background-color: inherit;
    font-family: inherit;
    margin: 0;
  }
  
  .dropdown-content {
    display: none;
    position: absolute;
    background-color: orange;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    z-index: 1;
  }
  
  .dropdown-content a {
    float: none;
    
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
    text-align: left;
  }
  
  .topnav a:hover, .dropdown:hover .dropbtn {
    background-color:orange;
    color: white;
  }
  
  .dropdown-content a:hover {
    background-color: #ddd;
    color: black;
  }
  
  .dropdown:hover .dropdown-content {
    display: block;
  }
  
  @media screen and (max-width: 600px) {
    .topnav a:not(:first-child), .dropdown .dropbtn {
      display: none;
    }
    .topnav a.icon {
      float: right;
      display: block;
    }
  }
  
  @media screen and (max-width: 600px) {
    .topnav.responsive {position: relative;}
    .topnav.responsive .icon {
      position: absolute;
      right: 0;
      top: 0;
    }
    .topnav.responsive a {
      float: none;
      display: block;
      text-align: left;
    }
    .topnav.responsive .dropdown {float: none;}
    .topnav.responsive .dropdown-content {position: relative;}
    .topnav.responsive .dropdown .dropbtn {
      display: block;
      width: 100%;
      text-align: left;
    }
    
  }
  table, th, td {
    border: 1px solid black;
    border-collapse: collapse;
  }
  th{
    padding:5px;
    text-align: center;
  }
  td{
    padding:50px;
    text-align: center;
  }
  </style>
  </head>
  <body>
  <div class="topnav" id="myTopnav">
    <a href="home1.jsp" >HOME</a>
    <a href="about.html">ABOUT US</a>
    <div class="dropdown">
      <button class="dropbtn">ADMINISTRATION<i class="fa fa-caret-down"></i>
      </button>
      <div class="dropdown-content">
        <a href="admin.html">ADD NEW ADMIN USER</a>
        <a href="employee.html">ADD NEW EMPLOYEE</a>
        <a href="addemployeesalary.html">ADD EMPLOYEE SALARY</a>
        <a href="adddesignation.html">DESIGNATION REPORT</a>
        <a href="addemployedpt.html">DEPARTMENT REPORT</a>
      </div>
    </div> 
    <div class="dropdown active">
        <button class="dropbtn ">REPORTS<i class="fa fa-caret-down"></i>
        </button>
        <div class="dropdown-content">
             <a href="AdminUserReports.jsp">ADMIN USERS DETAILS</a>
            <a href="EmployeeUserReports.jsp"> EMPLOYEES DETAILS</a>
            <a href="SalaryReports.jsp">EMPLOYEE SALARY DETAILS</a>
          <a href="DesignationReports.jsp">DESIGNATION REPORT DETAILS</a>
          <a href="DepartmentReports.jsp">DEPARTMENT REPORT DETAILS</a>
        </div>
    </div>
 <a href="about.html">MY ACCOUNT</a>
    <a href="changepassword.html">CHANGE PASSWORD</a>
    <a href="login.html">LOGOUT</a>
    <a href="javascript:void(0);" style="font-size:15px;" class="icon" onclick="myFunction()">&#9776;</a>
  </div>
  -->

 <style>
      * {
        margin: 10px;
        padding: 0;
        list-style-type: none;
        box-sizing: border-box;
      }
      body {
        background: url('https://images.unsplash.com/photo-1532210317995-cc56d90177d9?ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80') center;
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
        padding: 3x 2x;
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
      *{
    box-sizing: border-box;
    -webkit-box-sizing: border-box;
    -moz-box-sizing: border-box;
}
body{
    font-family: Helvetica;
    -webkit-font-smoothing: antialiased;
    background: rgba( 71, 147, 227, 1);
}
h2{
    text-align: center;
    font-size: 18px;
    text-transform: uppercase;
    letter-spacing: 1px;
    color: white;
    padding: 30px 0;
}

/* Table Styles */

.table-wrapper{
    margin: 10px 70px 70px;
    box-shadow: 0px 35px 50px rgba( 0, 0, 0, 0.2 );
}

.fl-table {
    border-radius: 5px;
    font-size: 12px;
    font-weight: normal;
    border: none;
    border-collapse: collapse;
    width: 100%;
    max-width: 100%;
    white-space: nowrap;
    background-color: white;
}

.fl-table td, .fl-table th {
    text-align: center;
    padding: 8px;
}

.fl-table td {
    border-right: 1px solid #f8f8f8;
    font-size: 12px;
}

.fl-table thead th {
    color: #ffffff;
    background: #4FC3A1;
}


.fl-table thead th:nth-child(odd) {
    color: #ffffff;
    background: #324960;
}

.fl-table tr:nth-child(even) {
    background: #F8F8F8;
}

/* Responsive */

@media (max-width: 767px) {
    .fl-table {
        display: block;
        width: 100%;
    }
    .table-wrapper:before{
        content: "Scroll horizontally >";
        display: block;
        text-align: right;
        font-size: 11px;
        color: white;
        padding: 0 0 10px;
    }
    .fl-table thead, .fl-table tbody, .fl-table thead th {
        display: block;
    }
    .fl-table thead th:last-child{
        border-bottom: none;
    }
    .fl-table thead {
        float: left;
    }
    .fl-table tbody {
        width: auto;
        position: relative;
        overflow-x: auto;
    }
    .fl-table td, .fl-table th {
        padding: 20px .625em .625em .625em;
        height: 60px;
        vertical-align: middle;
        box-sizing: border-box;
        overflow-x: hidden;
        overflow-y: auto;
        width: 120px;
        font-size: 13px;
        text-overflow: ellipsis;
    }
    .fl-table thead th {
        text-align: left;
        border-bottom: 1px solid #f7f7f9;
    }
    .fl-table tbody tr {
        display: table-cell;
    }
    .fl-table tbody tr:nth-child(odd) {
        background: none;
    }
    .fl-table tr:nth-child(even) {
        background: transparent;
    }
    .fl-table tr td:nth-child(odd) {
        background: #F8F8F8;
        border-right: 1px solid #E6E4E4;
    }
    .fl-table tr td:nth-child(even) {
        border-right: 1px solid #E6E4E4;
    }
    .fl-table tbody td {
        display: block;
        text-align: center;
    }
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
  
     <h2>DESIGNATION REPORTS</h2>
      <div class="table-wrapper">
    <table class="fl-table">
  <thead>
  <tr>
   
    <th>TITTLE</th>
    <th>DESCRIPTION</th>
   
    </tr>
  </thead>
  <tbody>
      <%
    List<designationpojo>list=designationdao.getalldesignationdetail();
    for(designationpojo obj:list)
    {
     out.println("<tr>");
        out.println("<td>"+obj.getName()+"</td>");
        out.println("<td>"+obj.getDescription()+"</td>");
    
         out.println("</tr>");

    }
      
   %>
  </tbody>
</table> 
      </div>
  </body>
  </html>



