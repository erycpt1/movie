package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Session;
import com.example.demo.mapper.SessionMapper;

@Service
public class SessionService implements SessionMapper{
	@Autowired
	private SessionMapper sessionMapper;

	@Override
	public int addSession(Session session) {
		// TODO 自動生成されたメソッド・スタブ
		return sessionMapper.addSession(session);
	}

	@Override
	public int delSession(int sId) {
		// TODO 自動生成されたメソッド・スタブ
		return sessionMapper.delSession(sId);
	}

	@Override
	public int updateSession(Session session) {
		// TODO 自動生成されたメソッド・スタブ
		return sessionMapper.updateSession(session);
	}

	@Override
	public List<Session> queryAllSession() {
		// TODO 自動生成されたメソッド・スタブ
		return sessionMapper.queryAllSession();
	}

	@Override
	public Session querySessionById(int sId) {
		// TODO 自動生成されたメソッド・スタブ
		return sessionMapper.querySessionById(sId);
	}

	@Override
	public List<Session> querySessionByMid(int mId) {
		// TODO 自動生成されたメソッド・スタブ
		return sessionMapper.querySessionByMid(mId);
	}

	@Override
	public List<Session> querySessionByHid(int hId) {
		// TODO 自動生成されたメソッド・スタブ
		return sessionMapper.querySessionByHid(hId);
	}

	@Override
	public List<Session> querySessionByCid(int cId) {
		// TODO 自動生成されたメソッド・スタブ
		return sessionMapper.querySessionByCid(cId);
	}

	@Override
	public Session querySession(Session session) {
		// TODO 自動生成されたメソッド・スタブ
		return sessionMapper.querySession(session);
	}

	@Override
	public List<Session> querySessionBycIdandmId(int cId, int mId) {
		// TODO 自動生成されたメソッド・スタブ
		return sessionMapper.querySessionBycIdandmId(cId, mId);
	}
}
