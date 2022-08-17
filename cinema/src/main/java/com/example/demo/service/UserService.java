package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;

@Service
public class UserService implements UserMapper{
	@Autowired
	private UserMapper userMapper;

	@Override
	public int addUser(User user) {
		// TODO 自動生成されたメソッド・スタブ
		return userMapper.addUser(user);
	}

	@Override
	public int delUser(int uid) {
		// TODO 自動生成されたメソッド・スタブ
		return userMapper.delUser(uid);
	}

	@Override
	public int updateUser(User user) {
		// TODO 自動生成されたメソッド・スタブ
		return userMapper.updateUser(user);
	}

	@Override
	public int updateUserPwd(User user, String pass) {
		// TODO 自動生成されたメソッド・スタブ
		return userMapper.updateUserPwd(user, pass);
	}

	@Override
	public User queryUser(User user) {
		// TODO 自動生成されたメソッド・スタブ
		return userMapper.queryUser(user);
	}

	@Override
	public User queryUserByName(String uName) {
		// TODO 自動生成されたメソッド・スタブ
		return userMapper.queryUserByName(uName);
	}

	@Override
	public User queryUserByid(int uid) {
		// TODO 自動生成されたメソッド・スタブ
		return userMapper.queryUserByid(uid);
	}
}
