package com.sudip.std.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sudip.std.dto.StudentDto;
import com.sudip.std.utl.DbUtil;
import com.sudip.std.utl.QueryUtil;

public class StudentDaoImpl implements StudentDao{
	PreparedStatement ps=null;

	@Override
	public void saveStudentInfo(StudentDto studentDto) {
		
		try {
			ps= DbUtil.getConnection().prepareStatement(QueryUtil.SAVE_STUDENT_INFO);
			ps.setString(1, studentDto.getName());
			ps.setString(2, studentDto.getPassword());
			ps.setString(3, studentDto.getAddress());
			ps.setString(4, studentDto.getEmail());
			ps.setDate(5, new java.sql.Date(studentDto.getDob().getTime()));
			ps.setInt(6, studentDto.getPhone());
			ps.setString(7, studentDto.getGender());
			ps.setString(8, studentDto.getCountry());
			ps.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateStudentInfo(StudentDto studentDto) {
		try {
			ps= DbUtil.getConnection().prepareStatement(QueryUtil.UPDATE_STUDENT);
			ps.setString(1, studentDto.getName());
			ps.setString(2, studentDto.getPassword());
			ps.setString(3, studentDto.getAddress());
			ps.setString(4, studentDto.getEmail());
			ps.setDate(5, new java.sql.Date(studentDto.getDob().getTime()));
			ps.setInt(6, studentDto.getPhone());
			ps.setString(7, studentDto.getGender());
			ps.setString(8, studentDto.getCountry());
			ps.setInt(9, studentDto.getId());

			ps.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<StudentDto> getAllStudentInfo() {
		List<StudentDto> dtos = new ArrayList<>();
		try {
			ps=DbUtil.getConnection().prepareStatement(QueryUtil.VIEW_STUDENT);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				StudentDto dto = new StudentDto();
				dto.setId(rs.getInt("id"));
				dto.setAddress(rs.getString("address"));
				dto.setCountry(rs.getString("country"));
				dto.setDob(rs.getDate("dob"));
				dto.setEmail(rs.getString("email"));
				dto.setGender(rs.getString("gender"));
				dto.setName(rs.getString("name"));
				dto.setPassword(rs.getString("password"));
				dto.setPhone(rs.getInt("phone"));
				dtos.add(dto);
				
				
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return dtos;
	}
	

	@Override
	public void deletDetail(int id) {
		try {
			ps= DbUtil.getConnection().prepareStatement(QueryUtil.DELETE_STUDENT);
			ps.setInt(1, id);
			ps.executeUpdate();
			
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	

	@Override
	public StudentDto getStudentBy(int id) {
		StudentDto dto = new StudentDto();
		try {
			ps=DbUtil.getConnection().prepareStatement(QueryUtil.STUDENT_BY_ID);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				
				dto.setId(rs.getInt("id"));
				dto.setAddress(rs.getString("address"));
				dto.setCountry(rs.getString("country"));
				dto.setDob(rs.getDate("dob"));
				dto.setEmail(rs.getString("email"));
				dto.setGender(rs.getString("gender"));
				dto.setName(rs.getString("name"));
				dto.setPassword(rs.getString("password"));
				dto.setPhone(rs.getInt("phone"));
				
				
				
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return dto;
	}

}
