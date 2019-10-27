package dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import commons.Constant;

public class EmployeeDaoTest {
	public static void main(String[] args) {
		
		EmployeeDao dao = EmployeeDao.getInstance();
		
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		HashMap<String, Object> insertMap = new HashMap<String, Object>();
		insertMap.put(Constant.EMPNO, 7300);
		insertMap.put(Constant.ENAME, "ex_name");
		insertMap.put(Constant.JOB, "ex_job");
		insertMap.put(Constant.MGR, 7900);
		insertMap.put(Constant.HIREDATE, dateFormat.format(date));
		insertMap.put(Constant.SAL, 10000);
		insertMap.put(Constant.COMM, 50);
		insertMap.put(Constant.DEPTNO, 10);
		
		System.out.println(dao.insertEmpInfo(insertMap));
	}
}
