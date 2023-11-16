package com.ssafy.bicycle.dto;

import java.security.Timestamp;

public class User {
	private String user_id;
	private String user_pw;
	private String user_name;
	private String user_birth;
	private String user_grade;
	private String user_boardCnt;
	private String user_CommentCnt;
	private Timestamp user_joinDate;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String user_id, String user_pw, String user_name, String user_birth, String user_grade,
			String user_boardCnt, String user_CommentCnt, Timestamp user_joinDate) {
		super();
		this.user_id = user_id;
		this.user_pw = user_pw;
		this.user_name = user_name;
		this.user_birth = user_birth;
		this.user_grade = user_grade;
		this.user_boardCnt = user_boardCnt;
		this.user_CommentCnt = user_CommentCnt;
		this.user_joinDate = user_joinDate;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_pw() {
		return user_pw;
	}

	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_birth() {
		return user_birth;
	}

	public void setUser_birth(String user_birth) {
		this.user_birth = user_birth;
	}

	public String getUser_grade() {
		return user_grade;
	}

	public void setUser_grade(String user_grade) {
		this.user_grade = user_grade;
	}

	public String getUser_boardCnt() {
		return user_boardCnt;
	}

	public void setUser_boardCnt(String user_boardCnt) {
		this.user_boardCnt = user_boardCnt;
	}

	public String getUser_CommentCnt() {
		return user_CommentCnt;
	}

	public void setUser_CommentCnt(String user_CommentCnt) {
		this.user_CommentCnt = user_CommentCnt;
	}

	public Timestamp getUser_joinDate() {
		return user_joinDate;
	}

	public void setUser_joinDate(Timestamp user_joinDate) {
		this.user_joinDate = user_joinDate;
	}
	
}
