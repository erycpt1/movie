package com.example.demo.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie implements Serializable{
	private int mId;
	private String mName;//电影名
	private String mlanguage;//语言
	private String mlocality;//地区
	private String mPicaddress;//海报地址
	private String mDetail;//详情
	private int mDuration;// 时长
	private String mType;// 类型
    private double mGrade;//评分
}
