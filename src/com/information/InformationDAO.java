package com.information;

import java.sql.SQLException;
import java.util.List;

import com.Jdbc.DAO;

public class InformationDAO extends DAO<Information> implements InformationDAOInterf {
//	stuId：学号
//	stuName：姓名
//	stuQQ
//	stuPhone：手机号
//	stuSection1：意向部门
//	stuSection2：备选部门
//	stuHobby：爱好
//	stuJob：在任职务
//	stuInfo：个人简介
//	stuDream：如果你成功加入易班工作站，打算如何实现自我
	@Override
	public Information insert(Information information) throws SQLException {
		String sql = "INSERT INTO information VALUE(?,?,?,?,?,?,?,?,?,?)";
		updata(sql, information.getStuId() , information.getStuName() , information.getStuQQ() , information.getStuPhone(),
				information.getStuSection1() , information.getStuSection2() , information.getStuHobby(), information.getStuJob() , 
				information.getStuInfo() , information.getStuDream());
		return information;
		
	}
	@Override
	public List<Information> all() throws SQLException {
		String sql = "select * from information";
		return getFroList(sql);
	}

	@Override
	public Information select(String stuId) throws SQLException {
		String sql = "select * from information where stuId = ? ";
		return get(sql, stuId);
	}

}
