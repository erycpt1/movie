package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Ticket;
import com.example.demo.mapper.TicketMapper;

@Service
public class TicketService implements TicketMapper{
	@Autowired
	private TicketMapper ticketMapper;

	@Override
	public int addTicket(Ticket ticket) {
		// TODO 自動生成されたメソッド・スタブ
		return ticketMapper.addTicket(ticket);
	}

	@Override
	public int delTicket(int tId) {
		// TODO 自動生成されたメソッド・スタブ
		return ticketMapper.delTicket(tId);
	}

	@Override
	public List<Ticket> queryAllTicket() {
		// TODO 自動生成されたメソッド・スタブ
		return ticketMapper.queryAllTicket();
	}

	@Override
	public List<Ticket> queryAllTicketsId(int sId) {
		// TODO 自動生成されたメソッド・スタブ
		return ticketMapper.queryAllTicketsId(sId);
	}

	@Override
	public List<Ticket> queryAllTicketuId(int uId) {
		// TODO 自動生成されたメソッド・スタブ
		return ticketMapper.queryAllTicketuId(uId);
	}
	
}
