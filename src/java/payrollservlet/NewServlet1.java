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
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import login.loginpojo;


@WebServlet(name = "NewServlet1", urlPatterns = {"/NewServlet1"})
public class NewServlet1 extends HttpServlet {

    

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
           response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        
      
        Connection con=null;
       
        try
        {
         String username=request.getParameter("username");
         String password=request.getParameter("password");
         loginpojo lp=new loginpojo();
         System.out.println("login");
          lp.setUsername(username);
        
          if(password.equals("password"))
           {
               out.print("password cannot be password");
           out.close();
           }
           else
           {
 Class.forName("oracle.jdbc.OracleDriver");
    con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","payrollsystem","java");

     PreparedStatement ps=con.prepareStatement("select * from admin where username=? and password=?");
        ps.setString(1,username);
        ps.setString(2, password);
        ResultSet rs=ps.executeQuery();       
        if(rs.next())
       {
           
           request.setAttribute("username", username);
           RequestDispatcher rd=request.getRequestDispatcher("home1.jsp");
         rd.forward(request, response);
         }
       else
            out.print("username/ password is invalid !!");
       
       JOptionPane.showMessageDialog(null,"login sucessful","sucess!",JOptionPane.INFORMATION_MESSAGE);
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

    

