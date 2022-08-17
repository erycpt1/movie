package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.Cinema;


/**
 * 电影院
 * @author nxw_z
 *
 */
@Mapper
public interface CinemaMapper {
	/**
	 * 电影院添加
	 * @param cinema 电影院
	 * @return
	 */
	public int addCinema(Cinema cinema);
	/**
	 * 电影院删除
	 * @param cId id
	 * @return
	 */
	public int delCinema(int cId);
	/**
	 * 电影院修改
	 * @param cinema 电影院
	 * @return
	 */
	public int updateCinema(Cinema cinema);
	/**
	 * 查询所有的电影院
	 * @return
	 */
	public List<Cinema> queryAllCinema();
	/**
	 * 根据id查询电影院
	 * @param cId id
	 * @return
	 */
	public Cinema queryCinemaById(int cId);
	/**
	 * 根据名字查询电影院
	 * @param cName 名字
	 * @return
	 */
	public List<Cinema> queryCinemaByCinemaName(String cName);
	/**
	 * 根据地址查询电影院
	 * @param cAddress 地址
	 * @return
	 */
	public List<Cinema> queryCinemaByCinemaAddress(String cAddress);
	/**
	 * 根据名字和地址查询电影院
	 * @param cName    名字
	 * @param cAddress 地址
	 * @return
	 */
	public List<Cinema> queryCinemaByCinemaNameAndCinemaAddress(String cName,String cAddress);
	/**
	 * 查询所有电影院名字
	 */
	public Cinema queryCinema(Cinema cinema);
}
