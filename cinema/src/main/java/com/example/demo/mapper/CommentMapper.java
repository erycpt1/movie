package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.Comment;

@Mapper
public interface CommentMapper {
	public boolean addComment(Comment comment);
	public boolean delComment(int conId);
	public boolean updateComment(Comment comment);
	public List<Comment> queryAllCommentByuId(int uId);
	public List<Comment> queryAllCommentBymId(int mId);
	public Comment queryComment(Comment comment);
}
