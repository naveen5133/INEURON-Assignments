package jdbcUtil.in;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcConnection {
	
	public static Connection connection() throws SQLException {
		
		Connection con=null;
		
		 String DB_url="jdbc:mysql://localhost:3306/cognidemo";
		 String user="root";
		 String password="root";

		 con = DriverManager.getConnection(DB_url, user, password);
			
		 if(con !=null) {
			 return con;
		 }
		 return con;
			
	}	
		 
		 public static void closeConnection(ResultSet res,Statement pstm,Connection con) throws SQLException {
			 
			 if(res !=null) {
				 res.close();
			 }
			 if(pstm !=null) {
				 pstm.close();
			 }
			 if(con !=null) {
				 con.close();
			 }
			 
		 }

}
