package com.ddu.ch13.part01;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BoardListTest {

	public static void main(String[] args) {

		List<Board> boardList = new ArrayList<>();
		Date nowDate = new Date(); // 현재 오늘 날짜 시간
		
		Board board1 = new Board();
		board1.setWriter("홍길동");
		board1.setSubject("안녕하세요");
		board1.setContent("가입인사 드립니다. 반갑습니다");
		board1.setDate(new Timestamp(nowDate.getTime()));
		
		boardList.add(board1);
		
		boardList.add(new Board("이순신", "저는 이순신 입니다.", "저는 조선의 해군 장군입니다.", new Timestamp(nowDate.getTime())));
		
		Board board2 = new Board("김유신", "저는 김유신입니다.", "저는 신라의 장군입니다.", new Timestamp(nowDate.getTime()));
		boardList.add(board2);
		
		System.out.println("      제 목      /        글내용      / 글쓴이 /       글쓴 날짜      ");
		System.out.println("----------------------------------------------------------------");
		for (int i = 0; i < boardList.size(); i++) { // ArrayList 의 길이는 size
			Board board = boardList.get(i);
			// 리스트의 인덱스 넘버를 가져옴
			System.out.println(board.getSubject() +" / "+ board.getContent() +" / "+ board.getWriter() +" / "+ board.getDate());
		}
	}

}
