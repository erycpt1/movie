package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.Session;

@Mapper
public interface SessionMapper {
	public boolean addSession(Session session );
	public boolean delSession(int sId);
	public boolean updateSession(Session session);
	public List<Session> queryAllSession();
	public Session querySessionById(int sId);
	public List<Session> querySessionByMid(int mId);
	public List<Session> querySessionByHid(int hId);
	public List<Session> querySessionByCid(int cId);
	public Session querySession(Session session);
	public List<Session> querySessionBycIdandmId(int cId,int mId);
}
