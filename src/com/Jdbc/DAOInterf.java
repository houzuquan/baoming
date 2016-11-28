package com.Jdbc;

import java.sql.SQLException;
import java.util.List;

public interface DAOInterf<T>{
	//��������ķ���
	void batch( String sql, Object [] ... args) throws SQLException;
	
	
	 //���ؾ����һ��ֵ, ����������, ƽ������, ĳһ���˵� email ��.
	public <E> E getFroValue(  String  sql , Object ... args)throws SQLException;
	
	
	//����  T  ��һ������
	public List<T> getFroList(String  sql  , Object...args) throws SQLException;
	
	
	//����һ��  T  �Ĳ�ѯ����
     public T get( String sql , Object...args) throws SQLException;
     
     
	//insert , updata , delete 
     public void updata( String sql , Object...args) throws SQLException; 
}
