package com.information;

public class Information {
//	stuId��ѧ��
//	stuName������
//	stuQQ
//	stuPhone���ֻ���
//	stuSection1��������
//	stuSection2����ѡ����
//	stuHobby������
//	stuJob������ְ��
//	stuInfo�����˼��
//	stuDream�������ɹ������װ๤��վ���������ʵ������
	
   private String stuId ; 
   private String stuName ; 
   private String stuQQ ; 
   private String stuPhone ; 
   private String stuSection1 ; 
   private String stuSection2 ; 
   private String stuHobby ; 
   private String stuJob ; 
   private String stuInfo ; 
   private String stuDream ;
   
	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuQQ() {
		return stuQQ;
	}
	public void setStuQQ(String stuQQ) {
		this.stuQQ = stuQQ;
	}
	public String getStuPhone() {
		return stuPhone;
	}
	public void setStuPhone(String stuPhone) {
		this.stuPhone = stuPhone;
	}
	public String getStuSection1() {
		return stuSection1;
	}
	public void setStuSection1(String stuSection1) {
		this.stuSection1 = stuSection1;
	}
	public String getStuSection2() {
		return stuSection2;
	}
	public void setStuSection2(String stuSection2) {
		this.stuSection2 = stuSection2;
	}
	public String getStuHobby() {
		return stuHobby;
	}
	public void setStuHobby(String stuHobby) {
		this.stuHobby = stuHobby;
	}
	public String getStuJob() {
		return stuJob;
	}
	public void setStuJob(String stuJob) {
		this.stuJob = stuJob;
	}
	public String getStuInfo() {
		return stuInfo;
	}
	public void setStuInfo(String stuInfo) {
		this.stuInfo = stuInfo;
	}
	public String getStuDream() {
		return stuDream;
	}
	public void setStuDream(String stuDream) {
		this.stuDream = stuDream;
	}
	
	public Information() {
		// TODO Auto-generated constructor stub
	}
	public Information(String stuId, String stuName, String stuQQ, String stuPhone, String stuSection1,
			String stuSection2, String stuHobby, String stuJob, String stuInfo, String stuDream) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuQQ = stuQQ;
		this.stuPhone = stuPhone;
		this.stuSection1 = stuSection1;
		this.stuSection2 = stuSection2;
		this.stuHobby = stuHobby;
		this.stuJob = stuJob;
		this.stuInfo = stuInfo;
		this.stuDream = stuDream;
	}
	@Override
	public String toString() {
		return "Information [stuId=" + stuId + ", stuName=" + stuName + ", stuQQ=" + stuQQ + ", stuPhone=" + stuPhone
				+ ", stuSection1=" + stuSection1 + ", stuSection2=" + stuSection2 + ", stuHobby=" + stuHobby
				+ ", stuJob=" + stuJob + ", stuInfo=" + stuInfo + ", stuDream=" + stuDream + "]";
	}
	
   
   
   
   
}
