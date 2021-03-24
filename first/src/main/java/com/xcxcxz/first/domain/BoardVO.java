package com.xcxcxz.first.domain;

import java.sql.Timestamp;

import org.apache.ibatis.type.Alias;

@Alias("BoardVO")
public class BoardVO {
	private int seq;
	private String title;
	private String content;
	private String writer;
	private String password;
	private Timestamp regDate;
	private int cnt;
	
	public BoardVO() {}
	
	public BoardVO(String title, String content, String writer, String password) {
		super();
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.password = password;
		this.cnt = 0;
		
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Timestamp getRegDate() {
		return regDate;
	}

	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	

}
