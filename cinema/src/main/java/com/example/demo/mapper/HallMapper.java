package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.Hall;

/**
 * 大厅
 * @author nxw_z
 *
 */
@Mapper
public interface HallMapper {
	/**
	 * 新增大厅
	 * @param hall
	 * @return
	 */
	public int addHall(Hall hall);
	/**
	 * 删除大厅
	 * @param hId
	 * @return
	 */
	public int delHall(int hId);
	/**
	 * 修改大厅
	 * @param hall
	 * @return
	 */
	public int updateHall(Hall hall);
	/**
	 * 查询所有大厅
	 * @return
	 */
	public List<Hall> queryAllHall();
	/**
	 * 根据id查询大厅
	 * @param hId 大厅id
	 * @return
	 */
	public Hall queryHallById(int hId);
	/**
	 * 根据电影院id查询大厅
	 * @param cId 电影院id
	 * @return
	 */
	public List<Hall> queryAllHallcId(int cId);
	/**
	 * 查询所有大厅
	 * @param hall
	 * @return
	 */
	public Hall queryHall(Hall hall);
}
