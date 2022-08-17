package com.example.demo.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable{
	private int uId;
    private String uName;
    private String uPwd;
    private double balance;
    private int uType;
}
