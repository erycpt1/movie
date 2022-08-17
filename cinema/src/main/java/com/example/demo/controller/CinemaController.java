package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Cinema;
import com.example.demo.service.CinemaService;

@RestController
@ResponseBody
public class CinemaController {
	@Autowired
	private CinemaService cinemaService;
	
	@RequestMapping("addCinema")
	public int addCinema(Cinema cinema) {
		return cinemaService.addCinema(new Cinema(cinema.getCId(),"111","11"));
	}
	
	@RequestMapping("delCinema")
	public int delCinema(Integer cId) {
		return cinemaService.delCinema(8);
	}
	
	@RequestMapping("/queryAllCinema")
	public List<Cinema> queryAllCinema() {
		List<Cinema> queryAllCinemas = cinemaService.queryAllCinema();
		for(Cinema queryAllCinema : queryAllCinemas) {
		}
		return queryAllCinemas;
	}
}
