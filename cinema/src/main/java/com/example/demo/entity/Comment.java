package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment implements Serializable{
	private int conId;
	private int uId;
	private int mId;
	private String comment;
	private Date comtime;
}
