package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.Comment;
/**
 * 评论
 * @author nxw_z
 */
@Mapper
public interface CommentMapper {
	/**
	 * 新增评论
	 * @param comment
	 * @return
	 */
	public int addComment(Comment comment);
	/**
	 * 删除评论
	 * @param conId
	 * @return
	 */
	public int delComment(int conId);
	/**
	 * 修改评论
	 * @param comment
	 * @return
	 */
	public int updateComment(Comment comment);
	/**
	 * 根据id查询评论
	 * @param uId 用户id
	 * @return
	 */
	public List<Comment> queryAllCommentByuId(int uId);
	/**
	 * 根据id查询评论
	 * @param mId 电影id
	 * @return
	 */
	public List<Comment> queryAllCommentBymId(int mId);
	/**
	 * 查询所有评论
	 * @param comment
	 * @return
	 */
	public Comment queryComment(Comment comment);
}
