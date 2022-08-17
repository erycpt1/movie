package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.User;

@Mapper
public interface UserMapper {
	public int addUser(User user);
	public int delUser(int uid);
	public int updateUser(User user);
	public int updateUserPwd(User user ,String pass);
	public User queryUser(User user);
	public User queryUserByName(String uName);
	public User queryUserByid(int uid);
}
