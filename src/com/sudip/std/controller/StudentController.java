package com.sudip.std.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sudip.std.dto.StudentDto;
import com.sudip.std.service.StudentService;
import com.sudip.std.service.StudentServiceImpl;

@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	StudentService studentService = new StudentServiceImpl();
	private static final String STUDENT_LIST_PAGE="studentList.jsp";
	private static final String CREATE_PAGE="RegistrationForm.jsp";
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String forward = "";
		String action = request.getParameter("actions");
		if (action.equalsIgnoreCase("student_list")) {
			forward =STUDENT_LIST_PAGE ;
			request.setAttribute("students", studentService.getAllStudentInfo());
		} else if (action.equalsIgnoreCase("delet")) {
			forward = STUDENT_LIST_PAGE;
			int id = Integer.parseInt(request.getParameter("id"));
			studentService.deletDetail(id);
			request.setAttribute("student", studentService.getAllStudentInfo());
		} else if (action.equalsIgnoreCase("edit")) {
			forward = CREATE_PAGE;
			int id = Integer.parseInt(request.getParameter("id"));
			request.setAttribute("student", studentService.getStudentBy(id));
		} else if (action.equalsIgnoreCase("add_new")) {
			forward = CREATE_PAGE;
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(forward);
		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		StudentDto studentDto = new StudentDto();

		studentDto.setName(request.getParameter("name"));
		studentDto.setPassword(request.getParameter("pass"));
		studentDto.setAddress(request.getParameter("address"));
		studentDto.setEmail(request.getParameter("email"));
		studentDto.setPhone(Integer.parseInt(request.getParameter("phone")));
		studentDto.setGender(request.getParameter("gender"));
		studentDto.setCountry(request.getParameter("country"));
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
		try {
			Date dobs = dateFormat.parse(request.getParameter("dob"));
			studentDto.setDob(dobs);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		studentDto.setCountry(request.getParameter("country"));

		String studentId = request.getParameter("id");
		if (studentId == null || studentId.isEmpty()) {
			studentService.saveStudentInfo(studentDto);
		} else {
			int id = Integer.parseInt(studentId);
			studentDto.setId(id);
			studentService.updateStudentInfo(studentDto);
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("studentList.jsp");
		request.setAttribute("students", studentService.getAllStudentInfo());
		dispatcher.forward(request, response);
	}

}
