package com.ddu.ch13.part01;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class LinedListTest {

	public static void main(String[] args) {
		
		List<Board> list1 = new ArrayList<>();
		List<Board> list2 = new LinkedList<>();
		Date nowDate = new Date(); 
		Board board = new Board("강감찬", "안녕하세요.", "안녕하세요. 첫 글입니다.", new Timestamp(nowDate.getTime()));
		
		long startTime; // 작업 시작 시간
		long endTime; // 작업 종료 시간
		
		//Array 작업시간 측정
		startTime = System.nanoTime();
		for (int i = 0; i <10000; i++) { // 10000번 객체 삽입
			list1.add(board);
		}
		endTime = System.nanoTime();
		System.out.println("Array 작업 시간 : " + (endTime - startTime));

		//linked 작업시간 측정
		startTime = System.nanoTime();
		for (int i = 0; i <10000; i++) { // 10000번 객체 삽입
			list2.add(board);
		}
		endTime = System.nanoTime();
		System.out.println("linked 작업 시간 : " + (endTime - startTime));
	}

}
