package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.User;

@Mapper
public interface UserMapper {
	public boolean addUser(User user);
	public boolean delUser(int uid);
	public boolean updateUser(User user);
	public boolean updateUserPass(User user ,String pass);
	public User queryUser(User user);
	public User queryUserByName(String uName);
	public User queryUserByid(int uid);
}
