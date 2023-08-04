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


@WebServlet(name = "NewServlet5", urlPatterns = {"/NewServlet5"})
public class NewServlet5 extends HttpServlet {

   

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        Connection con=null;
        Statement stmt=null;
        
        try
        {
            String tittle=request.getParameter("tittle");
         String description=request.getParameter("description");
           
         
       Class.forName("oracle.jdbc.OracleDriver");
    con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","payrollsystem","java");

       PreparedStatement ps=con.prepareStatement("insert into designation values(?,?)");
        ps.setString(1,tittle);
       ps.setString(2,description);
       
      
           
    int result=ps.executeUpdate();
       if(result==1)
       {
           response.setStatus(1,"employee designation added");
           out.print("employee designation added sucessfully");
           response.sendRedirect("http://localhost:2022/payrollmanagmentsystem/home1.html");
        }
       else
            out.print("Your database is not connected successfully!");
       
        
       JOptionPane.showMessageDialog(null,"employee designation added","sucess!",JOptionPane.INFORMATION_MESSAGE);
           
      
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
