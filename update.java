import java.sql.*;
import java.util.Scanner;

import jdbcUtil.in.*;

public class update {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Connection con=null;
		PreparedStatement pmst=null;
		String updateSql="update employee set emp_city=? where emp_id=?";
		
		System.out.println("Enter city name that you want to update");
		String emp_city=s.nextLine();
		System.out.println("Enter employee id where you want to updatde");
		Integer emp_id=s.nextInt();
		
		try {
			con= jdbcConnection.connection();
			if(con !=null) {
				pmst=con.prepareStatement(updateSql);
			}
			if(pmst !=null) {
				pmst.setString(1, emp_city);
				pmst.setInt(2, emp_id);
				pmst.executeUpdate();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
