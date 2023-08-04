/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollservlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


@WebServlet(name = "NewServlet2", urlPatterns = {"/NewServlet2"})
public class NewServlet2 extends HttpServlet {

   

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        Connection con=null;
        Statement stmt=null;
     
        try
        {
            String name=request.getParameter("name");
         String username=request.getParameter("username");
           String password=request.getParameter("password");
       String cpassword=request.getParameter("cpassword");
           String mobile=request.getParameter("mobile");
         String email=request.getParameter("email");
         long d=request.getDateHeader("dob");
         Date dd=new Date(d);
        String address1=request.getParameter("address1");
           String address2=request.getParameter("address2");
             String city=request.getParameter("city");
               String state=request.getParameter("state");
                 String country=request.getParameter("country");
         String myfiles=request.getParameter("myfiles");
         System.out.println("      "+myfiles);
       String path="D:\\phto\\";
       myfiles=path+myfiles;
       FileInputStream bis=new FileInputStream(myfiles);
       
       System.out.println("      "+myfiles);
    File f=new File(myfiles);
    int s=(int)f.length();
         
           
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

       PreparedStatement ps=con.prepareStatement("insert into admin values(?,?,?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1,name);
       ps.setString(2,username);
       ps.setString(3,password);
        ps.setString(4,mobile);
        ps.setString(5, email);
         ps.setDate(6, dd);
          ps.setString(7,address1);
           ps.setString(8, address2); 
           ps.setString(9,city);
           ps.setString(10,state);
           ps.setString(11,country);
            ps.setBinaryStream(12, bis, s);
           
    
           
       
       int result=ps.executeUpdate();
       if(result==1)
       {
           response.setStatus(1,"new admin added");
           out.print("new admin added sucessfully");
           response.sendRedirect("http://localhost:2022/payrollmanagmentsystem/home1.html");
          
          }
       else
            out.print("Your database is not connected successfully!");
       
        
       JOptionPane.showMessageDialog(null,"new admin added","sucess!",JOptionPane.INFORMATION_MESSAGE);
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

  

