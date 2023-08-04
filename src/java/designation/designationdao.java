/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designation;

import department.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import salary.salarypojo;

/**
 *
 * @author HP
 */
public class designationdao {
     public static List<designationpojo> getalldesignationdetail()throws SQLException
    {
       Connection con=null;
       ArrayList<designationpojo> s=new ArrayList<>();
        try
        {
       Class.forName("oracle.jdbc.OracleDriver");
    con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","payrollsystem","java");
     Statement ps=con.createStatement();
        ResultSet rs=ps.executeQuery("select tittle,description from designation");
  
        while(rs.next())
        {
            designationpojo sp=new designationpojo();
           sp.setName(rs.getString(1));
           sp.setDescription(rs.getString(2));
           
            
            s.add(sp);
        }
        }catch(ClassNotFoundException ex)
    {
        JOptionPane.showMessageDialog(null,"error in loading driver","error",JOptionPane.ERROR_MESSAGE);
     ex.printStackTrace();
     System.exit(1);
    }
        
       
return s;    
    
   }
    
}
