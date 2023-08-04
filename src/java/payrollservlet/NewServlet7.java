
package payrollservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


import java.sql.SQLException;
import java.sql.Statement;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import login.loginpojo;


/**
 *
 * @author HP
 */
@WebServlet(name = "NewServlet7", urlPatterns = {"/NewServlet7"})
public class NewServlet7 extends HttpServlet {

   

      private static final Logger LOGGER = Logger.getLogger(NewServlet7.class.getName());

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
           response.setContentType("text/html");
          
        PrintWriter out=response.getWriter();
        Connection con=null;
       
       
        
        try
        {
             String onsubmitValue = request.getParameter("onsubmit");
          System.out.println(onsubmitValue);
          

            
        if (onsubmitValue != null &&! onsubmitValue.equals("false")) {
           
             String username=request.getParameter("username");
            System.out.println("name of the user is "+username);
           String password=request.getParameter("pwd");
        String cpassword=request.getParameter("cpwd");
//          if(password.length()<7||cpassword.length()<7)
//           {
//               out.print("password must be at least 8 character");
//               out.close();
//           }else if(password.equals("password"))
//           {
//               out.print("password cannot be password");
//           out.close();
//           }
//           
//           else if(!password.equals(cpassword))
//           {
//               out.print("password mismatch!!");
//           out.close();
//           }
           
             Class.forName("oracle.jdbc.OracleDriver");
    con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","payrollsystem","java");
 PreparedStatement ps=con.prepareStatement("update admin set password=? where username=?");
       ps.setString(1,password);
       ps.setString(2,username);
       int rs=ps.executeUpdate();
              
       if(rs==1)
       {        
           out.println(rs);
           JOptionPane.showMessageDialog(null,"password changed sucessfully ","sucess!",JOptionPane.INFORMATION_MESSAGE);
         response.sendRedirect("home1.html");
       }else
       {
        out.print("Your database is not connected successfully!");
       }
       }
        
        else {
            System.out.println("chan");
               JOptionPane.showMessageDialog(null,"password not changed !","error!",JOptionPane.INFORMATION_MESSAGE);
      
            response.sendRedirect("changepassword.html");   
              LOGGER.log(Level.INFO, "onsubmitValue: {0}", onsubmitValue);

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
