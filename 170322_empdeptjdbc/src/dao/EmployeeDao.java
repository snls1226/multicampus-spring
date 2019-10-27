package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import commons.Constant;

public class EmployeeDao {
	
	private static EmployeeDao instance;
	private Connection conn;
	
	private static final String URL = "jdbc:mysql://192.168.56.101:3306/mtcps_empdept_db";
	private static final String USER = "root";
	private static final String PASSWORD = "mysql";
	
	private EmployeeDao() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static EmployeeDao getInstance() {
		if(instance == null) { instance = new EmployeeDao(); }
		return instance;
	}
	
	
	public boolean insertEmpInfo(HashMap<String, Object> param) {
		String sql = "insert into emp values(?,?,?,?,?,?,?,?)";
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, (int) param.get(Constant.EMPNO));
			pstmt.setString(2, (String) param.get(Constant.ENAME));
			pstmt.setString(3, (String) param.get(Constant.JOB));
			pstmt.setInt(4, (int) param.get(Constant.MGR));
			pstmt.setString(5, (String) param.get(Constant.HIREDATE));
			pstmt.setInt(6, (int) param.get(Constant.SAL));
			pstmt.setInt(7, (int) param.get(Constant.COMM));
			pstmt.setInt(8, (int) param.get(Constant.DEPTNO));
			
			int result = pstmt.executeUpdate();
			if(result > 0)
				return true;
			else
				return false;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
		
	}
		
}