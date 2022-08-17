package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Movie;
import com.example.demo.mapper.MovieMapper;

@Service
public class MovieService implements MovieMapper{
	@Autowired
	private MovieMapper movieMapper;
	
	@Override
	public int addMovie(Movie movie) {
		// TODO 自動生成されたメソッド・スタブ
		return movieMapper.addMovie(movie);
	}

	@Override
	public int delMovie(int mid) {
		// TODO 自動生成されたメソッド・スタブ
		return movieMapper.delMovie(mid);
	}

	@Override
	public int updateMovie(Movie movie) {
		// TODO 自動生成されたメソッド・スタブ
		return movieMapper.updateMovie(movie);
	}

	@Override
	public List<Movie> queryAllMovie() {
		// TODO 自動生成されたメソッド・スタブ
		return movieMapper.queryAllMovie();
	}

	@Override
	public Movie queryMovieById(int mId) {
		// TODO 自動生成されたメソッド・スタブ
		return movieMapper.queryMovieById(mId);
	}

	@Override
	public List<Movie> OrderMovieTen() {
		// TODO 自動生成されたメソッド・スタブ
		return movieMapper.OrderMovieTen();
	}
	
	@Override
	public List<Movie> queryMovieByType(String mType) {
		// TODO 自動生成されたメソッド・スタブ
		return movieMapper.queryMovieByType(mType);
	}

	@Override
	public List<Movie> queryMovieByMovieName(String mName) {
		// TODO 自動生成されたメソッド・スタブ
		return movieMapper.queryMovieByMovieName(mName);
	}

	@Override
	public Movie queryMovie(Movie movie) {
		// TODO 自動生成されたメソッド・スタブ
		return movieMapper.queryMovie(movie);
	}

	@Override
	public List<Movie> queryMovieByTypeandName(String mType, String mName) {
		// TODO 自動生成されたメソッド・スタブ
		return movieMapper.queryMovieByTypeandName(mType, mName);
	}

	@Override
	public Movie queryMovieByName(String mName) {
		// TODO 自動生成されたメソッド・スタブ
		return movieMapper.queryMovieByName(mName);
	}
	
}
