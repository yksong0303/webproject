package common;

import java.sql.*;


public class Connector {
	
	private static final String URL = "jdbc:oracle:thin:@localhost:1521/xe";
	private static final String ID = "c##test";
	private static final String PWD = "test";
	private static final String DN = "oracle.jdbc.driver.OracleDriver";
	private static Connection conn;
	
	
	private static void init() {
		try {
			Class.forName(DN);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static Connection getConnection(){
		if(conn==null) {
			init();
			try {
				conn = DriverManager.getConnection(URL, ID, PWD);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return conn;
	}
	
	public static void close() {
		if(conn!=null) {
			try {
				conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		conn = null;
	}
	public static void main(String[] args) throws SQLException {
		Connection con = getConnection();
		Statement stmt = con.createStatement();
		String sql = "select * from board ";
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.println("출력");
			
		}
	}
	

}