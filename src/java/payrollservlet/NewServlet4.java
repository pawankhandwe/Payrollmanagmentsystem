/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

@WebServlet(name = "NewServlet4", urlPatterns = {"/NewServlet4"})
public class NewServlet4 extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        Connection con=null;
        Statement stmt=null;
        
        try
        {
            String empname=request.getParameter("employeename");
         String salarymonth=request.getParameter("salarymonth");
           String workingdays=request.getParameter("workingdays");
       String basicpay=request.getParameter("basicpay");
           String hra=request.getParameter("hra");
         String mediclaim=request.getParameter("mediclaim");
         String travelallowance=request.getParameter("travelallowance");
           String conveyanceallowance=request.getParameter("conveyanceallowance");
             String rembursement=request.getParameter("rembursement");
               String others=request.getParameter("others");
                 String providentfund=request.getParameter("providentfund");
                 String taxmonth=request.getParameter("taxmonth");
                 String message=request.getParameter("message");
         
       Class.forName("oracle.jdbc.OracleDriver");
    con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","payrollsystem","java");

       PreparedStatement ps=con.prepareStatement("insert into salary values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1,empname);
       ps.setString(2,salarymonth);
       ps.setString(3,workingdays);
        ps.setString(4,basicpay);
        ps.setString(5,hra);
         ps.setString(6,mediclaim);
           ps.setString(7,travelallowance); 
           ps.setString(8,conveyanceallowance);
           ps.setString(9,rembursement);
           ps.setString(10,others);
           ps.setString(11,providentfund);
           ps.setString(12,taxmonth);
           ps.setString(13,message);
           
    int result=ps.executeUpdate();
       if(result==1)
       {
           response.setStatus(1,"employee salary added");
           out.print("employee salary added sucessfully");
           response.sendRedirect("http://localhost:2022/payrollmanagmentsystem/home1.html");
        }
       else
            out.print("Your database is not connected successfully!");
       
        
       JOptionPane.showMessageDialog(null,"employee salary added","sucess!",JOptionPane.INFORMATION_MESSAGE);
           
      
        }catch(NumberFormatException e)
        {
        JOptionPane.showMessageDialog(null,"error in format","error",JOptionPane.ERROR_MESSAGE);
     e.printStackTrace();
     System.exit(1);
    }catch(ClassNotFoundException e)
    {
        JOptionPane.showMessageDialog(null,"error in loading driver","error",JOptionPane.ERROR_MESSAGE);
     e.printStackTrace();
     System.exit(1);
    }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null," try again !!","error",JOptionPane.ERROR_MESSAGE);
     e.printStackTrace();
            System.out.println("error"+e);
     System.exit(1);
            
        
        
          }

    }     
        
}
