package com.sudip.std.service;

import java.util.List;

import com.sudip.std.dao.UserDao;
import com.sudip.std.dao.UserDaoImpl;
import com.sudip.std.dto.UserDto;

public class UserServiceImpl implements UserService {
UserDao userdao=new UserDaoImpl();
	@Override
	public boolean saveUserData(UserDto userDto) {
		return userdao.saveUserData(userDto);
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
		return false;
	}

	@Override
	public UserDto getUserByUserNameAndPassword(String username, String password) {
		return null;
	}

	@Override
	public UserDto getPasswordByEmail(String email) {
		return null;
	}

	@Override
	public UserDto getPasswordByPassword(String pwd) {
		return null;
	}

	
}
