package com.sudip.std.utl;

public class QueryUtil {
	public static final String SAVE_STUDENT_INFO = "insert into student_data(name,password,address,email,dob,phone,gender,country)values(?,?,?,?,?,?,?,?)";
	public static final String VIEW_STUDENT = "select * from student_data";
	public static final String DELETE_STUDENT = " delete from student_data where id=?";
	public static final String UPDATE_STUDENT = "update  student_data set name=?,password=?,address=?,email=?,dob=?,phone=?,gender=?,country=? where id=?";
	public static final String STUDENT_BY_ID = "select * from student_data where id=?";
//////////////////////user Query/////////////////
	public static final String SAVE_USER_INFO ="insert into user_data(first-name,last_name,email,dob,username,password) values(?,?,?,?,?,?)";
}
