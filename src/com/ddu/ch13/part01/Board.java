package com.ddu.ch13.part01;

import java.sql.Timestamp;

// DTO 클래스(VO 클래스)
// 글 한개를 저장하는 객체 -> 글 한개(글쓴이, 글제목, 글내용, 글쓴날짜)
public class Board {

	private String writer; // 글쓴이
	private String subject; // 글제목
	private String content; // 글내용
	private Timestamp date; // 글쓴날짜
	
	// 생성자 2개 , getter, setter 생성
	public Board() {
		
	}
	public Board(String writer, String subject, String content, Timestamp date) {
		super();
		this.writer = writer;
		this.subject = subject;
		this.content = content;
		this.date = date;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
}
