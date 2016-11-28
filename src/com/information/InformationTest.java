package com.information;

import java.sql.SQLException;
import java.util.List;


public class InformationTest {
	public void insert() throws SQLException{
		Information inf = new Information();
		inf.setStuId("123456");
		inf.setStuName("�Ƹ���");
		inf.setStuQQ("1716850375");
		inf.setStuPhone("15240771718");
		inf.setStuSection1("������");
		inf.setStuSection2("������");
		inf.setStuHobby("����");
		inf.setStuJob("�װ�");
		inf.setStuInfo("1233333");
		inf.setStuDream("����");
		InformationDAOInterf interf = new InformationDAO();
		System.out.println(interf.insert(inf));
	}
	public void all() throws SQLException{
		InformationDAOInterf interf = new InformationDAO();
		List<Information> informations = interf.all();
		System.out.println(informations);
	}
	public void select() throws SQLException{
		InformationDAOInterf interf = new InformationDAO();
		Information information = interf.select("123456");
		System.out.println(information);
	}
}
