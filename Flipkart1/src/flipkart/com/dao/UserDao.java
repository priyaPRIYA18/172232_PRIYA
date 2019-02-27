package flipkart.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import flipkart.com.DatabaseConnectivity;
import flipkart.com.pojo.Signup;



public class UserDao 
{
	public int insert(Signup sign) throws SQLException
	{
		String query="insert into signup values(?,?,?)";
		Connection conn =DatabaseConnectivity.getsqlConnection();
		PreparedStatement preparedStatement= conn.prepareStatement(query);
		preparedStatement.setString(1,sign.getEmail());
		preparedStatement.setInt(2, sign.getPassword());
		preparedStatement.setInt(3,sign.getReppass());
		
		int output=preparedStatement.executeUpdate();
		return output;	
	}
	
/**	public Signup read(String email) throws SQLException {
		String query="select * from sign where email= ?";
		Signup sign=null;
		Connection conn = DatabaseConnectivity.getsqlConnection();
		PreparedStatement pStatement= conn.prepareStatement(query);
		pStatement.setString(1, email);
		ResultSet resultSet=pStatement.executeQuery();
		while(resultSet.next()) {
		Signup	sign1=new Signup();
			sign1.setEmail(resultSet.getString("email"));
		}
		return sign;
	}**/
	public boolean login(String emailid,String password) throws SQLException
	{
		
		System.out.println(emailid+" UI "+password);
		String query="select email,password from Signup";
		//Signup sign=null;
		Connection conn = DatabaseConnectivity.getsqlConnection();
		PreparedStatement pStatement= conn.prepareStatement(query);
		ResultSet resultSet=pStatement.executeQuery();
		while(resultSet.next())
		{
			String username=resultSet.getString("email");
			String pass=resultSet.getString("password");
			if(username.equals(emailid)&& pass.equals(password))
			{
				return true;
			}
			
		
		}
		return false;
	}
	
/**	public int update(String email,int password) throws SQLException {
		String query="update emp set password=? where email= ?";
		//Signup sign=null;
		Connection conn = DatabaseConnectivity.getConnection();
		PreparedStatement pStatement= conn.prepareStatement(query);
		pStatement.setString(1, email);
		pStatement.setInt(2, password);
		int output=pStatement.executeUpdate();
		return output;
	}
	**/
/**public ArrayList readAll(Signup s) throws SQLException
	{
		String query="select * from sign";
		Connection conn =DatabaseConnectivity.getConnection();
		PreparedStatement preparedStatement= conn.prepareStatement(query);
		preparedStatement.setString(1,s.getEmail());
		preparedStatement.setInt(2, s.getPassword());
		preparedStatement.setInt(3, s.getReppass());
		
		ResultSet resultSet=preparedStatement.executeQuery();
		
		
		
		return null;
		
	}**/
	
	public static void main(String[] args) {
		try {
	
			System.out.println(new UserDao().insert(new Signup("priyayadav18sep@gmail.com",123456,123456)));
			//System.out.println(new UserDao().read("1000"));
			
		} catch (SQLException s) {
			
			s.printStackTrace();
		}
	}
	
	
}
