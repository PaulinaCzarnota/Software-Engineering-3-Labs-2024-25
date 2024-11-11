import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {

	/**
	 * @param args
	 */
	public static void main( String args[] )
	{
		try{
			// Load the database driver - Usually not necessary but keeping it for compatibility			
			Class.forName( "com.mysql.jdbc.Driver" ) ;

			// Get a connection to the database
			Connection conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/test", "root", "" ) ;

			// Get a statement from the connection
			Statement stmt = conn.createStatement() ;

			// Execute the query
			ResultSet rs = stmt.executeQuery( "SELECT * FROM customer where customerName like 'A%' order by customerName" ) ;

			// Loop through the result set
			while( rs.next() )
				System.out.println( rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3)) ;

			// Close the result set, statement and the connection
			rs.close() ;
			stmt.close() ;
			conn.close() ;
		}
		catch( SQLException se ){
			System.out.println( "SQL Exception:" ) ;

			// Loop through the SQL Exceptions
			while( se != null ){
				System.out.println( "State  : " + se.getSQLState()  ) ;
				System.out.println( "Message: " + se.getMessage()   ) ;
				System.out.println( "Error  : " + se.getErrorCode() ) ;

				se = se.getNextException() ;
			}
		}
		catch( Exception e ){
			System.out.println( e ) ;
		}
	}
}