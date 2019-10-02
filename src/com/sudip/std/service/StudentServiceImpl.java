package com.sudip.std.service;

import java.util.List;

import com.sudip.std.dao.StudentDao;
import com.sudip.std.dao.StudentDaoImpl;
import com.sudip.std.dto.StudentDto;

public class StudentServiceImpl implements StudentService{
	 StudentDao studentDao =new StudentDaoImpl();
	
	@Override
	public void saveStudentInfo(StudentDto studentDto) {
		studentDao.saveStudentInfo(studentDto);
	}

	@Override
	public void updateStudentInfo(StudentDto studentDto) {
		studentDao.updateStudentInfo(studentDto);
	}

	@Override
	public List<StudentDto> getAllStudentInfo() {
		
		return studentDao.getAllStudentInfo();
	}

	@Override
	public void deletDetail(int id) {
		studentDao.deletDetail(id);
	}

	@Override
	public StudentDto getStudentBy(int id) {
		return studentDao.getStudentBy(id);
	}

}
