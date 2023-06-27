package com.youtube.impl;

import com.youtube.model.Comment;

// 팀 과제는 이 방식
public interface Commentimpl {
	public void addComment(String id, String password, Comment comment);

	// r : 댓글 1개 보기
	public Comment viewComment(int index);

	// u : 댓글 수정 -- > 로그인한 회원과 이 댓글을 작성한 작성자가 일치
	public void updateComment(int index, Comment comment);

	// d : 댓글 삭제 -- > 로그인한 회원과 이 댓글을 작성한 작성자가 일치
	public void deleteComment(int index);

}
