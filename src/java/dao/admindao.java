/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author HP
 */
public class admindao {
      public static List<adminpojo> getalldetail()throws SQLException
    {
       Connection con=null;
       ArrayList<adminpojo> e=new ArrayList<>();
        try
        {
       Class.forName("oracle.jdbc.OracleDriver");
    con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","payrollsystem","java");
     Statement ps=con.createStatement();
        ResultSet rs=ps.executeQuery("select username,email,dob,address1,city,state,mobile from admin ");
         
          
        while(rs.next())
        {
            adminpojo emp=new adminpojo();
          
           emp.setName(rs.getString(1));
           emp.setEmail(rs.getString(2));
           emp.setD(rs.getDate(3));
           emp.setAddress(rs.getString(4));
           emp.setCity(rs.getString(5));
           emp.setState(rs.getString(6));
           emp.setMobile(rs.getString(7));
           e.add(emp);
        }
        }catch(ClassNotFoundException ex)
    {
        JOptionPane.showMessageDialog(null,"error in loading driver","error",JOptionPane.ERROR_MESSAGE);
     ex.printStackTrace();
     System.exit(1);
    }
        finally
        {
            return e;
        }
        
       

    
   }
    
}
