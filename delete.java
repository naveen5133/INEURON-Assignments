import java.sql.*;
import java.util.Scanner;

import jdbcUtil.in.*;
public class delete {

	public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       
       Connection con=null;
       PreparedStatement pmst=null;
       String deleteSql="delete from employee where emp_id=?";
       
       System.out.println("Enter the employee id you are willing to delete ");
       Integer emp_id=s.nextInt();
       
       try {
    	   
    	   con=jdbcConnection.connection();
    	   if(con != null) {
    		   pmst=con.prepareStatement(deleteSql);
    	   }
    	   if(pmst !=null) {
    		   pmst.setInt(1,emp_id);
    		   pmst.executeUpdate();
    		   System.out.println("successfully deleted emp_id"+emp_id);
    	   }
       }catch(Exception e) {
    	   
       }

	}

}
