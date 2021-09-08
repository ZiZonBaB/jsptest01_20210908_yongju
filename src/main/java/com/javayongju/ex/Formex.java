package com.javayongju.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Formex
 */
@WebServlet(urlPatterns={"/Formex"},initParams= {@WebInitParam(name="job1",value="학생")})
public class Formex extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Formex() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
System.out.println("doPost 메소드가 실행되었습니다.");
		request.setCharacterEncoding("EUC-KR");
	String name = request.getParameter("name");
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String mail = request.getParameter("mail");
	String domain = request.getParameter("domain");
	 String job1 = getInitParameter("job1");
	String job = request.getParameter("job");
	
	response.setContentType("text/html; charset=EUC-KR");
	PrintWriter writer = response.getWriter();
	writer.println("<html><head></head><body>");
	writer.println("이름 : "+name+"<br/>");
	writer.println("아이디 : "+id+"<br/>");
	writer.println("비밀번호 : "+pw+"<br/>");
	

	writer.println("E-mail : "+mail+"@"+domain+"<br/>");
	if(job.length()==0) {
		writer.println("직업 : "+job1+"<br/>");
	}
	else
	writer.println("직업 : "+job+"<br/>");

	writer.println("</body></html>");
	
	writer.close();
	
	}

}
