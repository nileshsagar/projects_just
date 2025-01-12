package servlet_http;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class CustomerCrud {


	public Connection getConnection() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/servletdb";
		String user="root";
		String pass="root";
		Connection connection =DriverManager.getConnection(url, user, pass);
		
		return connection;
	}
	
	public int signUpCustomer(BluePrint bluePrint) throws Exception
	{
		Connection connection=getConnection();
		
		String query="insert into customer values(?,?,?,?,?)";
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		
		preparedStatement.setInt(1,bluePrint.getId());
		preparedStatement.setString(2,bluePrint.getName());
		preparedStatement.setLong(3,bluePrint.getPhone());
		preparedStatement.setString(4,bluePrint.getEmail());
		preparedStatement.setString(5,bluePrint.getPassword());
		
		
		
		
		
		int result = preparedStatement.executeUpdate();
		
		connection.close();
		return result;
	}
	
//	public int loginCustomer(BluePrint bluePrint) throws Exception
//	{
//		Connection connection=getConnection();
//		
//		String result="SELECT ID FROM CUSTOMER WHERE EMAIIL=(?),WHERE PASSWORD=(?)";
//		
//		
//	}
	

	
	
}



