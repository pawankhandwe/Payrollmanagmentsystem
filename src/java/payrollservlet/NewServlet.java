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
import login.loginpojo;


@WebServlet(name = "NewServlet", urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {


   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        System.out.println("output "+out);
        Connection con=null;
        Statement stmt=null;
        
        try
        {
         String username=request.getParameter("username");
         String email=request.getParameter("email");
         String password=request.getParameter("password");
         String cpassword=request.getParameter("password_confirm");
         
         if(password.length()<7||cpassword.length()<7)
           {
               out.print("password must be at least 8 character");
               out.close();
           }else if(password.equals("password"))
           {
               out.print("password cannot be password");
           out.close();
           }
           
           else if(!password.equals(cpassword))
           {
               out.print("incorrect password");
           out.close();
           }else
           {
       
        Class.forName("oracle.jdbc.OracleDriver");
    con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","payrollsystem","java");

       PreparedStatement ps=con.prepareStatement("insert into admin(username,email,password)values(?,?,?)");
        ps.setString(1,username);
       ps.setString(2, email);
       ps.setString(3,password);
       
        loginpojo lp=new loginpojo();
       lp.setUsername(username);
       lp.setPassword(password);
       lp.setEmail(email);
       
       
       int result=ps.executeUpdate();
       if(result==1)
       {
         response.sendRedirect("http://localhost:2022/payrollmanagmentsystem/login.html");
           }
       else
            out.print("Your database is not connected successfully!");
       
        
       JOptionPane.showMessageDialog(null,"connection done hua","sucess!",JOptionPane.INFORMATION_MESSAGE);
           }
      
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
     System.exit(1);
            
        }
    }

  

    

}
