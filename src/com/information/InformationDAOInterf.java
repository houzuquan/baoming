package com.information;

import java.sql.SQLException;
import java.util.List;

public interface InformationDAOInterf {
	
	
	public Information insert(Information information) throws SQLException;
	
	
	public List<Information> all() throws SQLException ;
	
	public Information select(String stuId) throws SQLException ;

}
