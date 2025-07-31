package com.ddu.ch13.part01.exam;

import java.util.Iterator;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		BoardDao dao =new BoardDao();
		List<Board> boardList = dao.getBoardDao();
		
		
		Iterator<Board> iterator = boardList.iterator();
		while (iterator.hasNext()) {
			Board board = iterator.next();
			System.out.println(board.getTitle() + "-" + board.getContent());
			
		}
		
//		for (Board board : list) {
//			System.out.println(board.getTitle() + "-" + board.getContent());
//		}
	}

}
