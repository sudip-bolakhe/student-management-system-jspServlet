package com.sudip.std.service;

import java.util.List;

import com.sudip.std.dto.StudentDto;

public interface StudentService {
	public void saveStudentInfo(StudentDto studentDto);

	public void updateStudentInfo(StudentDto studentDto);

	public List<StudentDto> getAllStudentInfo();

	public void deletDetail(int id);

	public StudentDto getStudentBy(int id);
}
