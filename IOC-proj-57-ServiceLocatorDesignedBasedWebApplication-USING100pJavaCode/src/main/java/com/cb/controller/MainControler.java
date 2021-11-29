package com.cb.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cb.service.IiplService;
import com.nt.config.AppConfig;
@WebServlet("/controler")
public class MainControler extends HttpServlet {
	
	ApplicationContext ctx=null;

	public void init() throws ServletException {
		ctx=new AnnotationConfigApplicationContext(AppConfig.class);
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		IiplService serv=null;
		RequestDispatcher rd=null;
		int mid=0;
		String score=null;
		//read Request Parameter value
		mid=Integer.parseInt(req.getParameter("mid"));
		serv=ctx.getBean("service",IiplService.class);
		score=serv.getScore(mid);
		req.setAttribute("result", score);
		rd=req.getRequestDispatcher("/result.jsp");
		rd.forward(req, res);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}

}
