package com.Jdbc;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

public class DAO<T> implements DAOInterf<T> {
	private QueryRunner queryRunner = new QueryRunner();
	private Class<T> type;
	
	public DAO() {
		queryRunner = new QueryRunner();
		//反射
	    type = ReflectionUtils.getSuperGenericType(getClass());
	}
	//批量处理的方法
	public void batch(String sql, Object[]... args) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	//返回具体的一个值, 例如总人数, 平均工资, 某一个人的 email 等.
	public <E> E getFroValue(String sql, Object... args) throws SQLException {
        Connection connection = null ; 
        try {
			connection = JdbcTools.getConnection();
			return (E) queryRunner.query(connection, sql, new ScalarHandler(), args);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JdbcTools.releaseDB(null, null, connection);
		}
		
		return null;
	}
	//返回  T  的一个集合
	public List<T> getFroList(String sql, Object... args) throws SQLException {
        Connection connection = null ;
        try {
			connection = JdbcTools.getConnection();
			return queryRunner.query(connection, sql, new BeanListHandler<>(type), args);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JdbcTools.releaseDB(null, null, connection);
		}
		return null;
	}
	//返回一个  T  的查询对象
	public T get(String sql, Object... args) throws SQLException {
        Connection connection = null ; 
        try {
			connection = JdbcTools.getConnection();
			return  queryRunner.query(connection, sql, new BeanHandler<>(type), args);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcTools.releaseDB(null, null, connection);
		}
		return null;
	}
   //insert , delete , updata
	public void updata(String sql, Object... args) throws SQLException {

		Connection connection = null;
		try {
			connection =JdbcTools.getConnection();
			queryRunner.update(connection , sql , args);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcTools.releaseDB(null, null, connection);
		}
		
		
		
	}

	

}
