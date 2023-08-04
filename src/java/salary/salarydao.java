/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salary;

import employee.employeepojo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class salarydao {
    
    public static List<salarypojo> getallsalarydetail()throws SQLException
    {
       Connection con=null;
       ArrayList<salarypojo> s=new ArrayList<>();
        try
        {
       Class.forName("oracle.jdbc.OracleDriver");
    con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","payrollsystem","java");
     Statement ps=con.createStatement();
        ResultSet rs=ps.executeQuery("select employee_name,salary_month,working_days,basic_pay,hra,tax_for_month,salary_notes  from salary ");
  
        while(rs.next())
        {
            salarypojo sp=new salarypojo();
           sp.setName(rs.getString(1));
           sp.setSalarymonth(rs.getString(2));
           sp.setWorkingdays(rs.getString(3));
           sp.setBasic_pay(rs.getString(4));
           sp.setHra(rs.getString(5));
           sp.setTax_for_month(rs.getString(6));
           sp.setSalary_note(rs.getString(7));
            
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
