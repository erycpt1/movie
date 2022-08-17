package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.Movie;

/**
 * 电影
 * @author nxw_z
 *
 */
@Mapper
public interface MovieMapper {
	/**
	 * 新增电影
	 * @param movie
	 * @return
	 */
	public int addMovie(Movie movie);
	/**
	 * 删除电影
	 * @param mid
	 * @return
	 */
	public int delMovie(int mid);
	/**
	 * 修改电影
	 * @param movie
	 * @return
	 */
	public int updateMovie(Movie movie);
	/**
	 * 查询所有电影
	 * @return
	 */
	public List<Movie> queryAllMovie();
	/**
	 * 根据id查询电影
	 * @param mId
	 * @return
	 */
	public Movie queryMovieById(int mId);
	/**
	 * 根据评分排名前10的电影
	 * @return
	 */
	public List<Movie> OrderMovieTen();
	/**
	 * 根据类型查询电影
	 * @param mType
	 * @return
	 */
	public List<Movie> queryMovieByType(String mType);
	/**
	 * 根据名字模糊查询电影
	 * @param mName
	 * @return
	 */
	public List<Movie> queryMovieByMovieName(String mName);
	/**
	 * 查询所有电影
	 * @param movie
	 * @return
	 */
	public Movie queryMovie(Movie movie);
	/**
	 * 根据名字和类型查询电影
	 * @param mType
	 * @param mName
	 * @return
	 */
	public List<Movie> queryMovieByTypeandName(String mType,String mName);
	/**
	 * 根据名字查询电影
	 * @param mName
	 * @return
	 */
	public Movie queryMovieByName(String mName);
}
