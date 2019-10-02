package com.sudip.std.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.sudip.std.dto.UserDto;
import com.sudip.std.utl.DbUtil;
import com.sudip.std.utl.QueryUtil;

public class UserDaoImpl implements UserDao {
	PreparedStatement ps=null;
	@Override
	public boolean saveUserData(UserDto userDto) {
		int savedUser=0;
		try {
			ps=DbUtil.getConnection().prepareStatement(QueryUtil.SAVE_USER_INFO);
			ps.setString(1, userDto.getFirstName());
			ps.setString(2, userDto.getLastName());
			ps.setString(3, userDto.getEmail());
			ps.setDate(4, new java.sql.Date(userDto.getDob().getTime()));
			ps.setString(5, userDto.getUserName());
			ps.setString(6, userDto.getPassword());
			savedUser=ps.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
			DbUtil.closeAll(ps);
		}
		if(savedUser>1)
			return true;
		return false;
	}

	@Override
	public List<UserDto> getAllUserData() {
		return null;
	}

	@Override
	public void deleteUserData(int u_id) {
		
	}

	@Override
	public void getUserDataById(int u_id) {
		
	}

	@Override
	public boolean updateUserData(UserDto userDto, int u_id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserDto getUserByUserNameAndPassword(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto getPasswordByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto getPasswordByPassword(String pwd) {
		// TODO Auto-generated method stub
		return null;
	}

}
