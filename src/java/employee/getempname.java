/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class getempname {
    
    void get()
    {
        try
        {
        
List emp=new ArrayList<String>();
        emp=employeedao.getallemployee();
       
        for(int i=0;i<emp.size();i++)
        {
           // txtid.addItem(emp.get(i));
        }
        }catch(NumberFormatException e)
        {
        JOptionPane.showMessageDialog(null,"error in format","error",JOptionPane.ERROR_MESSAGE);
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
