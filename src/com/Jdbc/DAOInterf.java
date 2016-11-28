package com.Jdbc;

import java.sql.SQLException;
import java.util.List;

public interface DAOInterf<T>{
	//批量处理的方法
	void batch( String sql, Object [] ... args) throws SQLException;
	
	
	 //返回具体的一个值, 例如总人数, 平均工资, 某一个人的 email 等.
	public <E> E getFroValue(  String  sql , Object ... args)throws SQLException;
	
	
	//返回  T  的一个集合
	public List<T> getFroList(String  sql  , Object...args) throws SQLException;
	
	
	//返回一个  T  的查询对象
     public T get( String sql , Object...args) throws SQLException;
     
     
	//insert , updata , delete 
     public void updata( String sql , Object...args) throws SQLException; 
}
