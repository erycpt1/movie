package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Comment;
import com.example.demo.mapper.CommentMapper;

@Service
public class CommentService implements CommentMapper{
	@Autowired
	private CommentMapper commentMapper;
	
	@Override
	public int addComment(Comment comment) {
		// TODO 自動生成されたメソッド・スタブ
		return commentMapper.addComment(comment);
	}

	@Override
	public int delComment(int conId) {
		// TODO 自動生成されたメソッド・スタブ
		return commentMapper.delComment(conId);
	}

	@Override
	public int updateComment(Comment comment) {
		// TODO 自動生成されたメソッド・スタブ
		return commentMapper.updateComment(comment);
	}

	@Override
	public List<Comment> queryAllCommentByuId(int uId) {
		// TODO 自動生成されたメソッド・スタブ
		return commentMapper.queryAllCommentByuId(uId);
	}

	@Override
	public List<Comment> queryAllCommentBymId(int mId) {
		// TODO 自動生成されたメソッド・スタブ
		return commentMapper.queryAllCommentBymId(mId);
	}

	@Override
	public Comment queryComment(Comment comment) {
		// TODO 自動生成されたメソッド・スタブ
		return commentMapper.queryComment(comment);
	}

}
