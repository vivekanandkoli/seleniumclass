package seleniumPending;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class dbconnect {

	public static void main(String[] args) throws Exception {

		String dbUrl = "jdbc:mysql://localhost:3036/emp";
		String username = "root";
		String password = "guru99";
		String query = "select *  from employee;";

		// Load mysql jdbc driver
		Class.forName("com.mysql.jdbc.Driver");

		// Create Connection to DB
		Connection con = DriverManager.getConnection(dbUrl, username, password);

		// Create Statement Object
		Statement stmt = con.createStatement();

		// Execute the SQL Query. Store results in ResultSet
		ResultSet rs = stmt.executeQuery(query);

		// While Loop to iterate through all data and print results
		while (rs.next()) {
			String myName = rs.getString(1);
			String myAge = rs.getString(2);
			System.out.println(myName + "  " + myAge);
		}
		// closing DB Connection
		con.close();

	}


}
