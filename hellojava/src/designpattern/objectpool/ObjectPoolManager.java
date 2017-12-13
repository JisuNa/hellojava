package designpattern.objectpool;

import java.util.*;
import java.sql.*;

public class ObjectPoolManager {
	private static ObjectPoolManager instance = new ObjectPoolManager();
	
	private static final String url = "jdbc:mysql://192.168.1.146:3306/matchless";
	
	private static final int min = 5;
	private static final int max = 10;
	private static final String id = "napa";
	private static final String password = "!@!tt0607";
	
	private static final String driver = "com.mysql.jdbc.Driver";
	
	private ConnectionPool pool;
	
	// #생성자 - 외부 사용자를 접근을 막기위해 private 선언
	private ObjectPoolManager() {
		pool = new ConnectionPool(url, id, password, min, max, driver);
	}
	
	// 유일한 클래스 자신의 객체를 반환하는 메소드
	public static ObjectPoolManager getInstance() {
		return instance;
	}
	
	// Connection 객체를 반환하도록 호출할 메소드
	// Connection 객체의 공유를 막도록 동기화 메소드로 선언한다.
	public synchronized Connection getConnection() {
		Connection con = pool.getConnection();
		
		return con;
	}
	
	// 사용을 마친 Connection 객체를 반환하는 메소드
	// Connection 객체의 공유를 막도록 동기화 메소드로 선언한다.
	public synchronized void releaseConnection(Connection con) {
		pool.releaseConnection(con);
	}
	
}
