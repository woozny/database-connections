import java.sql.*;

public class Database {

	public  static Connection connection = null;

	public static Connection connectToDatabase(){
		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "java_test_db";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root";
		String password = "";

		try {
			Class.forName(driver).newInstance();
			connection = DriverManager.getConnection(url+dbName,userName,password);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return connection;
	}


	public static void closeConnectionToDatabase(){
		if (connection != null){
			try {
				connection.close();
			} catch (SQLException e){
				e.printStackTrace();
			}
		}


	}
}

