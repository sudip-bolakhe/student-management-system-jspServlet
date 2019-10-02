package com.sudip.std.utl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbUtil {

	private static final String DRIVER_NAME="com.mysql.jdbc.Driver";
	private static final String URl="jdbc:mysql://localhost:3307/";
	private static final String DATABASE_NAME="user";
	private static final String USERNAME="root";
	private static final String PASSWORD="root";
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		Class.forName(DRIVER_NAME);
		return DriverManager.getConnection(URl+DATABASE_NAME,USERNAME,PASSWORD);
		
	}
	public static void closeAll(PreparedStatement preparedStatement) {
		try {
			if (preparedStatement != null) {
				preparedStatement.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
