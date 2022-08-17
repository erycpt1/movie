package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Hall;
import com.example.demo.mapper.HallMapper;

@Service
public class HallService implements HallMapper{
	@Autowired
	private HallMapper hallMapper;

	@Override
	public int addHall(Hall hall) {
		// TODO 自動生成されたメソッド・スタブ
		return hallMapper.addHall(hall);
	}

	@Override
	public int delHall(int hId) {
		// TODO 自動生成されたメソッド・スタブ
		return hallMapper.delHall(hId);
	}

	@Override
	public int updateHall(Hall hall) {
		// TODO 自動生成されたメソッド・スタブ
		return hallMapper.updateHall(hall);
	}

	@Override
	public List<Hall> queryAllHall() {
		// TODO 自動生成されたメソッド・スタブ
		return hallMapper.queryAllHall();
	}

	@Override
	public Hall queryHallById(int hId) {
		// TODO 自動生成されたメソッド・スタブ
		return hallMapper.queryHallById(hId);
	}

	@Override
	public List<Hall> queryAllHallcId(int cId) {
		// TODO 自動生成されたメソッド・スタブ
		return hallMapper.queryAllHallcId(cId);
	}

	@Override
	public Hall queryHall(Hall hall) {
		// TODO 自動生成されたメソッド・スタブ
		return hallMapper.queryHall(hall);
	}

}
