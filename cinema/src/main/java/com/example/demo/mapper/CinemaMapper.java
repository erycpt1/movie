package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.Cinema;

@Mapper
public interface CinemaMapper {
	public boolean addCinema(Cinema cinema);
	public boolean delCinema(int cId);
	public boolean updateCinema(Cinema cinema);
	public List<Cinema> queryAllCinema();
	public Cinema queryCinemaById(int cId);
	public List<Cinema> queryCinemaByCinemaName(String cName);
	public List<Cinema> queryCinemaByCinemaAddress(String cAddress);
	public List<Cinema> queryCinemaByCinemaNameAndCinemaAddress(String cName,String cAddress);
	public Cinema queryCinema(Cinema cinema);
}
