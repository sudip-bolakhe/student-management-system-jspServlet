package com.sudip.std.dao;

import java.util.List;

import com.sudip.std.dto.UserDto;

public interface UserDao {

	public boolean saveUserData(UserDto userDto);

	public List<UserDto> getAllUserData();

	public void deleteUserData(int u_id);

	public void getUserDataById(int u_id);

	public boolean updateUserData(UserDto userDto, int u_id);

	public UserDto getUserByUserNameAndPassword(String username, String password);

	public UserDto getPasswordByEmail(String email);

	public UserDto getPasswordByPassword(String pwd);

}
