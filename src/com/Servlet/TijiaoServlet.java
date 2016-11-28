package com.Servlet;

import java.io.IOException;
import java.lang.reflect.Method;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.information.Information;
import com.information.InformationDAO;
import com.information.InformationDAOInterf;

/**
 * Servlet implementation class TijiaoServlet
 */
@WebServlet("/TijiaoServlet")
public class TijiaoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html;charset=UTF-8");  //设置响应的内容类型  响应被发送到客户端,如果尚未提交的响应    **没有这个页面显示则会出现乱码
	        request.setCharacterEncoding("UTF-8");    //没有这个输入中文则无法判断  
	        String servletPath = request.getServletPath();
	        
	        String methodName = servletPath.substring(1);
	        methodName = methodName.substring(0, methodName.length() - 5);
	        try {
				Method method = getClass().getDeclaredMethod(methodName, HttpServletRequest.class , HttpServletResponse.class);
				method.invoke(this, request , response);
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("出错");
			}
		response.setContentType("text/html;charset=UTF-8"); 
        request.setCharacterEncoding("UTF-8");
        
		
	}
	private void sendMyInfo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String stuId = request.getParameter("stuId");
		String stuName = request.getParameter("stuName");
		String stuQQ = request.getParameter("stuQQ");
		String stuPhone = request.getParameter("stuPhone");
		String stuSection1 = request.getParameter("stuSection1");
		String stuSection2 = request.getParameter("stuSection2");
		String stuHobby = request.getParameter("stuHobby");
		String stuJob = request.getParameter("stuJob");
		String stuInfo = request.getParameter("stuInfo");
		String stuDream = request.getParameter("stuDream");

        InformationDAOInterf interf = new InformationDAO();
		Information inf = new Information(stuId , stuName , stuQQ , stuPhone, stuSection1, stuSection2, stuHobby,stuJob , stuInfo , stuDream);
		try {
		    Information have = interf.select(stuId);
		    if(have == null) {
		        interf.insert(inf);
	            response.getWriter().print("{\"code\":\"200\",\"msg\":\"报名成功\"}");
		    }else {
		        response.getWriter().print("{\"code\":\"201\",\"msg\":\"报名失败，您已经报名过了，请不要重复报名！\"}");
		    }
        } catch (SQLException e) {
            // TODO 自动生成的 catch 块
            response.getWriter().print("{\"code\":\"202\",\"msg\":\"报名失败，未知原因，请联系易班工作人员！\"}");
            e.printStackTrace();
        }
//		System.out.println("1---"+inf);
		
//		System.out.println( "2----"+"Information [stuId=" + stuId + ", stuName=" + stuName + ", stuQQ=" + stuQQ + ", stuPhone=" + stuPhone
//				+ ", stuSection1=" + stuSection1 + ", stuSection2=" + stuSection2 + ", stuHobby=" + stuHobby
//				+ ", stuJob=" + stuJob + ", stuInfo=" + stuInfo + ", stuDream=" + stuDream + "]");
		
	}

}
