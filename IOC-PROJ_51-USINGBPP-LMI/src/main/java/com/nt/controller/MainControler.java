package com.nt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.dto.EmployeDto;
import com.nt.dto.StudentDto;
import com.nt.service.CollegeServiceImpl;
import com.nt.service.ICollegeService;
@WebServlet("/controler")
public class MainControler extends HttpServlet {
	
	ApplicationContext ctx=null;

	public void init() throws ServletException {
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String type=null;
		StudentDto sdto=null;
		EmployeDto edto=null;
		ICollegeService service=null;
		String target=null;
		String result=null;
		RequestDispatcher rd=null;
		//get Service class Object
		service=ctx.getBean("service",ICollegeService.class);
		//read form type and differntaiate logic
		type=req.getParameter("type");
		if(type.equalsIgnoreCase("student_register")) {
			sdto=ctx.getBean("stuDto",StudentDto.class);
			sdto.setNo(Integer.parseInt(req.getParameter("sid")));
			sdto.setName(req.getParameter("sname"));
			sdto.setM1(Integer.parseInt(req.getParameter("m1")));
			sdto.setM2(Integer.parseInt(req.getParameter("m2")));
			sdto.setM3(Integer.parseInt(req.getParameter("m3")));
			try {
				 result=service.getStudentDetails(sdto);
				req.setAttribute("result",result);
				target="/result.jsp";
			}catch(Exception e) {
				e.printStackTrace();
				target="/error.jsp";
			}//catch
			
		}//if
		else {
			edto=ctx.getBean("empDto",EmployeDto.class);
			edto.setNo(Integer.parseInt(req.getParameter("eid")));
			edto.setName(req.getParameter("ename"));
			edto.setComp(req.getParameter("ecomp"));
			edto.setTotalSallary(Float.parseFloat(req.getParameter("esal")));
			
			try {
				result=service.getEmployeDetails(edto);
				req.setAttribute("result", result);
				target="/result.jsp";
			}catch(Exception e) {
				e.printStackTrace();
				target="/error.jsp";
			}//catch
			
		}//else
		rd=req.getRequestDispatcher(target);
		rd.forward(req, res);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}

}
