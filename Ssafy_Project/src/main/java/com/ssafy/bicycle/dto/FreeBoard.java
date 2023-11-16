package com.ssafy.bicycle.dto;

import java.security.Timestamp;

/**
 * @author SSAFY
 *
 */
public class FreeBoard {
	private String fb_userId;
	private String fb_title;
	private String fb_writer;
	private String fb_content;
	private int fb_viewCnt;
	private int fb_rcm;
	private Timestamp fb_regDate;
	
	public FreeBoard() {
		// TODO Auto-generated constructor stub
	}

	public FreeBoard(String fb_userId, String fb_title, String fb_writer, String fb_content, int fb_viewCnt,
			int fb_rcm, Timestamp fb_regDate) {
		super();
		this.fb_userId = fb_userId;
		this.fb_title = fb_title;
		this.fb_writer = fb_writer;
		this.fb_content = fb_content;
		this.fb_viewCnt = fb_viewCnt;
		this.fb_rcm = fb_rcm;
		this.fb_regDate = fb_regDate;
	}

	public String getFb_userId() {
		return fb_userId;
	}

	public void setFb_userId(String fb_userId) {
		this.fb_userId = fb_userId;
	}

	public String getFb_title() {
		return fb_title;
	}

	public void setFb_title(String fb_title) {
		this.fb_title = fb_title;
	}

	public String getFb_writer() {
		return fb_writer;
	}

	public void setFb_writer(String fb_writer) {
		this.fb_writer = fb_writer;
	}

	public String getFb_content() {
		return fb_content;
	}

	public void setFb_content(String fb_content) {
		this.fb_content = fb_content;
	}

	public int getFb_viewCnt() {
		return fb_viewCnt;
	}

	public void setFb_viewCnt(int fb_viewCnt) {
		this.fb_viewCnt = fb_viewCnt;
	}

	public int getFb_rcm() {
		return fb_rcm;
	}

	public void setFb_rcm(int fb_rcm) {
		this.fb_rcm = fb_rcm;
	}

	public Timestamp getFb_regDate() {
		return fb_regDate;
	}

	public void setFb_regDate(Timestamp fb_regDate) {
		this.fb_regDate = fb_regDate;
	}
	
}
