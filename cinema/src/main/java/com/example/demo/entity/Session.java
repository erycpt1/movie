package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Session implements Serializable{
	int sId;
	int hId;
	int cId;
	int mId;
	Date beginTime;
	double price;
	int remain;
}
