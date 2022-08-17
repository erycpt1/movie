package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Cinema;
import com.example.demo.mapper.CinemaMapper;

@Service
public class CinemaService implements CinemaMapper{
	@Autowired
	private CinemaMapper cinemaMapper;

	@Override
	public int addCinema(Cinema cinema) {
		// TODO 自動生成されたメソッド・スタブ
		return cinemaMapper.addCinema(cinema);
	}

	@Override
	public int delCinema(int cId) {
		// TODO 自動生成されたメソッド・スタブ
		return cinemaMapper.delCinema(cId);
	}

	@Override
	public int updateCinema(Cinema cinema) {
		// TODO 自動生成されたメソッド・スタブ
		return cinemaMapper.updateCinema(cinema);
	}

	@Override
	public List<Cinema> queryAllCinema() {
		// TODO 自動生成されたメソッド・スタブ
		return cinemaMapper.queryAllCinema();
	}

	@Override
	public Cinema queryCinemaById(int cId) {
		// TODO 自動生成されたメソッド・スタブ
		return cinemaMapper.queryCinemaById(cId);
	}

	@Override
	public List<Cinema> queryCinemaByCinemaName(String cName) {
		// TODO 自動生成されたメソッド・スタブ
		return queryCinemaByCinemaName(cName);
	}

	@Override
	public List<Cinema> queryCinemaByCinemaAddress(String cAddress) {
		// TODO 自動生成されたメソッド・スタブ
		return cinemaMapper.queryCinemaByCinemaAddress(cAddress);
	}

	@Override
	public List<Cinema> queryCinemaByCinemaNameAndCinemaAddress(String cName, String cAddress) {
		// TODO 自動生成されたメソッド・スタブ
		return cinemaMapper.queryCinemaByCinemaNameAndCinemaAddress(cName, cAddress);
	}

	@Override
	public Cinema queryCinema(Cinema cinema) {
		// TODO 自動生成されたメソッド・スタブ
		return queryCinema(cinema);
	}
}
