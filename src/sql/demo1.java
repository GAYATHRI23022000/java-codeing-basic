


package sql;
import java.sql.*;


@SuppressWarnings("unused")
public class demo1
{
	public static void main(String[] args) {
	try{ 
		Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jfs","root","gayathri23*M");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from emp");
	while(rs.next())
	{
	System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
	}
	}
	catch(Exception e)
	{
	System.out.println(e.toString());}
}}


