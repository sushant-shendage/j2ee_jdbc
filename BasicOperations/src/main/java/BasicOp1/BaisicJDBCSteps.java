package BasicOp1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaisicJDBCSteps {
	 
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// loading database driver
		Class.forName("org.postgresql.Driver");
		System.out.println("[_/]databasee driver loaded successfully..!");
		//crating connection with database
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp3?user=postgres&password=root");
		System.out.println("[_/]connection with database created successfully..!");
		//creating statement
		Statement stm=con.createStatement();
		
		//------------------------------------------------------
		//executing query
//		stm.execute("insert into accf1 values (4,'user4name','female','19') ");
//		System.out.println("[_/]query exicuted successfully..!");
		
		//------------------------------------------------------

//		ResultSet rs=stm.executeQuery("select * from accf1");
//		
//		while(rs.next()) {
//			System.out.println("username : "+rs.getString("uname"));
//		}

		//------------------------------------------------------

		
	 
			
			stm.addBatch("insert into accf1 values (5,'user5name','female','19') ");
			stm.addBatch("insert into accf1 values (6,'user6name','female','29') ");
			stm.addBatch("insert into accf1 values (7,'user7name','male','15') ");
			stm.addBatch("insert into accf1 values (8,'user8name','female','35') ");
			stm.addBatch("insert into accf1 values (9,'user9name','male','40') ");
		
			stm.executeBatch();
			
			System.out.println("multiple records added in table...!");
		

		
		
	}

}
