package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.Hall;

@Mapper
public interface HallMapper {
	public boolean addHall(Hall hall);
	public boolean delHall(int hId);
	public boolean updateHall(Hall hall);
	public List<Hall> queryAllHall();
	public Hall queryHallById(int hId);
	public List<Hall> queryAllHallcId(int cId);
	public Hall queryHall(Hall hall);
}
