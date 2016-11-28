package com.Jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;


import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JdbcTools {
	public void test() throws Exception{
		Connection connection = getConnection();
		System.out.println(connection);
		
	}
    private static DataSource dataSource = null ; 
    
    static {
    	dataSource = new ComboPooledDataSource("hello");
    	
    }
    public static Connection getConnection() throws SQLException{
		return dataSource.getConnection();
    	
    }

	public static void releaseDB(ResultSet resultSet, PreparedStatement preparedStatement,
			Connection connection) {

		if (resultSet != null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (preparedStatement != null) {
			try {
				preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
