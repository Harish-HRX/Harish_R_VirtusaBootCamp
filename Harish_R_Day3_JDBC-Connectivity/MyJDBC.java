import java.sql.*;
import java.util.Scanner;



public class MyJDBC {

	Connection conn;
	Statement smt;
	
	MyJDBC(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Mydb","root","Root@123");
			this.smt=conn.createStatement();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner in=new Scanner(System.in);
		MyJDBC m=new MyJDBC();
		System.out.println("Enter the column name to be Added:");
		int id=in.nextInt();
		String name=in.next();
		m.addData(id,name);
		m.displayData();
		System.out.println("Enter the column name to be Deleted:");
		id=in.nextInt();
		m.removeData(id);
		m.displayData();
	}
	
	public void addData(int rollNo,String name) {
		try {
			String query="INSERT INTO employee values('"+rollNo+"','"+name+"')";
			smt.execute(query);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void removeData(int rollNo) {
		try {
			String query="DELETE FROM employee WHERE emp_id='"+rollNo+"'";
			smt.execute(query);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void displayData() {
		try {
			ResultSet rs=smt.executeQuery("select * from employee;");
			while(rs.next()) {
				String str1=rs.getString(1);
				String str2=rs.getString(2);
				System.out.println(str1+" "+str2);
			}
			}
			catch(Exception e) {
				System.out.println(e);
			}
	}
	
	

}
