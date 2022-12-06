import java.sql.*;

import jdbcUtil.in.*;


public class select {
    
	
	public static void main(String[] args) {
		
		    Connection con=null;
		    PreparedStatement pstm=null;
		    ResultSet res=null;
		    
		    String Selectsql="select emp_id,emp_name,emp_city from employee";
		    try {
		    	con=jdbcConnection.connection();
		    	if(con !=null) {
		    	pstm=con.prepareStatement(Selectsql);
		    	}
		    	if(pstm!=null) {
		    		res=pstm.executeQuery();
		    	}
		    	if(res!=null) {
		    		while(res.next()) {
						System.out.print(res.getInt("emp_id")+"\t");
						System.out.print(res.getString("emp_name")+"\t");
						System.out.print(res.getString("emp_city"));
						System.out.println();
					}
		    	}
		    	
		    }catch(Exception e) {
		    	e.printStackTrace();
		    }
			
			
	
	}
	

}
