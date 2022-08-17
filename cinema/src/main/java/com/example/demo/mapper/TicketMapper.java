package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.Ticket;

@Mapper
public interface TicketMapper {
	public int addTicket(Ticket ticket);
    public int delTicket(int tId);
    public List<Ticket> queryAllTicket();
    public List<Ticket> queryAllTicketsId(int sId);
    public List<Ticket> queryAllTicketuId(int uId);
}
