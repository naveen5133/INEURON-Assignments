import java.sql.*;
import java.util.Scanner;

import jdbcUtil.in.*;

public class insert {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		Connection con=null;
		PreparedStatement pmst=null;
		
		String insertSql="insert into employee values(?,?,?)";
		
		System.out.println("Enter emp_id");
	    Integer emp_id=s.nextInt();
	    System.out.println("Enter name of employee");
		String emp_name=s.next();
		System.out.println("Enter city of employee");
		String emp_city=s.next();
		
	    try {
	    	con =jdbcConnection.connection();
	    	if(con !=null) {
	    	pmst=con.prepareStatement(insertSql);
	    	}
	    	if(pmst !=null) {
	    		pmst.setInt(1,emp_id);
	    		pmst.setString(2, emp_name);
	    		pmst.setString(3,emp_city);
	    		
	    		pmst.executeUpdate();
	    	}
	    }catch(Exception e) {
	    	e.printStackTrace();
	    }
	    finally {
	    	s.close();
	    }

	}

}
